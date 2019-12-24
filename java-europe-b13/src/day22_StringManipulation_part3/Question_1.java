package day22_StringManipulation_part3;

public class Question_1 {

	public static void main(String[] args) {

		System.out.println(helloName(" bob"));
		System.out.println(helloName(" Alice"));
		System.out.println(helloName(" X"));

		
		

	}

	public static String helloName(String str ) {
		
		return "Hello" .concat(str).concat("!");
		
	}
		
	
	
}
