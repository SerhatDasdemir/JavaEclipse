package day29_arrays_Lab4;

public class Question21_ {

	public static void main(String[] args) {

			int []x = {2,3,2,2,2,8};
			
			System.out.println(sum2(x));

	}
	public static boolean  sum2(int [] arr) {
	
		boolean two = true;
		int x =0;
	for (int i=0; i<arr.length;i++) {
		
		if (arr[i]==2) {
			
			x++;
		}
		
		if (x==4) {
			two = true;
		}else {
			two = false;
		}
		
	}
	
	return two;
}
}
