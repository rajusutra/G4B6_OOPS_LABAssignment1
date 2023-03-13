package com.gl.gradedproject1.application;
import java.util.Scanner;
import com.gl.gradedproject1.employee.Employee;
import com.gl.gradedproject1.service.CredentialService;

public class Main {

	public static void main(String[] args) {
		
		int choice;
		String department="";	
		Scanner scan1 = new Scanner(System.in);
		while(true) {
		System.out.println("Please select Your Option 1-4 or 0");
		System.out.println("-----Main Menu-----");
		System.out.println("1.Technical Department");
		System.out.println("2.Admin Department");
		System.out.println("3.Human Resources");
		System.out.println("4.Legal Department");
		System.out.println("0.Exit");
		
		choice = scan1.nextInt();
	
		
		switch (choice)
		{
		case 0:	
			scan1.close();
			System.exit(1);
			break;
		case 1:		
			department= "tech";
			break;
		
		case 2:
		
			department= "admin";
			break;
		
		case 3:
		
			department= "human";
			break;
		
		case 4:
		                               
			department= "legal";
			break;
		
		default:
			System.out.println("Select proper Department");
		
		}
			if(choice>=1 && choice<=4)	{
		Employee employee1 = new Employee("Raju", "Sutradhar",department);	
		CredentialService cService = new CredentialService();	
		System.out.println("Dear " +employee1.getFirstName()+" your generated credentials are as follows : ");
		System.out.println("Email: " +employee1.generateEmail());
		System.out.println("Password: "+cService.generatePassword());
			}
	}
		
	}
	
	
}
