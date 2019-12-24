package day30_wrapperClass;

public class varArgs {

	public static void main(String[] args) {

			sum (2,4);
			sum(2,3,5,6);
			
			concat ("apple", "orrange", "123","Result"); 						//void method
		
			System.out.println(concat1 ("apple", "orrange", "123","Result")); 	// String method "return"
			
	}
	public static void sum(int... numbers) { //A vararg parameter can take a variable number of argumentds
		
		int sum = 0;
		
		for (int value : numbers) {
			
			sum= sum + value;
			
		}
		
		System.out.println(sum);
		
	}
	
	public static void concat(String... strs) {
		
		String newStr = "";
		
		for (String str : strs) {
			
			newStr = newStr + str.charAt(2);
			
		}
		
		System.out.println(newStr);
	}
public static String concat1(String... strs) {
		
		String newStr = "";
		
		for (String str : strs) {
			
			newStr = newStr + str.charAt(2);
			
		}
		
		return newStr;
}

}
