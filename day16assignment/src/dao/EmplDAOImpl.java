package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.NoRecordFoundException;
import com.exception.SomethingWentWrongException;

import DTO.DeptImpl;
import DTO.EmployeeDTO;
import DTO.EmployeeDTOImpl;


public class EmplDAOImpl implements EmplDAO {

	@Override
	public void addNewEmployee(EmployeeDTO emp) throws SomethingWentWrongException {
		Connection con = null;
		try {
			con = DBUtilies.getConnectionToDatabase();
			String query = "INSERT INTO Employee (empId, ename,address,mobile,deptId) VALUES (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, emp.getEmpId());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getAddress());
			ps.setString(4, emp.getMobile());
			ps.setString(5, emp.getDept().getDid());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Something Went Wrong Unable To Insert");
		} finally {
			try {
				DBUtilies.closeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public List<EmployeeDTO> getAccountDepartmentEmployee() throws NoRecordFoundException,SomethingWentWrongException {
		
		List<EmployeeDTO> list = new ArrayList<>();
		Connection con = null;
		try {
			con = DBUtilies.getConnectionToDatabase();
			String query = "SELECT empId, ename, address, mobile, deptid, dname, location\r\n"
					+ "FROM department d \r\n" + "INNER JOIN employee e \r\n" + "ON d.did = e.deptId \r\n"
					+ "WHERE d.dname = 'Account';\r\n" + "";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			if (DBUtilies.isResultSet(rs)) {
				throw new NoRecordFoundException("No Department found");
			}
			while (rs.next()) {
				list.add(new EmployeeDTOImpl(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						new DeptImpl(rs.getString(5), rs.getString(6), rs.getString(7))));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new SomethingWentWrongException("Oops! Something Went Wrong Unable To Insert");
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
