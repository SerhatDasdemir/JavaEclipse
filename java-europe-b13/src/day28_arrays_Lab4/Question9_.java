package day28_arrays_Lab4;

import java.util.Arrays;

public class Question9_ {
/*Write a method that accepts an array and prints a new array with double the length
where its last element is the same as the original array,*/
	public static void main(String[] args) {
		
		int [] x 	  = {4,5,6,7,8,9};
		int [] array2 = {};

		System.out.println(Arrays.toString(doubleLengt(x,array2)));
		
	}
	
	public static int [] doubleLengt(int [] array , int [] array2) {
		
		 	array2= new int [array.length*2];
			
			array2[array2.length-1] = array [array.length-1];
			
			
			return array2;	
	}

}
