package day29_arrays_Lab4;

public class Question17_ {
/*Write a method that accepts an array and print the difference between the largest and
smallest values in the array.*/
	public static void main(String[] args) {

		int[] x = {1,2,10,9};
		
		System.out.println(difference(x));

	}
	
	public static int difference(int[] arr) {
		
		//finding the biggest
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
			}
		}
		
		//finding the smallest
		int min = max;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				
				min = arr[i];
			}
		}
		
		return max-min;
		
		
	}

}
