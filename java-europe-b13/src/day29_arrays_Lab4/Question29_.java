package day29_arrays_Lab4;

import java.util.Arrays;

public class Question29_ {

	public static void main(String[] args) {

		int []x = {2,10,3,4,20,5,100,2,36,6};

		System.out.println(Arrays.toString(multiple10(x)));

	}
	public static int [] multiple10(int [] arr) {
		
	for (int i = 0; i<arr.length; i++) {
				
		if (arr[i]%10==0) {
			
			for(int j=i+1;j<arr.length && arr[j]%10 != 0;j++) {
				
				arr[j]=arr[i];
				
			}
			
		}
		
	}
	return arr;
	
	
}
}
