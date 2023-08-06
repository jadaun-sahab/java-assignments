package DAO;
import java.sql.*;

import Connection.DBUtils;



public class carimpldao implements cardao{

	@Override
	public void addcars(String car_id, String model_name, int price, int total_seats, String company_id) {
		try {
		Connection conn = DBUtils.connectToDatabase();
		
		PreparedStatement ps = conn.prepareStatement("insert into car values (?,?,?,?,?)");
		
		ps.setString(1,car_id );
		ps.setString(2, model_name);
		ps.setInt(3, price);
		ps.setInt(4, total_seats);
		ps.setString(5, company_id);
		if(ps.executeUpdate()>0) {
			System.out.println("car added successfully");
		}else {
			System.out.println("Something is wrong");
		}
		
	} catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
	
	public String updatecars(String car_id, String model_name, int price, int total_seats, String company_id) {
		String res = "cars not found";
		try {
		Connection conn = DBUtils.connectToDatabase();
		PreparedStatement ps = conn.prepareStatement
("update car set  where car_id=?,where model_name = ?, where total_seats =?, where company_id=?");
		ps.setString(1,car_id );
		ps.setString(2, model_name);
		ps.setInt(3, price);
		ps.setInt(4, total_seats);
		ps.setString(5, company_id);
		if(ps.executeUpdate()>0) {
			res = "cars updated successfully";
		}
		
		}catch (SQLException e) {
		e.printStackTrace();
	}
	return res;
	}
	
	@Override
	public void deletecars() {
		try {
			Connection conn = DBUtils.connectToDatabase();
			PreparedStatement ps = conn.prepareStatement("Truncate table car");
			
			if(ps.executeUpdate()>0) {
				PreparedStatement ps1 = conn.prepareStatement("update car set car_Id = Null");
				if(ps1.executeUpdate()>0) {
					System.out.println("Deleted");
				}else {
				  System.out.println("Not done");
				}
			}else{
				System.out.println("Something is wrong");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void display() {
		Connection conn = null;
		try {
			conn = DBUtils.connectToDatabase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement ps = conn.prepareStatement("select * from car");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

