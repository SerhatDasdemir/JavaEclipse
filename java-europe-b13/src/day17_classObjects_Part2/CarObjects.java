package day17_classObjects_Part2;



public class CarObjects {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		BMW b2 = new BMW();
		
		System.out.println(b1.make); //BMW.java s�n�f�nda make=BMW atad���m�z i�in burada atama yapmadan otom. geliyor.
		System.out.println(b2.make);
		
		System.out.println(b1.model);//BMW.java s�n�f�nda model= ".." atamad���m�z i�in burada "null" geliyor.
		
		
		b1.make = "BMW2019"; 
		System.out.println(b1.make);
		
		b1.model = "740i";	//burada model atamas� yap�nca BMW s�n�f�ndan bu modelin fiyat�n� getirebiliriz.	
		b1.showPrice(); //model=740i atamas� yap�ld��� i�in fiyat�n� getirebiliriz.
		
		
		
	}

}
