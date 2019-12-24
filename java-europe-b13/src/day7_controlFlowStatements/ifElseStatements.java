package day7_controlFlowStatements;

public class ifElseStatements {

	public static void main(String[] args) {
	
		int score = 60;
		if (score>=70) {
			System.out.println("Excellnt");
			System.out.println("You pased with grade A");} 
		
		else {System.out.println("You failed");} 
		
		System.out.println("*************");
		
		int sales, bonus;
		double commisionRate, salary;
		
		sales=5001;
		salary=10000;
		
		if (sales>5000) { //eðer "sales" > 5000 ise aþaðýdaki kodu kullan. 5000 den küçükse parantez {} içini görme.
			
			bonus=500;
			commisionRate=1.12;}
		
		else {bonus = 100;
			  commisionRate=1.10;}
		
			salary=salary*commisionRate+bonus;  //10.000*1.10+100 = 11.100
		
		System.out.println("salary = " + salary);
	}

}
