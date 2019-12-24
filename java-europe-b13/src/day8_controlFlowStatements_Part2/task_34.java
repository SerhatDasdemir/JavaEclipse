package day8_controlFlowStatements_Part2;

public class task_34 {

	public static void main(String[] args) {
		/* The marks obtained by a student in 3 different subjects are input by the user. Your
			program should calculate the average of subjects. The student gets a grade as per the following rules:
		AVERAGE GRADE
		90-100 	A
		80-89 	B
		70-79 	C
		60-69	D
		0-59 	F	*/
		
		int a= 0;
		int b= 0;
		int c= 90;
		
		int not = (a+b+c)/3;
			
		if (not <= 100 && not >=90) {System.out.println("Grade is A");}
		else if (not <90 && not >=80) {System.out.println("Grade is B");}
		else if (not <80 && not >=70) {System.out.println("Grade is C");}
		else if (not <70 && not >=60) {System.out.println("Grade is D");}
		else if(not <60 && not >=0) {System.out.println("Grade is F");}
		else {System.out.println("Error");}
	}

}
