package com.example.model;

public class SecondApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student shyam = new Student();
		
		shyam.setRollNumber(8304);
		shyam.setMarkScored(453);
		shyam.setFirstName("Shyam");
		
		System.out.println("Roll Number:"+shyam.getRollNumber());
		
		System.out.println("Mark Scored:"+shyam.getMarkScored());
		
		System.out.println("Name:"+shyam.getFirstName());
		
		


	}

}
