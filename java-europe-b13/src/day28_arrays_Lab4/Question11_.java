package day28_arrays_Lab4;

import java.util.Arrays;

public class Question11_ {

	public static void main(String[] args) {

		int [] x = {1,2,3};
		int [] y = {11,2,3,5,8,9,2,3};
		
	System.out.println(Arrays.toString(foolow (x)));
	System.out.println(Arrays.toString(foolow (y)));

	}

	
	public static int []  foolow(int [] arr) {
		
		for (int i=0;i<arr.length-1;i++) {
			
			
			if (arr[i] == 2 && arr [i+1]==3) 	{
				
				arr[i+1]=0;
				
												}
			
											}
		return arr;
		
		
	}
}
