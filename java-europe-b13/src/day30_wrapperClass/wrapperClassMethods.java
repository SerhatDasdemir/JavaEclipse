package day30_wrapperClass;

public class wrapperClassMethods {

	public static void main(String[] args) {


		System.out.println(Byte.MIN_VALUE);//-128
		System.out.println(Byte.MAX_VALUE);//127
		
		System.out.println(Integer.MIN_VALUE); //-2147483648
		System.out.println(Integer.MAX_VALUE); //2147483647
		
		System.out.println(Character.MIN_VALUE); //
		System.out.println(Character.MAX_VALUE); //?
		
		System.out.println(Character.isAlphabetic('a'));//true
		System.out.println(Character.isAlphabetic('1')); //false
		
		System.out.println(Character.isLetter('j'));//harf -- true
		System.out.println(Character.isLetter('&')); //false
		
		System.out.println(Character.isDigit('5')); //true
		System.out.println(Character.isDefined('p')); //tanımlanmış -- true
		
		String word = "java101";
		System.out.println(Character.isAlphabetic(word.charAt(0))); //alfabeyi gösterdiği için -true
		System.out.println(Character.isAlphabetic(word.charAt(6))); //4-5-6 --> 101 rakamını göserdiğinden -false
		
		
	}

}
