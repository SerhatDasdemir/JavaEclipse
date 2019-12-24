package day20_StringManipulation_part2;

public class String_Equals {
		/* equals () yöntemi: dizenin içeriðine baðlý olarak verilen iki dizeyi karþýlaþtýrýr. 
		Herhangi bir karakter eþleþmezse: false 
		Tüm karakterler eþleþirse: doðru */
	
	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";
		
		boolean b1 = s1.equals(s2); //s1==s2 olduðu için : true
		boolean b2 = s1.equals(s3); //s1==s3 olmadýðý için : false
		
		System.out.println(b1 + "|" + b2);
		
		boolean b3 = s1 == s2; //true
		boolean b4 = s1 == s3; //false
		
		System.out.println(b3 + " | " + b4);
		
		String s4 = new String ("Welcome to Java"); //burada referans "java pool" dýþýna atýldýðý için "heap" hafýzada olduðundan eþitlik görülmez. 
		
		System.out.println(s1==s4);
	}

}
