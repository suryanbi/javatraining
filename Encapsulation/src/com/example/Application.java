package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student();
		
		//ram.rollNumber = 101;
		
		//public method able to access
		ram.setRollNumber(8304);
		
		//default method unable to access 
		//because student class is in com.example.model package
		//and Application is in com.exaple package(different package)
		
		//ram.setMarkScored(453);
		
		//unable to access because application is NOT a subclass of student
		
		//ram.setFirstName("Ram");
		
		//ram.setBranch("CSE");
		
		//unable to access because the method is private in Student Class
		
		System.out.println("Roll Number:"+ram.getRollNumber());
		
		System.out.println("Mark Scored:"+ram.getMarkScored());
		
		System.out.println("Name:"+ram.getFirstName());
		
		System.out.println("Branch:"+ram.getBranch());
		
		Student shyam = new Student(8304, "Shyam", 435, "CSE");
		
		System.out.println("Roll Number:"+shyam.getRollNumber());
		System.out.println("Student Name:"+shyam.getFirstName());
		
		Student magesh = new Student (04, "Ram", "CSE");
		
		
		
		System.out.println("Roll Number:"+magesh.getRollNumber());
		
		System.out.println("Student Name:"+magesh.getFirstName());
		
		System.out.println("Branch:"+magesh.getBranch());
		
		System.out.println("Mark Scored:"+magesh.getMarkScored());

	}

}
