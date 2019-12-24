package day17_classObjects_Part2;



public class CarObjects {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		BMW b2 = new BMW();
		
		System.out.println(b1.make); //BMW.java sýnýfýnda make=BMW atadýðýmýz için burada atama yapmadan otom. geliyor.
		System.out.println(b2.make);
		
		System.out.println(b1.model);//BMW.java sýnýfýnda model= ".." atamadýðýmýz için burada "null" geliyor.
		
		
		b1.make = "BMW2019"; 
		System.out.println(b1.make);
		
		b1.model = "740i";	//burada model atamasý yapýnca BMW sýnýfýndan bu modelin fiyatýný getirebiliriz.	
		b1.showPrice(); //model=740i atamasý yapýldýðý için fiyatýný getirebiliriz.
		
		
		
	}

}
