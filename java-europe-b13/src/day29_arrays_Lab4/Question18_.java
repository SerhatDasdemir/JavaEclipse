package day29_arrays_Lab4;

public class Question18_ {
/*Write a function that accepts an array and prints the sum of the numbers in the
array. Except the number 13 is very unlucky, so it does not count and numbers that
come immediately after a 13 also do not count*/
	public static void main(String[] args) {
		
				int[] x = {1,2,2,1};
				int[] y = {1,1};
				int[] a = {1,2,2,1,13};
				int[] b = {1,2,13,1,13,3};
				
				System.out.println(unlucky(a));
				System.out.println(unlucky(b));
				System.out.println(unlucky(x));
				System.out.println(unlucky(y));

	}
	public static int  unlucky	(int [] arr) {
		int sum = 0;
		
		for (int i=0;i<arr.length;i++) {
			
			
			if (arr[i] == 13) {
			break;
			}
			
			sum = sum+arr[i];
				
		}
		
		return sum;
	
}
}
