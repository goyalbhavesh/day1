package com.ngen.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleAnalyzer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//Write a program that when given one side of a triangle
		//it should tell if it is
		//1. Equilateral 
		//2. Scalene
		//3. Isoceles
		//4. Not a triangle
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int side1 = Integer.parseInt(br.readLine());
        int side2 = Integer.parseInt(br.readLine());
        int side3 = Integer.parseInt(br.readLine());
        System.out.println("The three sides entered are: " +side1 +"," +side2 +"," +side3);
        
        //To test for an Equilateral Triangle
        if ((side1 == side2) && (side1 == side3))
            System.out.println("The triangle is an Equilateral Triangle");
         else
            System.out.println("The triangle is not an Equilateral Triangle");
        
        //To test for a Scalene Triangle
        if ((side1 != side2) && (side1 != side3) && (side2 != side3))
            System.out.println("The triangle is a Scalene Triangle");
         else
            System.out.println("The triangle is not a Scalene Triangle");
        
        //To test for an Isoceles Triangle
        if ((side1 == side2) && (side2 != side3)) or
        (side1 == side3) && (side3 != side2) or
        (side2 == side3)&& (side3 != side1)
           System.out.println("The triangle is an Isoceles Triangle");
        else
        	System.out.println("The triangle is not an Isoceles Triangle");
        
        //To test if the given condition does not form a triangle at all
        
        
	}

}
