package day12_controlFlowStatements_Part6;

public class BreakContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<=7; i++) {
			
			if (i==4) {
				//break; // i=4 e gelince a�a��daki kodu i�letmeyi kesecek. Ama 4 e e�itlenene kadar �al��acak.
				continue; //i=4 e gelince atlay�p kodu �al��t�rmaya devam edecek.
			}
			
			System.out.println(i);
		}
		

	}

}
