package day13_methods_Part1;

public class StudentMethod {

	public static void main(String[] args) {
		
		System.out.println("xxxxx");
		
		sayHello(); //method adýný burada belirtiyoruz ki aþaðýdaki methodta yazýlan kod çalýþsýn.
		sayHello(); //çünkü burasý main = "ANA" method
		sayHello();//buraya aþaðýdaki methodu kaç defa yazarsak aþaðýdaki kodu okadar defa çalýþtýrýrýz.
		
		
		
		code(); //aþaðýda açacaðýmýz her methodun ismini  burada belirtiyoruz.
		
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
