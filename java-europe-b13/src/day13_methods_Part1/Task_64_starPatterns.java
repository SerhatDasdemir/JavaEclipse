package day13_methods_Part1;

public class Task_64_starPatterns {

	public static void main(String[] args) {
//		Write a program that accepts a number and print the star patterns according to that
//		number
//		Sample Output:
//		printPattern(5);
//		*
//		**
//		***
//		****
//		*****

		patterns(1);
		
	}

	
	public static void patterns(int i) {
		
		for ( i=1; i<=7 ; i++){

			for (int j=1 ; j<=i ; j++)
				System.out.print("*");
					System.out.println();
				
			}
						
			System.out.println("");
		
		
	}
}
