package day13_methods_Part1;

public class PassArg {

	public static void main(String[] args) {
		
		int x =20;
		
		displayValue (10, 2);
		displayValue (x, 5);
		displayValue (x*4, 8);
		
	}
		public static void displayValue(int num1, int num2) {
						//method içinde int kullandýðýmýz için yukarýda paranteze yazýlan deðerler num olarak gelecek.
			int x=10; 	//yeni method altýnda yukarýdaki veriyi yeniden, farklý bir deðerde kullanabilirsin.
			
				System.out.println("The value is " + (num1 + x));
				System.out.println("num2 = " +num2);
		}
		
}
