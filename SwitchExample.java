package com.ngen.day1;

import java.io.BufferedReader;

public class SwitchExample {

	public static void main(String[] args) throws IOException  {

		//Write a program to check if the month entered is a valid month
		//Using switch case
		BufferedReader br = new BufferedReader
	    int monthNum = Integer.parseInt(br.readLine())
	    
	    		switch (monthNum) {
	            case 1:  System.out.println("January");
	                     break;
	            case 2:  System.out.println("February");
	                     break;
	            default:System.out.println("Invalid month"); 
	                     break;
		
	}

}
}
