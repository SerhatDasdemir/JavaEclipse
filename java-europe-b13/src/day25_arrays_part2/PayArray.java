package day25_arrays_part2;

import java.util.Scanner;

public class PayArray {
	//This program stores in an array the hours worked for by 5 employees who all make the same hourly wage
	//display their gross pay
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[] num = new int [5];
		
		
		double grossPay;
		
		double hourPay;
		
		System.out.print("Enter the hourly pay €: ");
		hourPay = sc.nextDouble();
		
		for (int i=0;i<num.length;i++) {
			System.out.print( "Enter hour for employer "+ (i+1) + ": ");
			num [i] = sc.nextInt();	
		}
		
//		System.out.print( "Enter hour employer 2 : ");
//		num [1] = sc.nextInt();
//		System.out.print( "Enter hour employer 3 : ");
//		num [2] = sc.nextInt();
//		System.out.print( "Enter hour employer 4 : ");
//		num [3] = sc.nextInt();
//		System.out.print( "Enter hour employer 5 : ");
//		num [4] = sc.nextInt();
		
		System.out.println("==============================");
		
		for (int i=0; i<num.length;i++) {
			grossPay=num[i]*hourPay;
			
			System.out.println("Employer " +( i+1 )+" ="+ grossPay +" £");
		}
		

	}

}
