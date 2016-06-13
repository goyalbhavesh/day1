package com.ngen.day1;

public class NumberPattern {

	public static void main(String[] args) {
		
		//For loop to iterate the number of rows
		for(int i=1;i<=9;i++){
			 
			//For loop to iterate the number of columns
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

	}

}
