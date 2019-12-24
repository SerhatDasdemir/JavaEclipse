package day11_controlFlowStatements;

public class whileLoop {

	public static void main(String[] args) {
		
		int i=0;
		
		while (i<=10) {
			System.out.print(i);
			++i;}
			
			System.out.println("\n************************");
			
			int faktoriyel=1;
	        int carpan=1;
	        while(carpan<=10) {
	            faktoriyel=faktoriyel*carpan; //1*1, 1*2, 2*3, 6*4, 24*5...
	            System.out.println(carpan+ " faktoriyel: " +faktoriyel);
	            carpan++;}
	        
		}
	}

