package day2_printing_comments;

public class Task8_Columbus {

	public static void main(String[] args) {
		/* Assign the value "IN 1491 COLUMBUS SAILED THE OCEANBLUE" to an appropriate variable, 
		 * write a program in Java to change the year in the statement above from 1491 to 1492.*/
		
		//String task="IN 1491 COLUMBUS SAILED THE OCEANBLUE";
		
		int year= 1491;
		year+=1;
		
		String task= "\"IN " + year + " COLUMBUS SAILED THE OCEANBLUE\"";
		
		
		System.out.println(task);
	}

}
