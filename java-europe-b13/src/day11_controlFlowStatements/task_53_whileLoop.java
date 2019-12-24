package day11_controlFlowStatements;

public class task_53_whileLoop {

	public static void main(String[] args) {
		// Write a program using while loop, that calculates the sum of the even numbers between
		// 0 and 100

		int x= 0;
		int sumEven=0;
		
		while (x<6) {
			if ( x%2==0) {
				sumEven=sumEven + x;
										}
				x++;
		}
		
			System.out.println(sumEven);
			
	}

}
