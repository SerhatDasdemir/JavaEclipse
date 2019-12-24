package day11_controlFlowStatements;

public class task_51_Clock {

	public static void main(String[] args) {
		
		
		for (int a=1; a<=59; a++) {
			
			for (int x=1; x<=24; x++) 
				
					for (int y=0; y<=59; y++) 
						
							for (int z=0; z<=59; z++) 
			
					if (y<10 && z<10) {System.out.println( x + ": 0" +y + " : 0" + z );}
						else if (y<10 ) {System.out.println(x + ": 0" +y + " : " + z);}
							else if (z<10) {System.out.println( x + ": " +y + " : 0" + z);}
								else System.out.println(x + ": " +y + " : " + z);
							
						} 
							
							
								}	}
			
			
			
						
		
			//System.out.print(x +" : ");
				//System.out.print( y + " :");
				//	if (i<10 && i>=1) {System.out.println("0"+i); 
					//}else System.out.println(i);}}
		
		
			//for (int i=1; i<=59 ; i++) {
			//	 int x=1; int y=0;
			//	System.out.print("0" +x + ": ");
			//		System.out.print("0" + y + ":");
			//			if (i<10 && i>=1) {System.out.println("0" + i);
				//		} else System.out.println(i); }
			
		//	for (int i=1; i<=59 ; i++) {
			//	 int x=1; int y=1;
			//	System.out.print("0" +x + ": ");
				//	System.out.print("0" + y + ":");
				//		if (i<10 && i>=1) {System.out.println("0" + i);
				//		} else System.out.println(i); }
			
	
	
	
				
			

	


