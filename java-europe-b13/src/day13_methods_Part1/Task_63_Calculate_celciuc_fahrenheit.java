package day13_methods_Part1;

public class Task_63_Calculate_celciuc_fahrenheit {

	public static void main(String[] args) {
		// Write a function that accepts Fahrenheit and displays the Celcius in the console.

		
		calculateCelcius(32);
		calculateCelcius(50);
		
		
	}

	
	public static void calculateCelcius(int f) {
		
		double c= (f-32) / 1.8; 
		
		System.out.println("calculateCelcius (" + f + ") -- >" + c);
	}
}
