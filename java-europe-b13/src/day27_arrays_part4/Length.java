package day27_arrays_part4;

public class Length {

	public static void main(String[] args) {

		int [] [] numbers = { 
				
				{10,20,30,40} , 
				{50,60}, 
				{90,100,110,230,300,500,600} 
				
				};
		
		
		
		//display the number of row
		
		System.out.println(numbers.length);
		
		
System.out.println("---------------");

		//display the number of columns in each row

		for (int i = 0 ; i<numbers.length ; i++) {
				
		System.out.println ("The number of columns in row " + i + " is " + numbers [i].length);}
		
System.out.println("-------------------");
		
		//Displaying All the Elements of a 2-D Array
		
		for (int row = 0 ; row<numbers.length; row++) {
			
			for (int column = 0 ; column < numbers[row].length; column++) {
				
				System.out.print(numbers [row][column] +" ");
				
			}
			
			System.out.println("*");
		}
		
		
	}

}
