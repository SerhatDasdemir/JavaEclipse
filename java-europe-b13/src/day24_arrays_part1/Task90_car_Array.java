package day24_arrays_part1;

public class Task90_car_Array {

	public static void main(String[] args) {

		/// Listede "HONDA" var mý? /////
		
		String [] car = {"Toyota", "BMW","Honda","Porche","Mercedes", "Mazda"};
		
		boolean flag = false;
		
		for (int i=0; i<car.length;i++) {
			
			if (car[i].equals("Honda")) {
				
				flag=true;
				break;
			}
			}
		
		if (flag) {
			System.out.println("I found it");
			
				}else {
				System.out.println("not find it");
			
		}
				
		

	}}


