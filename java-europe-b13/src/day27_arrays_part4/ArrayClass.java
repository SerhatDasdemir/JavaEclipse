package day27_arrays_part4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
	
		//toString();
		
		int [] nums = {43,12,4,1,3,5};
		
		System.out.println(Arrays.toString(nums)); //listeyi gösterir.
		
		//equals();
		
		int [] nums1 = {4,5,6,10,100};
		int [] nums2 = {4,5,6,10,100};

		System.out.println(Arrays.equals(nums1, nums2));
		
		//sort(); : sort array in ascending order. : diziyi artan düzende sýralayýn.
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		String [] languages = {"zulu","spanish","italian","english","1polish","arabic"};
		Arrays.sort(languages); //alfabetik sýraya koyar.
		System.out.println(Arrays.toString(languages));
		
		//binarySearch();
		
		int [] numX = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(numX, 7));
		System.out.println(Arrays.binarySearch(numX, 55));
		System.out.println(Arrays.binarySearch(numX, 5)); //-2 ==> 5 -> 4 ile 6 arasýnda. yani olsaydý 0-1. sýrada olacaktý. ama bulunamadý.   (- (insertionPoint) -1) = -1 -1 = -2
		
		System.out.println(Arrays.binarySearch(numX, 15));//-5==> 15 -> 10 ile 55 arasýnda. bulunsaydý 4. sýrada olacaktý. numX :-1 ve -4 = -5
		 
		//copOf();
		
		double [] d1 = { 2.3,4.5,12.4};
		double [] d2 = d1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0] = 100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2 [1] = 400.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		//double [] d3 = Arrayas.copyOf(d2, d2.length);
		
		double [] d3 = Arrays.copyOf(d2, d2.length);
		System.out.println(Arrays.toString(d3));
		
		d2[0] = 5.2;
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
		
	}

}
