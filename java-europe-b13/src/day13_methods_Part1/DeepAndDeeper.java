package day13_methods_Part1;

public class DeepAndDeeper {

	public static void main(String[] args) {

		System.out.println("I am starting in main");
		deep();
		System.out.println("  Now ý am back in main");
		deeper();
		
	}

	
	public static void deep() {
		
		System.out.println("	I am now in deep");
		
		//deeper(); //aþaðýda deeper içinde çalýþtýðý için bu metod sýnýrsýz döngüye girer.
		
		System.out.println("		Noe ý am back in deep");
		
	}
	
	public static void deeper() {
		deep(); //yukarýda yada aþaðýda tüm metodlarý bir birine yazabilirsin. Ama bu metod yukarýdakinde varsa onu buraya 
			//yazamazsýn çünkü döngü sýnýrsýz olur.
		
		System.out.println("			I am now in deeper");
		
	}
}
