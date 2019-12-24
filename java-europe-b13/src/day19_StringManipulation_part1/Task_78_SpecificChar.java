package day19_StringManipulation_part1;



public class Task_78_SpecificChar {

	public static void main(String[] args) {
		
		
		
		String word = "abcabqcabc";
		char myChar = 'a';
		
		int counter=0;

		
		for (int i=0; i<word.length(); i++) {
			
			if (word.charAt(i)==myChar) {
				
				counter++;
				
			
		}
		}
		
		System.out.println("Count for -" + myChar + "- is " + counter);
	}

}
