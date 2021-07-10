package javasummerproject;

import java.util.Scanner;

public class Student {
     private String firstName;
     private String lastName;
     private int gradeYear;
     private String studentID;
     private String courses= "";
     private int tutionBalance=0;
     private static int costOfCourse=5000;
     private static int id=1000;
     
	// constructor prompts user to enter students name and year
	public Student() {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter Student first name : ");
		this.firstName=in.nextLine();
		
		System.out.print("Enter Student last name : ");
		this.lastName=in.nextLine();

	}
	// Set grade year in which students are to be enrolled
	public void setgradeYear(int year) {
	this.gradeYear=year;
	setstudentId();
	}
	
	// generate an id 
	private void setstudentId() {
		//grade level + ID
		id++;
	this.studentID= gradeYear+""+id;
		
	}
	// enroll in courses
	public void enroll(int i) {
		//get inside a loop,user hits 0
		if(i==1) {
			System.out.println("\nThe courses available are:");
			System.out.println("1.HTML  2.DATA STRUCTURE 3.C");
		}
		else if(i==2) {
		System.out.println("\nThe courses available are:");
		System.out.println("1.cpp  2.Java 3.python 4.Javascript 5.IC DESIGN");
		}
		else if(i==3) {
		System.out.println("\nThe courses available are:");
		System.out.println("1.ANDROID DEVELOPMENT 2.Machine learning 3.DATA Science");			
					}
		else if(i==4) {System.out.println("\nThe courses available are:");
		System.out.println("1. 2.Machine learning 3.DATA Science");			
		}
		
		do {	
			System.out.print("\nEnter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q")) {
				courses=courses+"\n"+ course;
				tutionBalance=tutionBalance+costOfCourse;
			}
			else {
				break;
			}
		}while (1 != 0);	
				
	}
	//view balance
	public void viewbalance() {
		System.out.println("Your balance is:"+" RS."+tutionBalance);
		
	}
	
	
	//pay tution
	public void payTution() {
		viewbalance();
		System.out.print("Enter your payment"+"\n");
		Scanner in= new Scanner(System.in);
		int payment=in.nextInt();
		tutionBalance =tutionBalance-payment;	
	System.out.println("Thank you for your payment of  Rs."+ payment);
	viewbalance();
	}
	
	// show status
	public String showInfo() {
		return "Name  :"+firstName+" "+lastName+"\n"+
	            "Year :"+ gradeYear+"\n"+"Student ID : "+studentID+"\n"+
	            "Courses enrolled : "+courses
	             +"\nBalance : Rs."+tutionBalance;
	}

}
