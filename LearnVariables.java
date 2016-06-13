package com.ngen.day1;

public class LearnVariables {
	public static void main(String args[]){
		int a = 10;
		System.out.println("The value of a is: " +a);
		a = 12;
		System.out.println("The new value of a is: " +a);
		
		//String datatype example
		String str = "My name is Bhavesh";
				System.out.println("The value of str is: " +str);
		//boolean example		
	    boolean isStudentPassed = false;
	    
	    //Arithmetic operations
	    int sum;
	    int b = 20;
	    //add a and b and store the value in sum
	    sum = a + b;
	    System.out.println("The sum of a and b is: " +sum);
	    
	    int mod;
	    //get the modulos of b/a
	    mod = b%a;
	    System.out.println("The mod of b%a is: " +mod);
	}

}
