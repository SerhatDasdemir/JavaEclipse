package day28_arrays_Lab4;

import java.util.Arrays;

public class Question13_ {

	public static void main(String[] args) {
		
		int [] x = {7,2};
		int [] y = {3,4};
		
		first1 (x,y);

		

	}
	
	public static void first1(int [] arr1, int [] arr2) {
		
		int sum1 = 0;
		int sum2= 0;
		
		
		for (int i=0; i<arr1.length-1;i++) {//for (int value:arr1){
			
			sum1=sum1+arr1[i];
		}
		for (int i=0; i<arr2.length-1;i++) {//for (int value:arr2){
			
			sum2=sum2+arr2[i];
		}
			
			if (sum1>sum2) {
				
				System.out.println(Arrays.toString(arr1));
				
			}else if (sum2>sum1) {
				
				System.out.println(Arrays.toString(arr2));
			}else {
				
				System.out.println("equal");;
			}
			
	}

}
