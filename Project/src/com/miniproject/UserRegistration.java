package com.miniproject;

import java.sql.SQLException;
import java.util.Scanner;

public class UserRegistration extends UserOpration {
	public static void userRegistration() throws SQLException { //Take the input from User for registration

			System.out.println("please fill the below deatils for registration");
			Scanner sc =new Scanner(System.in);
			
			System.out.println("1. Enter the First name");
			String firstname = sc.next();
			
			System.out.println("2. Enter the Last name");
			String lastname = sc.next();
			
			System.out.println("3. Enter the Username");
			String username = sc.next();
			
			System.out.println("4. Enter the Password");
			String password = sc.next();
			
			System.out.println("5. Enter the City");
			String city = sc.next();
			
			System.out.println("6. Enter the Email id:");
			String email = sc.next();
			
			System.out.println("7. Enter the Mobile number");
			String mobile = sc.next();
			userOperation(firstname, lastname, username, password,city,email, mobile);			}
	}

