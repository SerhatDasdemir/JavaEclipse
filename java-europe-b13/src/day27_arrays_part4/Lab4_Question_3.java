package day27_arrays_part4;

public class Lab4_Question_3 {

	public static void main(String[] args) {
		
		int [] x = {1,2,3};
		int [] y = {7,3};
		
		System.out.println(commonEnd(x,y));

	}
	
	public static String commonEnd(int [] arr1, int [] arr2) {

		if(!(arr1.length>1)) {
			return "Array 1 is not valid";
		}
		
		if(!(arr2.length>1)) {
			return "Array 2 is not valid";
		}
		
			if (arr1[0] == arr2[0] || arr1 [arr1.length-1] == arr2[arr2.length-1]) {
					return "true";
					
				}else {
						return "false";
						
						}
		
	}
	
	

}
