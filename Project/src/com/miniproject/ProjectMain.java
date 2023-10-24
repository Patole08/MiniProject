package com.miniproject;

import java.sql.SQLException;
import java.util.Scanner;

public class ProjectMain extends UserRegistration{ // main class for Defining user or admin access

	public static void main(String[] args) throws SQLException {
		System.out.println("Pleas select User or Admin option");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Select A for User Option select B for Admin Option");
		String a = sc.next();
		userRegistration();
		System.out.println("closde");
		}
		}

