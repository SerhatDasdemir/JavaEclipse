package day36_StaticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {

		double result = Calculator.plus(55, 7); //static way
		System.out.println("result: " + result);
		
		Calculator c = new Calculator ();
		System.out.println(Calculator.plus(55, 7));
		
		int i = Integer.parseInt("33");
		System.out.println(Character.isDigit('5'));
		
		m1();
		
	}
	
	public static void m1() {
		System.out.println("Hello");
	}

}
