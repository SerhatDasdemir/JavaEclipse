package day24_arrays_part1;

public class Array {

	public static void main(String[] args) {

		/////////// INT /////////
		
		int [] myList = {10,20,30,40};
				//index:  0  1  2  3
		
		
		System.out.println(myList.length);		//4 -- element sayýsýný verir.
		
		System.out.println(myList[3]); //40
		System.out.println(myList[2]); //30
		System.out.println(myList[1]);
		System.out.println(myList[0]);
		
		System.out.println("*************");
		
		for (int i =0; i<myList.length; i++) {
			System.out.println(myList[i]);	//listedeki verileri sýralar.
		}
		System.out.println("");
		
		
		/////////////// STRÝNG ///////////////////////////
		
		String [] myArray = {"Apple","orange", "watermelon"};
		
		System.out.println(myArray[2]); //watermelon
		System.out.println(myArray.length); //3 - element sayýsýný verir.
		
		////////////////////////////////
		
		int [] scores = { 80,90,70,50,20,30,40,89,54,};
		int sum =0;
		for (int i =0 ; i<scores.length; i++) {
			
			sum=sum+scores[i];
		
			
			
		}
		System.out.println("sum is : "+ sum);
		System.out.println("Average is : " + sum/scores.length);
	}

}
