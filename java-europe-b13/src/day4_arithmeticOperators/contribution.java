package day4_arithmeticOperators;

public class contribution {

	public static void main(String[] args) {
		
		/* This program calculates the amount of pay that will be contributed to a retirement plan 
		if %5, %8 or %10 of month pay is withheld*/ 
		/*Bu program,% 5,% 8 veya% 10 aylýk maaþýn ödenmemesi durumunda 
		emeklilik planýna katýlacak maaþ tutarýný hesaplar.*/
		
		double monthlyPay=6000;
		double contribution;
		
		//calculate and display %5 contribution
		contribution=monthlyPay*0.05;
		System.out.println("5 percent is $ " + contribution + " per month.");
		
		//calculate and display %8 contribution		
		contribution=monthlyPay*0.08;
		System.out.println("8 percent is $ " + contribution + " per month.");
		
		
		//calculate and display 10% contribution		
		contribution=monthlyPay*0.1;
		System.out.println("10 percent is $ " + contribution + " per month.");

	}

}
