package com.bridgelabz;

public class EmpWage {

	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	/**
	 * Calculate Wages till a condition of total working hours or days is reached
	 * for a month
	 */
	private static int computeEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays,
			int maxHrsPerMonth) {

		System.out.println("Welcome to Employee Wage Computation Program");
		// variables
		int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;

		while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
			int empHrs = 0;
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println("DAY#: " + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total emp Wage for company: " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmployeeWage("DMart", 20, 2, 10);
		computeEmployeeWage("Reliance", 10, 4, 20);
	}

}
