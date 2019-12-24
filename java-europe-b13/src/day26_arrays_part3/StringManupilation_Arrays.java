package day26_arrays_part3;

import java.util.Arrays;

public class StringManupilation_Arrays {

	public static void main(String[] args) {


		String [] myCars = {"Honda", "Mercedes", "BMW","Toyota", " Ford "};

		System.out.println(myCars [0].length());
		System.out.println(myCars [1].charAt(2));
		System.out.println(myCars [4].trim());
		System.out.println(myCars [2].substring(2,3));
		System.out.println(myCars [1].equals(myCars[2])); // Mercedes == BMW = false
		
		System.out.println("==================================================");
		
		for (int i=0;i<myCars.length;i++) {
			System.out.println(myCars[i].length()); // honda --5 // mercedes --8 //--3//--6//--6 (boþluklar ile)
			
		}
		System.out.println("-----------------------------------------------------");
		
		String str = "It will display the array of the size";
		
		str.split(" "); // " " arasındaki kelime sayısını verir.
		
		String [] arr = str.split (" "); 
		
		  System.out.println(arr.length);
	        
	        //System.out.println(Arrays.toString(arr));
	        
	        System.out.println(arr[2]);
	        System.out.println(arr[4]);
	        
	        
	        for(String value : arr) {
	            
	            System.out.println(value);
	        }
		
	}

}
