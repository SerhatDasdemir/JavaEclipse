package day10_controlFlowStatements_Part4;

public class task_42_sumEvenOfOdd {

	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1;i<100;i++) {
			
			if(i%2==0) {
				
				//2 4 6 = 12
				 
				sumEven=sumEven+i;  //0+2=2
				
			}else {
				
				
				sumOdd=sumOdd+i;   //0+1 =1 +3 =4
			}
		}
		
		System.out.println("Sum of even number " + sumEven);
		System.out.println("Sum of odd number " + sumOdd);




	}

}
