package day19_StringManipulation_part1;

public class String_Length {

	public static void main(String[] args) {

		String str = "java";
		
		System.out.println(str.length()); //length() --> String kelimenin karakter sayısını verir.

		int x = str.length();
	
		System.out.println(x*10); // "java" = 4 karakter. --> 4*10 = 40
	
		String str1 = new String ("java");
		
		System.out.println(str1.length()); //str.length()-1  --> son karakteri verir.
	
	
	}

}
