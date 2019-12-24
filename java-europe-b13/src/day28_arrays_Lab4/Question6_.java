package day28_arrays_Lab4;

import java.util.Arrays;

public class Question6_ {
 /*Write a method that accepts an array and figure out which is greatest element in the
array, a and set all the other elements to be that value. Print the changed array.*/
	
	public static void main(String[] args) {

		int [] x = {1,20,3,50,100,2,5,9};
		
		System.out.println(Arrays.toString(greater(x)));

	}
	
	public static int [] greater(int [] array) {
		
		int great = array[0];
		
		for (int i = 0; i < array.length-1; i++) {
			
							
			if (array[i+1]>great) {
				
				great = array [i+1];
			}	
		
			
		}
		for (int i = 0; i < array.length; i++) {
			
			array [i] = great;
			
		}
			return array;

	}

}
