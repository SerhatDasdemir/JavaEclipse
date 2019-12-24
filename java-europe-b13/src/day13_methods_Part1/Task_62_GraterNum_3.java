package day13_methods_Part1;

public class Task_62_GraterNum_3 {

	public static void main(String[] args) {
		// Write a method that accepts 3 numbers and displays the greatest one in the console.
		//Sample Output:calculateGreatest(5,2,3) -- >5

		calculateGreatest (7,3,5);
	}

	
	public static void calculateGreatest(int num1, int num2, int num3) {
		if (num1>num2 && num1>num3) {
			System.out.println("calculateGreatest (" + num1 +" ,"+ num2 +" , "+ num3 +") -->" +  num1);
			
			}else if (num2>num1 && num2>num3) {System.out.println("calculateGreatest (" + num1 +" ,"+ num2 +" , "+ num3 +") -->" +  num2);
			
			}else {System.out.println("calculateGreatest (" + num1 +" ,"+ num2 +" , "+ num3 +") -->" + num3);}
		
	}

}