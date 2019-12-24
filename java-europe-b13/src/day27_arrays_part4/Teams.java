package day27_arrays_part4;

public class Teams {

	public static void main(String[] args) {

		/*int [] [] numbers = { {1,2,3} , {3,5,6}, {7,8,9} };
		 * 						 Row 0		Row 1	 Row 2
		 * 
		 *  Bu kodun açýklamasý:
		 *  
		 * 			column 0		column 1 	column 2
		 * row 0->		1				2			3
		 * row 1->		4				5			6
		 * row 2->		7				8			9
		 * 
		 * */
		
		String [][] teams = new String [2][4];
		
		//TEAM 0 //  String [][] teams = { {"Mike","Tonny", "Smith", "Evan"}, {"David","Emmy", "John", "Ryan"} };
				//										Team 0							Team 1
		
		teams [0][0] = "Mike";
		teams [0][1] = "Tonny";
		teams [0][2] = "Smith";
		teams [0][3] = "Evan";
		
		//TEAM 1 //
		teams [1][0] = "David";
		teams [1][1] = "Emmy";
		teams [1][2] = "John";
		teams [1][3] = "Ryan";
		
		System.out.println("First player of first team");
		System.out.println(teams [0][0]);
		
		System.out.println("number of rows: " + teams.length);
		System.out.println("#People in first team : " + teams [0].length);
		System.out.println("#People in second team : " + teams [1].length);
		
		
		
	}

}
