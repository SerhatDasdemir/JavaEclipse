package day25_arrays_part2;

import java.util.Arrays;

public class Task92_ {

	public static void main(String[] args) {

		
		int[] num = new int [10];
		
		for(int i=0; i<num.length; i++) {
			
		num[i]=i+1; //0-9 arası olacağı için +1 diyoruz.
				
		System.out.println(num[i]*19);
		
		}
		
		System.out.println(Arrays.toString(num));//Array formatında yazdırmak "Arrays.toString"
	}

}
