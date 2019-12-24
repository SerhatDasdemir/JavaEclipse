package day28_arrays_Lab4;
import java.util.Arrays;

public class Question4_ {
/*Write a method that accepts an array and prints the sum of all elements in the array*/
	
	public static void main(String[] args) {

		int[] x = {1,2,3}; 
		int[] y = {17,12,10,8};
		int[] a = {7,0,0}; 
		
		rotateLeft(x);
		
		System.out.println(Arrays.toString(rotateLeft(x)));
		System.out.println(Arrays.toString(rotateLeft(y)));
		System.out.println(Arrays.toString(rotateLeft(a)));
	}

public static int[] rotateLeft(int[] x) {
		
		int[] sum = new int[x.length];
		
		for (int i = 0; i < x.length-1; i++) {
	
		
		
		
		}	
		return sum;
	}

}
