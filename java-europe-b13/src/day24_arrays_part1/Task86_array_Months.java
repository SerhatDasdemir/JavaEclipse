package day24_arrays_part1;
import java.util.Scanner;

public class Task86_array_Months {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		String [] months = new String [12];
		
		months[0]  = "Jan";
		months[1]  = "Feb";
		months[2]  = "Mar";
		months[3]  = "Apr";
		months[4]  = "May";
		months[5]  = "Jun";
		months[6]  = "Jul";
		months[7]  = "Aug";
		months[8]  = "Sep";
		months[9]  = "Oct";
		months[10]  = "Nov";
		months[11]  = "Dec";
			
		System.out.println("Enter your month index num : ");
		int index = sc.nextInt();
		
		System.out.println("the month is :" + months[index]);
		
		
	}

}
