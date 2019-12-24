package day11_controlFlowStatements;

public class forLoopRules {

	public static void main(String[] args) {

		//1-Creating an infinite loop 
		//components of the for loop are each optional
			//Sonsuz bir döngü oluþturma
			// for döngüsünün bileþenleri isteðe baðlýdýr
	
//		for( ; ; ) {
//			System.out.println("Hello");
//		}
	
//		int i=1;
//		
//		for( ;i<=5;i++) {
//			System.out.println(i);
//		}
		
//		for( ;  ; i++) {
//			System.out.println(i);
//		}
		
//		for( ;i<=5;) {
//			System.out.println(i);
//		}
		
		//2-Adding Multiple Terms to the for statement (For ifadesine Birden Fazla Terim Ekleme)
		
//		int x=0;
		
//		for(long y=0,z=4 ; x<5 && y<10 ; x++,y++) {
			
//			System.out.print(y + " ");
//		}
		
//		System.out.println(x);
		
		//3-Redeclaring a variable in the init block (3-init bloðundaki bir deðiþkeni yeniden ifade etmek)
		
//		int x = 0;
//		for(long y=0,x=4; x<5&&y<10; x++,y++) { //does not compile
//			System.out.println("Hello");
//		} 
		
//		int x = 0;
//		long y = 0;
//		
//		for(y=1,x=4 ; x<5 && y<10 ; x++,y++) {
//			System.out.println("Hello");
//		}
	
		//4-Using incompatible data types in the init block 
		//the variables in the init block must all be of the same data type
			// 4-init bloðundaki uyumsuz veri türlerini kullanma
			// init bloðundaki deðiþkenlerin hepsi ayný veri tipinde olmalý
	
//		for(long y=0, int x=0; x<5 && y<10 ; x++,y++) {
//			System.out.println("Hello");
//		}
	
	  //5-Using loop variables outside the loop (Döngünün dýþýndaki loop deðiþkenlerini kullanma)
		
//		for(long y=0,x=4; x<5&&y<10; x++,y++) {
//			System.out.println("Hello");
//		}
//		System.out.println(x); //does not compile


	}

}
