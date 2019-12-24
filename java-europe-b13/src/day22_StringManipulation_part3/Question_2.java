package day22_StringManipulation_part3;

public class Question_2 {

	public static void main(String[] args) {
		
		
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
		System.out.println(makeAbba("what", "Up"));

	}

	public static String makeAbba(String str1, String str2) {
		
		return str1 + str2 + str2 + str1 ;
	}
	
}
