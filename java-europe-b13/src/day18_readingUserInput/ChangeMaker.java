package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number from 1-99:");
		
		//int amount=keyboard.nextInt();
		
		int user_amount=keyboard.nextInt();
		
//		int originalAmount=amount;
		
//		int quarters=amount/25; //   87/25=3
//		amount=amount%25; // 12
//		int dimes=amount/10;  // 12/10=1 
//		amount=amount%10;     // 2
//		int nickles=amount/5;  // 2/5 =0
//		amount=amount%5;  
//		int pennies=amount;  //2
//		
//		System.out.println(originalAmount + " cents in coins can be given as:" );
//		System.out.println(quarters + " quarters");
//		System.out.println(dimes + " dimes");
//		System.out.println(nickles + " nickles");
//		System.out.println(pennies + " pennies");

		if (user_amount>1 && user_amount<100) {
			ChangeMaker(user_amount); //þimdi metod deðiþimi yapalým.
			
			}else if ( user_amount >= 100) {
				
				
				System.out.println("Try agein : ");
				
				
				
				
				
		}
		
		
	}
	
	public static void ChangeMaker(int amount) { //yeni metod atadýk.
		
		int originalAmount=amount;
		
		int quarters=amount/25; //   87/25=3
		amount=amount%25; // 12
		int dimes=amount/10;  // 12/10=1 
		amount=amount%10;     // 2
		int nickles=amount/5;  // 2/5 =0
		amount=amount%5;  
		int pennies=amount;  //2
		
		System.out.println(originalAmount + " cents in coins can be given as:" );
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickles + " nickles");
		System.out.println(pennies + " pennies");
		
		
		
	}

}
