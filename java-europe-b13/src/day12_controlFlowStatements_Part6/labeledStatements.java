package day12_controlFlowStatements_Part6;

public class labeledStatements {

	public static void main(String[] args) {

		/*It is possible to break and continue outer loops when dealing with nested loops. In these
cases, the loops must be annotated with some label, and the label must be passed to the
break/continue statement.*/
		/*Ýç içe döngüler ile çalýþýrken dýþ döngüleri kýrmak ve devam ettirmek mümkündür. 
		 * Bu gibi durumlarda, ilmeklere bir etiket eklenmiþ olmalý ve etiket, 
		 * break / continue deyimine geçirilmelidir.*/

		int i=0;
		outer:
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--); //i=8
						if(i==4) {
							break outer; // i=4 olana kadar çalýþtýrýr ve durur.
										// "outer" silersek sonsuza kadar 8-7-6-5 devam eder.
							
						
						}
					}
			}
			
							while(true);

	}

}
