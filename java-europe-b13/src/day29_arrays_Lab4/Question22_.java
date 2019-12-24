package day29_arrays_Lab4;

public class Question22_ {

	public static void main(String[] args) {
		int [] x = {1,1,4,1,4,4,4};

			
	System.out.println(great(x));
	}
public static boolean great(int [] arr) {
	
	boolean big = true;
	int a=0;
	int b=0;
	for (int i=0;i<arr.length;i++) {
		
		if (arr [i]==1) {
			a++;
		}else if (arr[i]==4) {
			b++;
		}if (a>b) {
			big=true;
		}else {
			big=false;
		}
	}
	return big;
}
}
