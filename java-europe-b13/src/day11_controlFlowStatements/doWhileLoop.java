package day11_controlFlowStatements;

public class doWhileLoop {

	public static void main(String[] args) {
		
		/*do...while ve while d�ng�leri aras�ndaki tek fark, 
		test ko�ulunun (ifadenin) do while d�ng�s�nde, d�ng�n�n sonunda yer almas�d�r. 
		Bunun anlam�, program�n d�ng�y� hi� olmazsa bir kez �al��t�rmas�d�r (ilk kez). 
		Sonra, ifadenin de�erine ba�l� olarak, ifade do�ru ise tekrar do'ya d�n�lerek d�ng� s�rebilir veya 
		ifade yanl�� ise bir sonraki deyimle devam edilebilir.*/

		int i =5;
		
		do {
			
			System.out.println(i);
			i++;
			
		} while (i<=10);

	}

}
