package day22_StringManipulation_part3;

public class Question_4 {

	public static void main(String[] args) {

			System.out.println(firstTwo("Hello"));
			System.out.println(firstTwo("abcdefg"));
			System.out.println(firstTwo("ab"));
			System.out.println(firstTwo(""));
			System.out.println(firstTwo("a"));
	}
	
	public static String firstTwo (String str) {
		
		if (str.length()<2) {
			return str;
		}else if (str.isEmpty()) {
			return "";
		}else  {
			return str.substring(0,2);
		}
		
		
	}

}
