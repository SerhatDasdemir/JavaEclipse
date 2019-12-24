package day28_arrays_Lab4;

import java.util.Arrays;

public class Question12_ {

	public static void main(String[] args) {


		int [] x = {2,3};
		int [] y = {11,2,3,5,8,9,2,3};
		
		System.out.println(first1 (x,y));

		

	}
	
	public static int first1(int [] arr1, int [] arr2) {
		
		int output = 0;
		
		
			
			if (arr1 [0] == 1 && arr2[0] == 1) {
				
				output = 2;
			}else if (arr1 [0] == 1 || arr2[0] == 1) {
				
				output = 1;
			}else {
				
				output = 0;
			}
			
		
		return output;
	}

}
