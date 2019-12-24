package day25_arrays_part2;

import java.util.Scanner;

public class Task {
	
		/*  Write a RainFall class that stores the total rainfall for each of 12 months into an array of
			doubles. The program should have methods that return the following:
				- total rainfall for the year
				- the average monthly rainfall
				- the month with the most rain
				- the month with the least rain
		Input Validation: Do not accept negative numbers
		for the monthly rainfall figures.*/

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		double[] RainFall=new double[12];
		
		System.out.println("Please enter in the following rainfall for the months ahead:");
		System.out.println("Month   Rainfall (in inches)");
		
		for(int i=0;i<months.length;i++) {
			
			System.out.print(months[i]+": ");
			RainFall[i]=scan.nextDouble();
			
			if(RainFall[i]<0) {
				
				System.out.println("Invalid Input");
				break;
			}
		}
		
		System.out.println("The sum of all the rain is "+TotalRainfall(RainFall)+" inches");
		System.out.println("The average rainfall is "+AverageRainfall(RainFall, TotalRainfall(RainFall))+" inches");
		System.out.println("The max rain is "+MostRain(RainFall)+" inches");
		
		double q=MostRain(RainFall);
		
		System.out.println("The min rain is "+LeastRain(RainFall, q)+" inches");
		
	}
	public static double TotalRainfall(double[] totrai) {
		double sum=0;
		for(int i=0;i<totrai.length;i++) {
			sum=sum+totrai[i];
		}
		return sum;
		
	}
	
	public static double AverageRainfall(double[] averai, double sum) {
		double ave;
		ave=sum/averai.length;
		return ave;
		
	}
	public static double MostRain(double[] mosrai) {
		double a=0,b=0;
		for(int i=0;i<mosrai.length;i++) {
			a=mosrai[i];
			if(a>b) {
				b=mosrai[i];
			}
		}
		return b;
	}
	public static double LeastRain(double[] learai, double b) {
		double a;
		for(int i=0;i<learai.length;i++) {
			a=learai[i];
			if(a<b) {
				b=learai[i];
			}
		}
		return b;
	}

	}


