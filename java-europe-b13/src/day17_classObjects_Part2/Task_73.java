package day17_classObjects_Part2;

import  java.util.Scanner;


public class Task_73 {
	
	/*Write a guessing game where the user has to guess a secret number
between 1-20. After every guess, the program tells the user whether
their number was too large or too small. The program will keep asking
the user to enter the number until he finds the correct number.
When the correct answer is found, the program will display "Congrat,you got it"*/

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int Secretnum= 19;
		
		int input = sc.nextByte();	
		
        do {
        	
        	System.out.println("Number :");
        	
        	if (input<Secretnum) 
        		
        		System.out.println("Up Pls");
        	
        	else if (input > Secretnum)
        		
        		System.out.println("Down Pls");
        	
        	else {
        		
        		System.out.println("Congrat, you got it");
        	    
        		break;
        	}
	
        }while (input != Secretnum); //numaralar eþit olmadýðý sürece yani "while (true)" olduðunda yukarýyý tekrarla.

	}

}
