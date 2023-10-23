package com.miniproject;
import java.sql.*;

public class Connections implements UserOpration {
			public static Connection main(String[] args) throws SQLException{
				Connection connection = null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Driver is Loaded");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Tp@tole08");
					String s = "insert into registration (id,Firstname,LastName,UserName,Password,City,Emailid,MobileNumber ) values(1,'fristname','lastname','username','password','Pune','email', 'mobile')";
					PreparedStatement st = con.prepareStatement(s);
					System.out.println("Data has inserted");
					st.execute();
					con.close();
					
				} 
				catch (Exception e) {
					e.printStackTrace();
					System.out.println(e);
				}
				return connection;

			}
	}


