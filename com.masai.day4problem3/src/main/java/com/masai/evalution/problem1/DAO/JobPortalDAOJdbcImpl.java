package com.masai.evalution.problem1.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.evaluation.problem1.connection.DBUtils;
import com.masai.evalution.problem1.DTO.Applicant;
import com.masai.evalution.problem1.DTO.Applicantimpl;

public class JobPortalDAOJdbcImpl  implements JobPortalDAO{

	
	public Applicant findApplicantById(int id) {
		Applicant ap= null;
		try(Connection conn = DBUtils.connectToDatabase()) {
			PreparedStatement ps = conn.prepareStatement("select * from Applicant where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String email= rs.getString("email");
				String address = rs.getString("address");
				String mobNo = rs.getString("mobNo");
				String category=rs.getString("category");
				int experience= rs.getInt("experience");
				ap = new Applicantimpl(id,email,address,mobNo,category,experience);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return ap;
	}

	public String saveApplicant(Applicant applicant) {
		String ap = "something went wrong";
		try(Connection conn = DBUtils.connectToDatabase()) {
			PreparedStatement ps = conn.prepareStatement("insert into Applicant (email,address,mobNo,category,experience) values (?,?,?,?,?)");
		
			ps.setString(1, applicant.getEmail());
			ps.setString(2, applicant.getAddress());
			ps.setString(3, applicant.getMobNo());
			ps.setString(4, applicant.getCategory());
			ps.setInt(5, applicant.getExperience());
				if(ps.executeLargeUpdate()>0) {
					
				ap = "done";
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return ap;
		
	}

	public String deleteApplicantById(int id) {
		
		String ap = "something went wrong";
		try(Connection conn = DBUtils.connectToDatabase()) {
			PreparedStatement ps = conn.prepareStatement("delete from Applicant where id =? ");
			ps.setInt(1, id);
			if(ps.executeLargeUpdate()>0) {
					
				ap = "Deleted successfully";
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return ap;
	}

	public String updateApplicantExperience(int id, int experience) {
		String ap = "Something is wrong...!";
		try (Connection conn = DBUtils.connectToDatabase()){
			PreparedStatement ps = conn.prepareStatement("Update Applicant SET experience = ? where id = ?");
			ps.setInt(1, experience);
			ps.setInt(2, id);
			if(ps.executeUpdate()>0) {	
				ap = "Updated Successfully";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ap;
	}
}
