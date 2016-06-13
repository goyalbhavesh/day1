package com.ngen.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i =0;
	       int num =0;
	       
	       //Empty String
	       String  primeNumbers = "";

	       //For loop to call numbers from 1 through 10
	       for (i = 1; i <= 10; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Attach the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 10 are :");
	       System.out.println(primeNumbers);
	   

	}

}
