package day44_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		//bu alanda bir hata var ise try-catch method da calismaz. Hata try icerisinde olamli.

try { //Burada bir hata var ise program durmaz, catch blok calisir ve kod devam eder.
		String str = "Java";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5)); //Burada hata oldugundan alt sıra (11) de calismaz. catch bloka gecer.
		System.out.println(str.charAt(1));
		
}catch (Exception e) { //eger yukarda hic hata yok ise burasinin calismasina gerek kalmaz.
	
	System.out.println("Exception heppened in try block and was cought");
}
		System.out.println("After try catch block");
		
	}

}
