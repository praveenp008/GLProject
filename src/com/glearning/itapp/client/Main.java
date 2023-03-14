package com.glearning.itapp.client;

import java.util.Scanner;

import com.glearning.itapp.model.Employee;
import com.glearning.itapp.service.ServiceCredentialsImpl;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your firstname and last name to generate credentails");
		String enterFirstName=sc.nextLine();
		String lastName = sc.nextLine();
		
		Employee employee = new Employee(enterFirstName, lastName);
		employee.setCompany("xyz");
		ServiceCredentialsImpl serviceCredentials = new ServiceCredentialsImpl();
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		// Create the intstance of scanner class
		int option = sc.nextInt();

		switch (option) {
		case 1: {
			String generatedEmail = serviceCredentials.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech", employee.getCompany().toLowerCase());
			String generatedPassword = serviceCredentials.generateCredentials(12);
			employee.setEmail(generatedEmail);
			employee.setPassword(generatedPassword);
			serviceCredentials.displayCredentials(employee);
			break;
		}
		case 2: {
			String generatedEmail = serviceCredentials.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"admin", employee.getCompany().toLowerCase());
			String generatedPassword = serviceCredentials.generateCredentials(12);
			employee.setEmail(generatedEmail);
			employee.setPassword(generatedPassword);
			serviceCredentials.displayCredentials(employee);
			break;
		}
		case 3: {
			String generatedEmail = serviceCredentials.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr", employee.getCompany().toLowerCase());
			String generatedPassword = serviceCredentials.generateCredentials(12);
			employee.setEmail(generatedEmail);
			employee.setPassword(generatedPassword);
			serviceCredentials.displayCredentials(employee);
			break;
		}
		case 4: {
			String generatedEmail = serviceCredentials.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal", employee.getCompany().toLowerCase());
			String generatedPassword = serviceCredentials.generateCredentials(12);
			employee.setEmail(generatedEmail);
			employee.setPassword(generatedPassword);
			serviceCredentials.displayCredentials(employee);
			break;
		}
		default: {
			System.out.println("Enter a valid option");
		}

		}

	}

}
