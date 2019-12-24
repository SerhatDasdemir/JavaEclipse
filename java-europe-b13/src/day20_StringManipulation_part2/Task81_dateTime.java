package day20_StringManipulation_part2;

public class Task81_dateTime {

	public static void main(String[] args) {

		String time ="10/01/2019 14:59:00";
		System.out.println(time);
		
		System.out.println( timeStamp(time));

	}
	
	public static String timeStamp(String time) {
		
		
		time =time.replace("/", "").replace(":", "").replace(" ", ""); //bu iþaretleri boþluk ile deðiþtirdk.
		
		return time;
	}

}
