package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.NoRecordFoundException;



import DTO.DeptDTO;
import DTO.DeptImpl;


public class DeptDAOImpl implements DeptDAO {

	@Override
	public void addNewDepart(DeptDTO dept) throws com.exception.SomethingWentWrongException {
		Connection con = null;
		try {
			con = DBUtilies.getConnectionToDatabase();
			String query = "INSERT INTO Department (did,dname,location) VALUES (?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, dept.getDid());
			ps.setString(2, dept.getDname());
			ps.setString(3, dept.getLocation());

			ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new com.exception.SomethingWentWrongException("Oops! Something Went Wrong Unable To Insert");
		} finally {
			try {
				DBUtilies.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<DeptDTO> getDepartByEmployeeLocation()throws NoRecordFoundException,com.exception.SomethingWentWrongException {
		List<DeptDTO> list = new ArrayList<>();
		Connection con = null;
		try {
			con = DBUtilies.getConnectionToDatabase();
			String query = "SELECT *\r\n"
					+ "FROM department\r\n"
					+ "INNER JOIN employee ON department.did = employee.deptid\r\n"
					+ "WHERE employee.address = Mumbai;\r\n"
					+ "";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			if (DBUtilies.isResultSet(rs)) {
				throw new NoRecordFoundException("No Department found");
			}
			while (rs.next()) {
				list.add(new DeptImpl(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new com.exception.SomethingWentWrongException("Oops! Something Went Wrong Unable To Insert");
		} finally {
			try {
				DBUtilies.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return list;
	}

}