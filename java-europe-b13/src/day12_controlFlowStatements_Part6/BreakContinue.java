package day12_controlFlowStatements_Part6;

public class BreakContinue {

	public static void main(String[] args) {
		
		for (int i=1; i<=7; i++) {
			
			if (i==4) {
				//break; // i=4 e gelince aşağıdaki kodu işletmeyi kesecek. Ama 4 e eşitlenene kadar çalışacak.
				continue; //i=4 e gelince atlayıp kodu çalıştırmaya devam edecek.
			}
			
			System.out.println(i);
		}
		

	}

}
