package day29_arrays_Lab4;

public class Question24_ {

	public static void main(String[] args) {

			int [] x = {1,2,3,2};
		
			int givnum = 1;
	
	System.out.println(adjacent (x,givnum));
	}

	public static boolean adjacent(int [] arr, int number) {
		int l = 0;
		boolean x = true;
		
		
		for (int i=0; i<arr.length;i++) {
			
			if (arr[i]==number) {
			l++;
			
		}
			if (l==2) {
				x=true;
			}else {
				x=false;
			}
	}
		return x;
	
}}
