package day13_methods_Part1;

public class DeepAndDeeper {

	public static void main(String[] args) {

		System.out.println("I am starting in main");
		deep();
		System.out.println("  Now � am back in main");
		deeper();
		
	}

	
	public static void deep() {
		
		System.out.println("	I am now in deep");
		
		//deeper(); //a�a��da deeper i�inde �al��t��� i�in bu metod s�n�rs�z d�ng�ye girer.
		
		System.out.println("		Noe � am back in deep");
		
	}
	
	public static void deeper() {
		deep(); //yukar�da yada a�a��da t�m metodlar� bir birine yazabilirsin. Ama bu metod yukar�dakinde varsa onu buraya 
			//yazamazs�n ��nk� d�ng� s�n�rs�z olur.
		
		System.out.println("			I am now in deeper");
		
	}
}
