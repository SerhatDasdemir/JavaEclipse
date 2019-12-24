package day19_StringManipulation_part1;

import java.util.Scanner;

public class Task_77_Emoji {

	public static void main(String[] args) {

 Scanner sc = new Scanner (System.in);
 
 
		System.out.print("Enter a Emoji : ");
		String emo= sc.next();
		
		if (emo.length()!=2) {
			System.out.println("invalid emoji");
			return;
			
		}
		
		if (emo.length()==2) { 
			
			if (emo.charAt(0)== ':') {
				
			 if (emo.charAt(1)== ')') {
			
					System.out.println("smile");
			 
			}else if (emo.charAt(1)== '(') {
				
				System.out.println("sad");
			
			
			}else if (emo.charAt(1)== '/') {
				
				System.out.println("upset");
				
			}else {
				
				System.out.println("Unknown Emoji");}
		
	}else if(emo.charAt(0)==';') {
		if(emo.charAt(1)==')') {
			System.out.println("Wink");
			
		}else if(emo.charAt(2)=='0') {
			System.out.println("Suprised");
			
		}else {
			System.out.println("Unknown emoji");
		}
	}
	}
		
	}}
