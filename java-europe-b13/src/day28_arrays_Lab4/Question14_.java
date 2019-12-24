package day28_arrays_Lab4;

import java.util.Arrays;

public class Question14_ {

	public static void main(String[] args) {
		
		int [] x = {7,2,2,6,8,7};
		int [] y = {3,4,5,6,8};
		
		sumArray(x,y);
		
		
	}
	public static void sumArray(int [] arr1, int [] arr2) {
		
		int [] newarray = new int [arr1.length+arr2.length];
		
		for (int i=0;i<arr1.length;i++) {
			
			newarray[i]=arr1[i];
			
		}
		int a=0;
		for (int j=arr1.length;j<newarray.length;j++) {
			
			newarray[j]=arr2[a];
			a++;
		}
		
		System.out.println(Arrays.toString(newarray));
		
	}
		
		
	}


