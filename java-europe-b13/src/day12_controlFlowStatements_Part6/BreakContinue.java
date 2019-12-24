package day12_controlFlowStatements_Part6;

public class BreakContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<=7; i++) {
			
			if (i==4) {
				//break; // i=4 e gelince aþaðýdaki kodu iþletmeyi kesecek. Ama 4 e eþitlenene kadar çalýþacak.
				continue; //i=4 e gelince atlayýp kodu çalýþtýrmaya devam edecek.
			}
			
			System.out.println(i);
		}
		

	}

}
