package day28_arrays_Lab4;



public class Question8_ {
/*Write a method that accepts an array and prints true if it contains a 2 or a 3*/
	public static void main(String[] args) {
		
				int[] x = {2,5}; 
				int[] y = {4,3}; 
				int[] z = {4,5}; 
				
				System.out.println(num23(x));
				System.out.println(num23(y));
				System.out.println(num23(z));
	}
	
	public static boolean num23 (int [] arr) {
		
		for (int value : arr) {
			
			if (value == 2 || value == 3) {
				
				return true;
				
			
			}
		}
	
		return false;
}}
