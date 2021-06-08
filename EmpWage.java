package com.bridgelabz;

public class EmpWage {

	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRaterPerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public EmpWage(String company, int empRaterPerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRaterPerHour = empRaterPerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmployeeWage() {

		System.out.println("Welcome to Employee Wage Computation Program");
		// variables
		int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;
		// computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
			totalEmpWage = totalEmpHrs * empRaterPerHour;
	}
	
	@Override
	public String toString() {
		return "Total Emp Wage for the Company: "+company+" is: " +totalEmpWage;
	}

	public static void main(String[] args) {
		EmpWage dMart = new EmpWage("DMart", 20, 4, 10);
		EmpWage reliance = new EmpWage("Reliance", 10, 3, 20);
		dMart.computeEmployeeWage();
		System.out.println(dMart);
		reliance.computeEmployeeWage();
		System.out.println(reliance);
	}

}
