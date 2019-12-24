package day28_arrays_Lab4;
import java.util.Arrays;

public class Question5_ {

	public static void main(String[] args) {

		int [] x = {1,2,3};
		
		System.out.println(Arrays.toString(accepts (x)));

	}
	
	public static int [] accepts(int [] array) {
		
		int x = array [0];
		
		for (int i = 0; i < array.length-1; i++) {
			
			array [i] = array[i+1];
			
			
			}	
		
		array [array.length-1] = x;
			return array;
	}

}
