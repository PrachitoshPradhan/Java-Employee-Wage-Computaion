package com.empwage;

public class EmpWageCalculation {
	static int isPresent = 1;
	public static void main(String[] args) {
       System.out.println("Welcome to employee wage computaion programme.");
       double attendance = Math.floor(Math.random()*10)%2;
       if(attendance == isPresent)
       {
    	   System.out.println("Employee is present.");
       }
       else
       {
    	   System.out.println("Employee is absent.");
       }
	}

}
