package day17_classObjects_Part2;

import java.util.Scanner; 

public class Task_74 {

	/* Write a program that calculates the sum of numbers entered by the user until user enters a negative number.*/
	
	
	public static void main(String[] args) {

				
		int sum=0;
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			System.out.print("Enter your number:");
			num=sc.nextInt();
			
			if(num<0) {
				break;
			}else {
				sum=sum+num;
			}
			
		}while(true);
		
		System.out.println("Total is:" + sum);

}}
