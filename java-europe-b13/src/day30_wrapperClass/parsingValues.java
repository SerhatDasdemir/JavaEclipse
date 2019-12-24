package day30_wrapperClass;

public class parsingValues {

	public static void main(String[] args) {


		String numberAsString="2018";
			System.out.println(numberAsString);

		int number = Integer.parseInt(numberAsString);
			System.out.println(numberAsString);
		
			numberAsString = numberAsString+1; //String olduðu için : 20181
				System.out.println(numberAsString); 
				
			number = number+1;					//Ýnteger olduðu için : 2019
				System.out.println(number);
				
		double number2 = Double.parseDouble(numberAsString); //Stringten "20181" --> Double dönüþtü : 20181.0
			System.out.println(number2);
			
		int i = 10;
		String s = String.valueOf(i);
			System.out.println(s); //it will return "10"
		
		String s2 = Integer.toString(i);
			System.out.println(s2); // it will return "10"
		
		
	}

}
