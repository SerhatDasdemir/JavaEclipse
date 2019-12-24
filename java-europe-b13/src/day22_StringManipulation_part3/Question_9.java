package day22_StringManipulation_part3;

public class Question_9 {

	public static void main(String[] args) {
		
		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));

	}
	
	public static String right2(String str) {
		
		
		if (str.length()>4) {
			str = str.substring(str.length()-2)+str.substring(0,3);
		}else {
			str = str.substring(2)+str.substring(0,2);
		}
		
		return str;
		
	}

}
