package day28_arrays_Lab4;

import java.util.Arrays;

public class Question7_ {
/*Write a method that accepts 2 arrays and prints the second array containing the first
and last elements from the first array.*/
	
	public static void main(String[] args) {
		

			int [] x = {1,20,3,50,100,2,5,9};
			int [] y = {};
			
			System.out.println(Arrays.toString(greater(x,y)));

		}
		
		public static int [] greater(int [] array, int [] y) {
			 y = new int [2];
			
			y[0] = array [0];
			y[1] = array [array.length-1];
			
			return y;	
	}
		
}


