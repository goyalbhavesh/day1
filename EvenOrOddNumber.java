package com.ngen.day1;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
		//create an array of 10 numbers
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
       
        for(int i=0; i < numbers.length; i++){
               
                  //use modulus operator to check if the number is even or odd. 
                 //If the number divides by 2 and reminder is 0 then the number is
        	    //even, otherwise it is odd.
                 
                 
                 if(numbers [i] % 2 == 0)
                        System.out.println(numbers[i] + " is even number ");
                 else
                        System.out.println(numbers[i] + " is ODD number ");
                       
        }
		
	}

}
