package day8_controlFlowStatements_Part2;

public class Task_31_ {

	public static void main(String[] args) {
		//31-A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a
				//program that declares three integers as angles and check whether a triangle is valid or not.
				
				int a= 30;
				int b= 60;
				int c= 91;
				if ((a+b+c)==180) {System.out.println("This is a valid triangle");} 
				else {System.out.println("This is not a valid triangle");} 
	}

}
