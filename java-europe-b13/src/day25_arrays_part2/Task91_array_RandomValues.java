package day25_arrays_part2;

import java.util.Random;

public class Task91_array_RandomValues {

	public static void main(String[] args) {
		/*	�Create an array with 10 elements
			�Initialize each array element with random values between 0 and 100 but less than 100
			�Print each array element*/
		
		Random rn = new Random();
		int[] numbers = new int[10];
		
			
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = rn.nextInt(100);
			System.out.println(numbers[i]);
		}
	}

}
