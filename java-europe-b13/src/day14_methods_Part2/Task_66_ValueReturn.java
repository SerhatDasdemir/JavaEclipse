package day14_methods_Part2;

public class Task_66_ValueReturn {

	public static void main(String[] args) {


		int Travel = distance (50,3);
		
		System.out.println("Distance = " + Travel);
		
		if(Travel>500) {
			System.out.println("you spent too much gas");
		}else {
			System.out.println("you spent ok gas");
		}

	}

	public static int distance (int speed, int time) {
		
		int Distance = speed*time;
		
		return Distance; //buradaki hesaplamayý - kodu - sonucu yukarýda veri olarak kullanmamýzý saðlar.
		
	}
}

