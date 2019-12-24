package day25_arrays_part2;

import java.util.Scanner;

public class PassArray2 {

	public static void main(String[] args) {
		
		// create an array
		int [] numbers = new int [4];
		
		System.out.println("veri adedi: " + numbers.length);
		
		
		//pass the array to the gerValues method.
		getValues (numbers); // numbers -- 4 veri içerdiği için "getValues" methodu da 4 veri içerecek.
		
		System.out.println("Here are the numbers that you entered");

		//pass the array to showArray method.
		showArray (numbers);
		
	}
	public static void getValues(int [] array) { //getValues(numbers) - array olduğu için [] array kullandık.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a series of "+ array.length + " numbers");
		
		for (int i=0;i<array.length;i++) {
			
			System.out.println("Enter number " + (i+1)+ " :");
			array[i] = sc.nextInt();
			
			
		}
}
	public static void showArray(int [] array2) { //getValue -- methodunu buraya uyguladık.
	
		for (int value : array2) {
			System.out.println("*" + value);
	
	
}
}

}
