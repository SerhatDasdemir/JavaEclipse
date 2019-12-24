package day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		int Question;
		int missed;
		
		System.out.print("How many questions are on the final exam?");
		Question=sc.nextInt();
		
		System.out.print("How many questions did the student miss?");
		missed=sc.nextInt();
		
		//Complete code
		
		FinalExam exam = new FinalExam(Question, missed);
		
		System.out.println("The grade for the exam is " + exam.getGrade());
		
	}

	

}
