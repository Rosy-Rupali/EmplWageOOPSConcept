package com.bridgelabz;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmpWage empwage = new EmpWage();
		empwage.attendanceCheck();

	}

	private void attendanceCheck() {

		int isPresent = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isPresent) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}

}
