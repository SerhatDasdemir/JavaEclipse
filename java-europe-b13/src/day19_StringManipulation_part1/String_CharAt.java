package day19_StringManipulation_part1;

public class String_CharAt {

	public static void main(String[] args) {

		String word = "Computer";  //str.length()-1  --> son karakteri verir.
		
			
		System.out.println(word.length()); //lenhth --> Character sayýsýný verir. 0 dan  baþlar.
		
		System.out.println(word.charAt(0)); //charAt(0)--> 1. karekteri verir.
		System.out.println(word.charAt(1)); //2. karekteri....
		System.out.println(word.charAt(2)); //3........
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8)); //0-1-2-3-4-6-7 => karekter olduðu için 8 hata verir.
		
		//*******Check if first character  is A
		
		String word2 = "Apple";
		
		if (word2.charAt(0)== 'A') {
			System.out.println("A is first");
		}else {
			System.out.println("A is not first");
			
		}
			
		//********Check if first and last characters are same 
		
			String word3="civic";
			
			char first =word3.charAt(0);
			char last = word3.charAt(4);
			
			if (first == last) {
				
				System.out.println("First and last character are same :");
			}else {
				System.out.println("First and last character are not same :");
			}
			
			
		}
	}


