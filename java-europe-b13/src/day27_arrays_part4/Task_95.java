package day27_arrays_part4;

public class Task_95 {

	public static void main(String[] args) {
		
		System.out.println("            Math   Chemistry   History    Sport");
		System.out.println("-------------------------------------------------");
		
		int [][] students = {   {68,75,54,80},  //her row array int [] dir. 2D array için : int [][]
								{100,64,20,50},  
								{10,35,40,90}	   
							};
		int i=1;
		for (int [] group : students) {
			
			System.out.print("sutudent -" + i + " ");
			i++;
			
			for (int studentID : group) {
				System.out.print(studentID + "         ");
			}
			System.out.println("");
		}

System.out.println("--------------------------------------------");

		int sum=0;
		
		for(int column=0;column<students[0].length;column++) {
			
			sum = sum + students[0][column];
		
		}
		
		System.out.println("Student 1 avg : "+sum/students[0].length);
		
		int sum2=0;
		for(int row=0;row<students.length;row++) {
			
			sum2 = sum2 + students[row][0];
			
		}
		
		System.out.println("Total Math : " + sum2);


	}

}
