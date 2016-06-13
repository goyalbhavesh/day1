package com.ngen.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 1;
		
		System.out.println("The Fibonacci set from 0 to 10 is: ");
		
		while(b <= a){
			b = b + c;
			System.out.print(c +" ");
			System.out.print(b +" ");
		}

	}

}
