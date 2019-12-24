package day10_controlFlowStatements_Part4;

public class task_44_SpeedConver {

	public static void main(String[] args) {
		
		System.out.println("  KPH \t\t MPH" );
		System.out.println("|------|----------------|");
		
		int KPH = 60;
		
		
		for (KPH=60; KPH<=130; KPH+=10) {
			double MPH = KPH*0.6214;
			System.out.println("| " + KPH + "\t\t"+ (int)MPH + "      |      ");
			System.out.println("|------|----------------|");
			
		}
		}
		

	}


