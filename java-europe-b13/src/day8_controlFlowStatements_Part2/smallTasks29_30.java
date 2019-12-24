package day8_controlFlowStatements_Part2;

public class smallTasks29_30 {

	public static void main(String[] args) {
		// 1- Write an if-else statement that assigns 20 to variable y if the variable
		//x is greater than 100. Otherwise, it should assign 0 to the variable y

		int x = 110;
		
		int y= 10;
		
		if (x>100) {y=20;} else {y=0;};
		
		System.out.println("y= " + y + "\n");
		
		//2- Write an if-else statement that assigns 1 to x when y is equal to 100.
		//Otherwise, it should assign 0 to x.
		
		int y1 = 100;
		int x1 = 0;
		
		if (y1==100) {x1=1;} else {x1=0;};
		
		System.out.println("x1 = " + x1 + "\n");
 		
		//3- Write an if-else statement that assigns 0 to the variable b and assigns
		//1 to the variable c if the variable a is less than 10. Otherwise, it should
		//assign –99 to the variable b and assign 0 to the variable c	
		
		int b= 0;
		int a=11;
		int c=0;
		
		if(a<10)		{c=1;} else {b=-99; c=0; }	
		
	System.out.println("b = " + b + "\n");
	System.out.println("c= " + c+ "\n");
	
	//29-• Declare and initialize 2 variable numbers
	//• Program should tell which number is bigger
	//ex: “Number1 number is greater than Number2 number”
	
	int num1=500;
	int num2=200;
	
	if(num1>num2) {
		
		System.out.println("Num1:" + num1 + " is bigger than " + "Num2:" + num2 + "\n");
		
	}else {
		
		System.out.println("Num2:" + num2 + " is bigger than " + "Num1:" + num1 + "\n");}

	//30-Write a Java program:
	//	1) Declare and initialize a number
	//	2) Display whether the number is an odd number or even number.
		
		int num=10;
		
		if (num%2==0) {System.out.println("Number = " + num + " is even nummer" + "\n");
		
		} 
		else {System.out.println("Number = " + num + " is old nummer" + "\n");}
		
		
		
		
	}}


