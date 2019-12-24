package day19_StringManipulation_part1;

import java.util.Scanner; 

public class Task_75_totalCharacter {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		System.out.print("First Namme  : ");
		String firstname = sc.next();
		System.out.print("Last Namme  : ");
		String lastname=sc.next();
		
		
		
		System.out.println("Total karakter : " + firstname.length() + lastname.length() ); 
	
		

	}

}
