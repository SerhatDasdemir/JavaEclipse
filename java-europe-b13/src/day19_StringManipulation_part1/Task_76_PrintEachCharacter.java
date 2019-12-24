package day19_StringManipulation_part1;

public class Task_76_PrintEachCharacter {

	public static void main(String[] args) {

		String word = "Cybertek School";
		
		System.out.println(word.length() + "\n"); 
		
		for (int x=0; x<word.length(); x++) { //last character allways : word.length()-1 ile gösterilir.
			
			System.out.println(word.charAt(x)); }
		
	}

}
