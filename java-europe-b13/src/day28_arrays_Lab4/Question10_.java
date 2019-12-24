package day28_arrays_Lab4;

import java.util.Arrays;

public class Question10_ {
/*Write a method that accepts an array and prints true if the array contains 2 twice or 3
twice.*/
	public static void main(String[] args) {
		
		int[] x = {2,2};
		int[] y = {3,3};
		int[] b = {12,20,42};
		
		System.out.println(doubleLengt(x));
		System.out.println(doubleLengt(y));
		System.out.println(doubleLengt(b));

	}
	public static boolean doubleLengt(int [] array ) {
		
		int counter2=0;
		int counter3=0;
		
	 	for (int value : array) {
	 		
	 		if (value == 2) {
	 			counter2++;
	 		}else if (value == 3) {
	 			counter3++;
	 		}
	 	}
	 	if (counter2 == 2 || counter3 == 2) {
	 		return true;
	 		
	 	}else {
	 		return false;
	 	}
}}
