package day13_methods_Part1;

public class StudentMethod {

	public static void main(String[] args) {
		
		System.out.println("xxxxx");
		
		sayHello(); //method ad�n� burada belirtiyoruz ki a�a��daki methodta yaz�lan kod �al��s�n.
		sayHello(); //��nk� buras� main = "ANA" method
		sayHello();//buraya a�a��daki methodu ka� defa yazarsak a�a��daki kodu okadar defa �al��t�r�r�z.
		
		
		
		code(); //a�a��da a�aca��m�z her methodun ismini  burada belirtiyoruz.
		
		study();
	}
	
	public static void sayHello() {
		
		System.out.println("Inseide sayHello method");
		
	}
	
	public static void code() {
		
		System.out.println("Student is stuydying");
					
	}
	public static void study() {
		
		System.out.println("Student is stuydying java");
		

	}
	
}
