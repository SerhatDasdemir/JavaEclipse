package day22_StringManipulation_part3;

public class Question_5 {

	public static void main(String[] args) {
		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		
		
		
		
	}
	
	public static String firstHalf(String str) {
		
		str = str.substring(0, str.length()/2);
		
		
		return str;
		

	}

}
