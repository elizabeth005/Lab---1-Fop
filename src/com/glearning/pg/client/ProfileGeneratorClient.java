package com.glearning.pg.client;

import java.util.Scanner;
import com.glearning.pg.model.Employee;
import com.glearning.pg.service.CredentialService;

public class ProfileGeneratorClient {
	private static int radix;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Plesae enter your option");
		System.out.println("Admin = 0 ");
		System.out.println("HR = 1 ");
		System.out.println("Technical = 2 ");
		System.out.println("Legal = 3 ");

		
		int option = scanner.nextInt();
		
		System.out.println("Enter your firstName");
		String firstName = scanner.next();
		
		System.out.println("Enter your lastName");
		String lastName = scanner.next();
		
		Employee employee = new Employee (firstName, lastName);
		
		switch (option) {
		case 0:
			employee.setDept ("Admin");
			break;
		case 1:
			employee.setDept("HR");
			break;
		case 2:
			employee.setDept ("Techical");
			break;
		case 3:
			employee.setDept ("Legal");
			break;

		
		}
		
		//call the credential service
		String emailAddress = CredentialService.generateEmailAddress(firstName, lastName,employee.getDept());
		employee.setEmailadress(emailAddress);
		System.out.println("Please enter the password length");
		int length =scanner.nextInt(10);
				
		
		String password = CredentialService.generatePassword(length);
		
		employee.setPassword(password);
		
		CredentialService.showCredentials(employee);
		
		
		
		
		//finally close
		scanner.close();
	}

	public static int getRadix() {
		return radix;
	}

	public static void setRadix(int radix) {
		ProfileGeneratorClient.radix = radix;
	}

						
					
			
		}
		
		
		
		
	


