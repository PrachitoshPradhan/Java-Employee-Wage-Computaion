package com.empwage;

public class EmpWageCalculation {
	static final int isPresent = 1;
	static final int halfDay =2;
	static int WAGE_PER_HOUR = 20;
	static int FULL_DAY = 8;
	static int HALF_DAY_HOUR = 4;
	static int noOfWorkingDays = 20;
	
	public static void main(String[] args) {
       System.out.println("Welcome to employee wage computaion programme.");
       int attendance;
       int empWage=0;
       int totalWage=0;
       for(int day =1; day<=noOfWorkingDays;day++)
       {
    	   attendance= (int)(Math.floor(Math.random()*10)%3);
       switch (attendance)
       {
       case isPresent:
    	   System.out.println("Employee is present today.");
    	   empWage= WAGE_PER_HOUR * FULL_DAY;
    	   break;
    	   
       case halfDay:
    	   System.out.println("Employee has taken halfday.");
    	   empWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
    	   break;
    	   
       default:
    	   System.out.println("Employee is absent");
    	   empWage = 0;
       }
       totalWage = totalWage + empWage;
	}
       System.out.println("Employee total months wage is: " +totalWage);
	}

}
