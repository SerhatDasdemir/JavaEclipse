package day6_logicalOperators;

public class task_operatorPrecedence {

	public static void main(String[] args) {
		int ApplesCount = 20;
		int OrangesCount = 30;
		int PearsCount = 30;
		
		boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount; 
						// 20     <      30       ||       30     >=     30        => T || ----- = T
		System.out.println(comp);
		
		System.out.println("******************");
		
		String Outsideweather;
		int Degree;
		Outsideweather = "Shinny";
		Degree = 70;
		boolean comp2 = (!(Outsideweather == "Rainy"||Degree==70)); //  !(F || T) = !T = F
		System.out.println(comp2);
		
		System.out.println("******************");
		
		int b = 2;
		boolean res = ++b == 2 || --b == 2 && --b == 2; 
		//b in memory :2=>.3  =>     .2    =>   .1
		//res         :  (.3 == 2 || .2 == 2 && .1 == 2) =>> (F || T && F) =>> (F || F) => F
		
		System.out.println(res);
		
		System.out.println("******************");
		
		boolean x = true, s=true, k = false;
		int y= 20;
		x = (y!=10) || (s=false); //T || F ==> T
		k = (y!=10) && (s=false); //T && F ==> F
		System.out.println(x);		
		System.out.println(k);
		System.out.println(s);
		
		System.out.println("******************");
		
	/*  1. Create a double variable with the value 20
		2. Create a second variable of type double with the value 80
		3. Add both numbers up and multiply by 25
		4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
		5. Print remaining total (#4) is equal to 20 or less : true/false */
		
		double d1 = 20;
		double d2 =80;
		
		double ress = (d1+d2)*25;
		double remainder = ress%40;
		System.out.println(" Remaining total is equal to 20 or less ? : " + (remainder<=20));
		
		
		
		
		
		
		
	}

}
