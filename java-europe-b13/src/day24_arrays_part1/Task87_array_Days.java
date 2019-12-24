package day24_arrays_part1;

import java.util.Scanner;

public class Task87_array_Days {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);

		String [] days = new String [7];
		
		days[0]  = "monday";
		days[1]  = "tuesday";
		days[2]  = "wednesday";
		days[3]  = "thursday";
		days[4]  = "friday";
		days[5]  = "Saturday";
		days[6]  = "Sunday";
		
			
		System.out.println("Enter your days index num : ");
		int index = sc.nextInt();
		
		System.out.println("Today is " + days[index]);
		
	}

}
