package day20_StringManipulation_part2;

public class String_IndexOf {

	public static void main(String[] args) {

		String word1 = "github";
		
		System.out.println(word1.indexOf("g")); //g --  -- görene kadar kaç karakter var sayar.
		
		System.out.println(word1.indexOf("th")); //th--  -- görene kadar kaç karakter var sayar.
			
		System.out.println(word1.indexOf("hub")); //hub -- görene kadar kaç karakter var sayar.
		
		System.out.println(word1.indexOf("java")); // referansta "java" göremediði için // -1
		
		String url = "www.okta.com";
		
		int i = url.indexOf(".");
		
		System.out.println("pos of . " + i); // .  -- görene kadar sayar.
		System.out.println(url.charAt (i+1)); // . dan +1 sonraki harfi gösterir.
		
		//find position of "-" and check if space is on right and left side.
		
		String title = "Java - Google Serch";
		
		int dash=title.indexOf('-');
		
		System.out.println(title.charAt(dash-1));// "-" öncesi - ve sonrasý boþluk olduðu için boþluk gösterir.
		System.out.println(title.charAt(dash+1));// "-" sonrasý + boþluk olduðu için boþluk gösterir.
		System.out.println("*Apple*");
		
		//......
		
		String country = "United States of America";
		
		int states = country.indexOf("States");
		
		System.out.println("Position of States: " + states); //7
		
		//check if c++ is in the word2 :
		
		String word2= "java, c++, python, tomcat, eclipse";
		
		
			
			
			//1)contains()
			if(word2.contains("c++")) {
				System.out.println("c++ is there");
			}else {
				System.out.println("c++ is not there");
			}
			
			
			//2)indexOf()
			if(word2.indexOf("c++") > -1) { //metin içerisinde "c++" göreceði için 6>1 --> true // Eðer göremeseydi -1 olurdu.
				System.out.println("c++ is there");
			}else {
				System.out.println("c++ is not there");
			}
		
		
	}

}
