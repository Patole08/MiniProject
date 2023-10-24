package com.miniproject;
import java.sql.*;

public class Connections {
	Connection connection = null;
	public Connection getConnectionDetails(){
		
	try {
					Class.forName("com.mysql.cj.jdbc.Driver");//driver loaded
					connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Tp@tole08");// System connected
					} 
				catch (Exception e) {
					e.printStackTrace();
					}
	return connection;
	}
}


