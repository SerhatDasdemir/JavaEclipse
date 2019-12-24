package day23_StringManipulationLab_RandomClass;

import java.util.Random;
import java.util.Scanner;

public class Task_83_DrKimuta {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		Random rn  = new Random();
		
		String str="y";
		int num1 ;
		int num2;
		
		while (str.equalsIgnoreCase("y")) {
			
		System.out.println("rolling the dice...");
		num1 =rn.nextInt(6)+1;
		num2 =rn.nextInt(6)+1;
		 
		System.out.println("Their values are : ");
		System.out.println( num1 +" "+num2);
		 
		 
		System.out.println("roll them again : (y=yes) ?");
		str = sc.nextLine();
		
		}
		
		
	}

}
