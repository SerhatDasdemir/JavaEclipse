package day28_arrays_Lab4;

import java.util.Arrays;

public class Question15_ {

	public static void main(String[] args) {

		int [] x = {1,2,3,4};

		System.out.println(Arrays.toString(swap(x)));
		
		
	}
		public static int [] swap(int [] arr) {
			
			int newarr = 0;
			
				newarr = arr[0];
				arr[0] = arr [arr.length-1];
				arr [arr.length-1] = newarr;
				
				return arr;
				
			
	}

}
