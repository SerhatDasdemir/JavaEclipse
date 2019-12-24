package day13_methods_Part1;

public class SimpleMethod {

	public static void main(String[] args) {
	
		System.out.println("Hello from main method");
		
		displayMessage (); //aþaðýdaki methodun adýný araya yazdýðýmýz için aþaðýdaki kod kendini arada  gösterecektir.
		
		System.out.println("Back in the main method");
	}
	
	public static void displayMessage () {
		
		System.out.println("Hello from the method");
		
	}

}
