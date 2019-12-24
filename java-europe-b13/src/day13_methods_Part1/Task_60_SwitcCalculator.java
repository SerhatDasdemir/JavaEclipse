package day13_methods_Part1;

public class Task_60_SwitcCalculator {

	public static void main(String[] args) {
		calculator(6, 3, "+");
		calculator(6, 3, "-");
		calculator(6, 3, "*");
		calculator(6, 3, "/");}
	
	
	public static void calculator(int num1,int num2,String operator) {
		
		switch(operator) {
		case "+":
			System.out.println("num1+num2 = "+num1+num2);
			break;
		case "-":
			System.out.println("num1-num2 = " +  (num1-num2));
			break;
		case "*":
			System.out.println("num1*num2 = "+ num1*num2);
			break;
		case "/":
			System.out.println("num1/num2 = "+num1/num2);
			break;
		}
		

		
		
		}
	}
	

