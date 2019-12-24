package day8_controlFlowStatements_Part2;

public class task_32 {

	public static void main(String[] args) {
		// Declare 3 numbers
		// Program should display which one is largest
		
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;

		if (num1>num2 && num1>num3) {System.out.println("The num1 " + num1 + " larges to num2 & num3");}
		
		else if(num2>num1 && num2>num3) {System.out.println("The num2 " +num2 + " larges to num3 & num1");}
		else if (num3>num1 && num3>num2) {System.out.println("The num3 " + num3 + " larges to num2 & num1");}
		else {System.out.println("nummers are equal");}
	}

}
