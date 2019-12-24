package day19_StringManipulation_part1;

public class Task_79_vowel {

	public static void main(String[] args) {


		String word = "CybertekSchool"; //a,e,o,i,u
		
		
for (int i=0; i<word.length(); i++) {
			
if (word.charAt(i)== 'a'|| word.charAt(i)== 'e'||word.charAt(i)== 'o'||word.charAt(i)== 'i'||word.charAt(i)== 'u') {
				
				System.out.print(word.charAt(i));
				
				if ( i != word.length()-2) {
					
					System.out.print(",");
				}
			
		}}
		
		

	}

}
