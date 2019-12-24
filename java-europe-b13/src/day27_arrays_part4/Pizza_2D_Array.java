package day27_arrays_part4;

import java.util.Arrays;

public class Pizza_2D_Array {

	public static void main(String[] args) {

		//Pizza �e�itleri: 
		
String[][] pizzas = {
				
						{"pinneapple","pepperoni"},
						{"anchovies","mushroom","olives"},
						{"4 cheese"},
						{"chicken","tomatoes","onioons"},
						{"green peppers","zuccini","brocoli","spinach","shrimp"}
				
					};

	//pizzas [0] [0] i�eri�ini yazd�rmak i�in

	System.out.println(Arrays.toString(pizzas[0])); 
	
	System.out.println("-----------------------------");
		
	System.out.println("####FOR EACH LOOP##");	
	
	//t�m pizza �e�itlerini yazd�rmak i�in
	
	for (String [] pizza : pizzas) {
		
	System.out.print(pizza.length + "-");
	System.out.println(Arrays.toString(pizza));
	
}
	
	System.out.println("####FOR ITERATOR LOOP##");	
	
	//t�m pizza �e�itlerini yazd�rmak i�in
	
	for (int i =0; i<pizzas.length;i++) { 
		
		System.out.print(pizzas[i].length);
		System.out.println(Arrays.toString(pizzas[i]));
	}
	System.out.println("----------------------------");
	
	//3 numaral� pizzay� yazd�rmak i�in.
	
	for (String value : pizzas [3]) { 
	System.out.print((value) + "  ");}
	
	System.out.println("\n----------------------------------------");
	
	int [][] students = {   {4,5,6},  //her row array int [] dir. 2D array i�in : int [][]
							{12,5,7},  
							{23,56,12,55,33}	   
						};
	
	for (int [] group : students) {
		for (int studentID : group) {
			System.out.print(studentID + " ");
		}
	}
	
	}

}
