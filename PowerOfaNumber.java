package com.ngen.day1;

public class PowerOfaNumber {

	public static void main(String[] args) {

		//Program to get the power of a number
		//e.g 2 raised to power of 3 = 2x2x2 = 8
		//num = 2 raised to the power of raised = 4
		//pow = 2x2x2x2 = 16
		
		int num = 2;
		int raised = 3;
		int pow = 1;
		
		//start of loop?
		//end of loop?
		for (int i = 1; i <= raised; i++){
			pow = pow * num;
		}
		System.out.println("The value of " +num +"raised to the power of " +raised +" is: " +pow );
	}

}
