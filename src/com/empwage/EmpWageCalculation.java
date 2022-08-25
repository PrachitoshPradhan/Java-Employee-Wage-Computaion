package com.empwage;

public class EmpWageCalculation {
	static int isPresent = 1;
	static int WAGE_PER_HOUR = 20;
	static int FULL_DAY = 8;
	
	public static void main(String[] args) {
       System.out.println("Welcome to employee wage computaion programme.");
       double attendance = Math.floor(Math.random()*10)%2;
       int empWage;
       if(attendance == isPresent)
       {
    	   System.out.println("Employee is present today.");
    	   empWage= WAGE_PER_HOUR * FULL_DAY;
       }
       else
       {
    	   System.out.println("Employee is absent today.");
    	   empWage = 0;
       }
       System.out.println("Employee Wage is: " +empWage);
	}

}
