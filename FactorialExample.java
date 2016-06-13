package com.ngen.day1;

public class FactorialExample {

	public static void main(String[] args) {
		//Write a program to find the factorial of a number
		//Factorial = the product of an integer and all the integers below it
		//e.g. factorial four( 4! ) is equal to 4 x 3 x 2 x 1 = 24.
		//General term: a! = 1 * 2 * 3 * .... * (a-1) * a
		
		int a = 10;
		int ans = 1;
		for( int i = 1; i <= a; i++){
			ans = ans * i;
		}
		System.out.println("The Factorial of " +a +" is: " +ans);
		

	}

}
