package com.training;

public class Converter {
	
	public String convert(String str) {
	
		return str.toUpperCase();
	}
	
	//Creating a Overloaded Method
	
	public double convert(double farenTemp) {
		
		return (farenTemp-32)*5/9;
	}
	
	public double convert(double amt, int frm) {
		
		double response = amt *100;
		
		if(frm==1) {
			response = amt *120;
		}
		
		return response;
		
		
	}
	
	

}
