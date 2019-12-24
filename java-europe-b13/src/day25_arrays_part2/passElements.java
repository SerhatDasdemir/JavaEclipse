package day25_arrays_part2;

public class passElements {

	public static void main(String[] args) {


		int [] num = {5,10,15,20,50,30};
		
		for (int value : num) {
			
			showValue (value);
		}

	}
public static void showValue(int n) {
	System.out.print(n+" ");
}
}
