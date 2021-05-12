package com.Empwageprblm;
public class Empageprblm {
	public static void main(String[] args) {
	  //conastant
	int IS_FULL_TIME = 2;
	int EMP_RATE_PER_HOUR = 20;
	int IS_PART_TIME = 1;
	 
 //VARIABLE
	int empHrs = 0;
	int empWage = 0;
	  //Commputaion
	double empcheck = Math.floor(Math.random() * 10) % 2;
	if(empcheck == IS_FULL_TIME)
	empHrs = 4;
	else 
	if (empcheck == IS_PART_TIME)
	empHrs = 8;
	else
         empHrs=0;
	empWage = empHrs * EMP_RATE_PER_HOUR;
	System.out.println("Emp Wage: " + empWage);
	}
}
