package day20_StringManipulation_part2;

public class String_Equals {
		/* equals () y�ntemi: dizenin i�eri�ine ba�l� olarak verilen iki dizeyi kar��la�t�r�r. 
		Herhangi bir karakter e�le�mezse: false 
		T�m karakterler e�le�irse: do�ru */
	
	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";
		
		boolean b1 = s1.equals(s2); //s1==s2 oldu�u i�in : true
		boolean b2 = s1.equals(s3); //s1==s3 olmad��� i�in : false
		
		System.out.println(b1 + "|" + b2);
		
		boolean b3 = s1 == s2; //true
		boolean b4 = s1 == s3; //false
		
		System.out.println(b3 + " | " + b4);
		
		String s4 = new String ("Welcome to Java"); //burada referans "java pool" d���na at�ld��� i�in "heap" haf�zada oldu�undan e�itlik g�r�lmez. 
		
		System.out.println(s1==s4);
	}

}
