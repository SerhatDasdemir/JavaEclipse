package day8_controlFlowStatements_Part2;

public class task_35_FindGreatesNumberNested {

	public static void main(String[] args) {
		
		//find the greatest by using nested if
		
		int n1=1000;
		int n2=2000;
		int n3=3000;
		
		if (n1>n2 && n1>n3) {
			System.out.println("Greates nummer is n1 = " + n1);
			
			}else {
				if (n2>n3) {
					System.out.println("Greates nummer is n2 = " + n2);
					
					}else {System.out.println("Greates nummer is n3 = " + n3);
				
					
				}
				
			}
		

	}

}
