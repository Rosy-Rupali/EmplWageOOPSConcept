package com.bridgelabz;

public class EmpWage {

	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;
	final static int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmpWage empwage = new EmpWage();
		empwage.partTimeEmployeeWage();

	}

	/**
	 * Added part-time and full-time employee daily wage
	 */
	private void partTimeEmployeeWage() {
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);

	}

}
	

