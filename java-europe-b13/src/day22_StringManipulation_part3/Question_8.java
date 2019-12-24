package day22_StringManipulation_part3;

public class Question_8 {

	public static void main(String[] args) {

		System.out.println(left2("Hello"));
		System.out.println(left2("java"));
		System.out.println(left2("Hi"));

	}
	
	public static String left2(String str) {
		
		
		str = str.substring(2)+str.substring(0,2);
		
		return str;
		

	}

	
}
