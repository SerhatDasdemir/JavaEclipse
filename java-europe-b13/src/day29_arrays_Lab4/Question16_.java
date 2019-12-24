package day29_arrays_Lab4;

public class Question16_ {
/*Write a method that accepts an array and prints the number of even numbers in the
array.*/
	public static void main(String[] args) {
		
		int [] x = {2,1,2,3,4};
		int [] z = {1,3,5};
		System.out.println(evenNum(x));
		System.out.println(evenNum(z));
		
	}
	public static int evenNum(int [] arr) {
	int n =0;
	
	for (int i = 0 ;i<arr.length;i++) {
		
		if (arr[i]%2==0) {
			
			n++;
							}
		
										}
	
	return n;
	
	}
	}
