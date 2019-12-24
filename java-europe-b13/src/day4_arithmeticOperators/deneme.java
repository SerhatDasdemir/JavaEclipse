package day4_arithmeticOperators;

public class deneme {

	public static void main(String[] args) {
		
		/*    byte<-short<-int<-long<-float<-double     */
		
		int x = 130;
		//byte b=x; //-çalýþmaz.(loss of data) Ama bu kod þöyle çalýþýr;
		
		byte b= (byte)x; //çalýþýr. //int (32bit)=>00000000 00000000 00000000 10000010
									//byte (8bit)=>1      0000010
									//complement form =>  1111101
									//                          1
									//					  1111110 => -126
		
		System.out.println(b);
		
		

	}

}
