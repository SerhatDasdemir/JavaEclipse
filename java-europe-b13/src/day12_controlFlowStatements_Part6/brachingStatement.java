package day12_controlFlowStatements_Part6;

public class brachingStatement {

	public static void main(String[] args) {

	int number = 0;
		
		while(number<15) {
			
			number++;
			
			if(number<=5) {
				
				System.out.println("Skipping number " + number);
				
				continue; //number =5 olana kadar bu kodu çalıştırdı. 
							//number 5 e eşitlendikten sonra aşağıdaki kodu çalıştımaya devam etti
			}
			
			System.out.println("number = " + number);
			
			if(number>=10) {
				
				System.out.println("Breaking at " + number);
				
				break;
			}
		}

	}

}
