package day29_arrays_Lab4;

public class Question20_ {
/*Write a method that accepts an array and prints true if the array contains a 2
next to a 2 somewhere.*/
	
	public static void main(String[] args) {

				int[] x = {1,2,2};		// = > true
				int[] y = {1, 2, 1,2};	// = > false
				int[] a = {2,1,2};		// = > false
				int[] b = {2,2,1,2};	// = > true
				
				System.out.println(num2and2(x));
				System.out.println(num2and2(y));
				System.out.println(num2and2(a));
				System.out.println(num2and2(b));
				
	}
	
	public static boolean num2and2(int [] arr) {
		
		boolean j = false;	
		
		for (int i=0;i<arr.length-1;i++) {
			
			
					if (arr[i]==2 && arr[i+1]==2) {
						
						j= true;
						break;
						
					}else {
						
						j=false;
					}
						
				}
		
		return j;
		
	}

}
