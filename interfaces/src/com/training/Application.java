package com.training;

import com.training.ifaces.Function;
import com.training.services.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function conv = new CurrencyConverter();
		
		double response = conv.apply(200);
		
		System.out.println(Function.COUNTER);
		
		System.out.println(response);
		
		System.out.println(conv.apply(300));
		
		
	}

}
