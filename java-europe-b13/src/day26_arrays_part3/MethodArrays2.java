package day26_arrays_part3;

import java.util.*;

public class MethodArrays2 {

	public static void main(String[] args) {

		String [] cars = new String [4];
 
		
		System.out.println(findCar (4,"Honda"));
		

	}
	public static String [] createArray(int arraySize) {
		
		Scanner sc = new Scanner (System.in);
		
		String [] carArray = new String [arraySize];
		
		for (int i=0; i<carArray.length;i++) {
			System.out.println("Eneter your car #" + (i+1));
			carArray[i] = sc.next();
		
	}
	
		return carArray;
		
	}

	public static boolean  findCar(int value, String toFindCar) {
		
		for (String car : createArray(value)) 		{
			
			if (car.equalsIgnoreCase(toFindCar)) 	{
				
				return true;
			}
			}
		
		return false;

	}
	
}
