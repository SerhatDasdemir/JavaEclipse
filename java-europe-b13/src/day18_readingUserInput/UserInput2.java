package day18_readingUserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Provide a sentence and I will repeat it:");
		
		//String str = sc.next(); //girilen yazn�n bo�lu�a kadar olan k�sm�n� g�r�r.
		
		String str2 = sc.nextLine(); //-Line : girilen metnin tamam�n� g�r�r.
		
		System.out.println(str2);


	}

}
