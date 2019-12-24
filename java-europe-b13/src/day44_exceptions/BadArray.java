package day44_exceptions;

public class BadArray {

	public static void main(String[] args) {
		
	//try { //--> try + catch method hatayı görmez. istisna olarak calisir.
		int [] number = {1,2,3};
		
		for (int i=0;i<=number.length;i++) {
			System.out.println(number[i]);
		}
	//}catch(Exception a){
		
		System.out.println("Serhat deneme");
		
	//}
		
	}

}
