package day13_methods_Part1;

public class PassArg {

	public static void main(String[] args) {
		
		int x =20;
		
		displayValue (10, 2);
		displayValue (x, 5);
		displayValue (x*4, 8);
		
	}
		public static void displayValue(int num1, int num2) {
						//method i�inde int kulland���m�z i�in yukar�da paranteze yaz�lan de�erler num olarak gelecek.
			int x=10; 	//yeni method alt�nda yukar�daki veriyi yeniden, farkl� bir de�erde kullanabilirsin.
			
				System.out.println("The value is " + (num1 + x));
				System.out.println("num2 = " +num2);
		}
		
}
