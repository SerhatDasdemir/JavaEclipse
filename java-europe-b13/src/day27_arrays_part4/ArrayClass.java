package day27_arrays_part4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
	
		//toString();
		
		int [] nums = {43,12,4,1,3,5};
		
		System.out.println(Arrays.toString(nums)); //listeyi g�sterir.
		
		//equals();
		
		int [] nums1 = {4,5,6,10,100};
		int [] nums2 = {4,5,6,10,100};

		System.out.println(Arrays.equals(nums1, nums2));
		
		//sort(); : sort array in ascending order. : diziyi artan d�zende s�ralay�n.
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		String [] languages = {"zulu","spanish","italian","english","1polish","arabic"};
		Arrays.sort(languages); //alfabetik s�raya koyar.
		System.out.println(Arrays.toString(languages));
		
		//binarySearch();
		
		int [] numX = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(numX, 7));
		System.out.println(Arrays.binarySearch(numX, 55));
		System.out.println(Arrays.binarySearch(numX, 5)); //-2 ==> 5 -> 4 ile 6 aras�nda. yani olsayd� 0-1. s�rada olacakt�. ama bulunamad�.   (- (insertionPoint) -1) = -1 -1 = -2
		
		System.out.println(Arrays.binarySearch(numX, 15));//-5==> 15 -> 10 ile 55 aras�nda. bulunsayd� 4. s�rada olacakt�. numX :-1 ve -4 = -5
		 
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
