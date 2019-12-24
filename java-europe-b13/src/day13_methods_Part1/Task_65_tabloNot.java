package day13_methods_Part1;

public class Task_65_tabloNot {

	public static void main(String[] args) {
		// Write a method that accepts 3 grades and prints the grade according to the below table

		calculateGrade(100,70,80);
	}

	public static void calculateGrade(int x1, int x2, int x3) {
		
		int Average = (x1+x2+x3)/3;
		
		if (Average>=90 && Average <=100) {
			System.out.println("calculateGrade(" +x1+ " , " + x2+ ", " + x3 + ") - > A");
			
		}else if (Average>=80 && Average <=89) {
			System.out.println("calculateGrade(" +x1+ " , " + x2+ ", " + x3 + ") - > B");
		}else if (Average>=70 && Average <=79) {
			System.out.println("calculateGrade(" +x1+ " , " + x2+ ", " + x3 + ") - > C");
		}else if (Average>=60 && Average <=69) {
			System.out.println("calculateGrade(" +x1+ " , " + x2+ ", " + x3 + ") - > D");
		}else if (Average>=0 && Average <=59) {
			System.out.println("calculateGrade(" +x1+ " , " + x2+ ", " + x3 + ") - > F");
		} else {System.out.println("Error!");}
		
	}
}
