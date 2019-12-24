package day7_controlFlowStatements;

public class task28_ {

	public static void main(String[] args) {
		
		int price= 1000;
		int quantty=50;
		
		double revenue= price*quantty;
		double discount = revenue*10/100;
		System.out.println("Brut Revenue = " + revenue);
		System.out.println("Discount = " + discount);
		if (revenue>5000) {System.out.println(	"Net Revenue = " + (revenue - discount));}

	}

}
