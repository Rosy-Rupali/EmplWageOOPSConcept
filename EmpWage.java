package com.bridgelabz;

public class EmpWage {
	
	final static int IS_FULL_TIME=1;
	final static int EMP_RATE_PER_HOUR=20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmpWage empwage = new EmpWage();
		empwage.dailyEmployeeWage();

	}

	private void dailyEmployeeWage() {
		int empHrs=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME)
			empHrs=8;
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empWage);
		
	}

	
}	
	

