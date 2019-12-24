package day21_StringManipulation_part3;

public class String_SubString {

	public static void main(String[] args) {


		String sentence = "Java String Manipulation is fun!";
		
		System.out.println(sentence.substring(2));//0 - 1 'harfleri görmez--> 2. harf ve devamýný çýkartýr.
		System.out.println(sentence.substring(5,11));//5. harften itibaren 11. harfe kadar. 11. harfi görmez.
		
		System.out.println(sentence.length()); //toplam karakter sayisini gösterir.
		
		System.out.println(sentence.substring(5,sentence.length()-5)); //sentence.substring (5, (32-5)) : String Manipulation is
	
	
		String chars = "{{}}";
		String word = "AUTOMATION";
		
		System.out.println(chars.substring(0,2)+ word + chars.substring(2));
		
		String str ="  342  ";
		System.out.println("|"+str.trim()+"|");
	
	}

}
