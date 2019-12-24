package day11_controlFlowStatements;

public class doWhileLoop {

	public static void main(String[] args) {
		
		/*do...while ve while döngüleri arasýndaki tek fark, 
		test koþulunun (ifadenin) do while döngüsünde, döngünün sonunda yer almasýdýr. 
		Bunun anlamý, programýn döngüyü hiç olmazsa bir kez çalýþtýrmasýdýr (ilk kez). 
		Sonra, ifadenin deðerine baðlý olarak, ifade doðru ise tekrar do'ya dönülerek döngü sürebilir veya 
		ifade yanlýþ ise bir sonraki deyimle devam edilebilir.*/

		int i =5;
		
		do {
			
			System.out.println(i);
			i++;
			
		} while (i<=10);

	}

}
