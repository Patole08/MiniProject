package com.velocity;
import java.sql.*;

public class CreateDemo {

	public static void main(String[] args) throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is Loaded");
			Connection con= DriverManager.getConnection("jdbc:mysql;//localhost:3306/test","root","");
			String s = "inster insert into user (LastName,FirstName,address,City,salary) values('naik','jit','chinchwad','Pune',25000)";
			PreparedStatement st = con.prepareStatement(s);
			System.out.println("Daata has inserted");
			st.execute();
			con.close();
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
