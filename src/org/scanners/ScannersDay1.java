package org.scanners;

import java.util.Scanner;

public class ScannersDay1 {
		
	public static void main(String[] args) {
//		Scanner S=new Scanner(System.in);
//		System.out.println(" Enter the empId");
//		int id = S.nextInt();
//		System.out.println(" EmpId is "+id);
//		System.out.println(" Enter the empName");
//		String name = S.next();
//		System.out.println(" Empname is "+name);
//		System.out.println(" Enter the empPhoneno");
//		long phno = S.nextLong();
//		System.out.println(" empPhoneno is "+phno);
//		System.out.println(" Enter the empSalary");
//	    float Salary = S.nextFloat();
//		System.out.println(" empSalary is "+Salary);
//		System.out.println(" Enter the empGender");
//		char Gender = S.next().charAt(0);
//		System.out.println(" empGender is "+Gender);
//		System.out.println(" Enter the empCity");
//		String city = S.next();
//		System.out.println(" empCity is "+city);
	
	Scanner A =new Scanner(System.in);
	System.out.println("Enter the studentId");
	int Id = A.nextInt();
	System.out.println("student id is "+Id);
	System.out.println("Enter student Name");
	String name = A.next();
	System.out.println("student Name is "+name);
	System.out.println("Enter Mark 1");
	int mark1 = A.nextInt();
	System.out.println("Mark1 is "+mark1);
	System.out.println("Enter Mark 2");
	int mark2 = A.nextInt();
	System.out.println("Mark1 is "+mark2);
	System.out.println("Enter Mark 3");
	int mark3 = A.nextInt();
	System.out.println("Mark1 is "+mark3);
	System.out.println("Enter Mark 4");
	int mark4 = A.nextInt();
	System.out.println("Mark1 is "+mark4);
	System.out.println("Enter Mark 5");
	int mark5 = A.nextInt();
	System.out.println("Mark1 is "+mark5);
	System.out.println("Enter Total Marks ");
	int Total = mark1+mark2+mark3+mark4+mark5;
	System.out.println("Total mark is "+Total);
	}
	
	
	

}
