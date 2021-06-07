package com.bridgelabz;

public class EmpWage {

	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	/**
	 * This method is used to calculate total wage of an employee in it's company
	 * 
	 * @param company First argument specifies the name of compamy
	 * @param empRatePerHour Second argument specifies company rate value
	 * @param numOfWorkingDays Third argument working days in the company
	 * @param maxHrsPerMontH Fourth argument hrs to work in month
	 * @return total employee wage
	 */
	public static int computeEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays,
			int maxHrsPerMonth) {

		System.out.println("Welcome to Employee Wage Computation Program");
		// variables
		int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;

		while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
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
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total emp Wage for company: " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmployeeWage("DMart", 20, 2, 10);
		computeEmployeeWage("Reliance", 10, 4, 20);
	}

}
