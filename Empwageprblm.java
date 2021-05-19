package com.Empwageprblm;

public class Empwageprblm {
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int NUM_OF_WORKING_DAYS = 1;

	// VARIABLE
	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;
		int totalEmpwage=0;
		// Commputaion
		int empcheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empcheck) {
		case IS_PART_TIME:
			empHrs = 4;
			break;
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
	empWage = empHrs * EMP_RATE_PER_HOUR;
	totalEmpwage += empWage;
		System.out.println("Emp Wage: " + empWage);
	System.out.println("Total Emp Wage:" +totalEmpwage);
}
}