package day13_methods_Part1;

public class SimpleMethod {

	public static void main(String[] args) {
	
		System.out.println("Hello from main method");
		
		displayMessage (); //a�a��daki methodun ad�n� araya yazd���m�z i�in a�a��daki kod kendini arada  g�sterecektir.
		
		System.out.println("Back in the main method");
	}
	
	public static void displayMessage () {
		
		System.out.println("Hello from the method");
		
	}

}
