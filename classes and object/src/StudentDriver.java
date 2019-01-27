/* Assignment 1 - Creating Different classes */

import java.util.Scanner;

public class StudentDriver {

	public static void main(String [] args)
	{
		//Declare Variables
		String firstName;
		String lastName;
		Address addr;
		String line1;
		String line2;
		String city;
		String state;
		int pinCode;
		
		Student student;
		// Declare the object and initialize with 
        // predefined standard input object 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student Details");
        
        //Input Name
        System.out.println("Enter First Name:");
        firstName=sc.nextLine();        
        System.out.println("Enter Last Name:");
        lastName = sc.nextLine();
        
       
		//Input Address
		System.out.println("Enter Address:");
		System.out.println("Line 1:");
		line1=sc.nextLine();
		System.out.println("Line 2:");
		line2=sc.nextLine();
		System.out.println("City:");
		city=sc.nextLine();
		System.out.println("State:");
		state=sc.nextLine();
		System.out.println("Pin Code");
		pinCode=sc.nextInt();
		addr = new Address(line1,line2,city,state,pinCode);
			
		student=new Student(firstName, lastName, addr);
			student.display();
		}
		
	}
	
	

