package day23_StringManipulationLab_RandomClass;

//import java.util.Scanner;
//import java.util.Random;
//t�m s�n�flar�n yerine * kullan�r�z.
import java.util.Random;
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {


		int number1;
		int number2;
		int sum;
		int userAnswer;
		
		Scanner sc = new Scanner (System.in);
		
		Random rn = new Random ();
		
		number1 = rn.nextInt(100);
		number2 = rn.nextInt(100);

		System.out.println("What is the answer to the following problem?");
		System.out.println(number1 +"+"+ number2+ " = ?");
		
		userAnswer= sc.nextInt();
				
		sum = number1+number2;
		
		if (userAnswer ==sum) {
			System.out.println("Correct,you got it!");
		}else {
			System.out.println("Sorry, wrong answer, the correct answer is " + sum);
		}
		
		
	}

}
