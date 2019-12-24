package day4_arithmeticOperators;


//This program calculates hourly wages plus overtime

public class wages {

	public static void main(String[] args) {
		
		double regularWage;//the calculated regular wage
		double basePay=25.75; //The base pay
		double regularHours=40; //The hours worked less overtime
		double overtimeWages; //Overtime wages
		double overTimePay=37.5; //overtime pay rate
		double overTimeHours=15;
		double totalWage; //Total wage
		
		regularWage=basePay*regularHours;
		overtimeWages=overTimePay*overTimeHours;
		
		totalWage=regularWage+overtimeWages;
		
		System.out.println("Wages for this week are $" + totalWage);
		
		
		
		
		

	}

}
