package day5_unary_assignment_relational_Operators;

public class task21_ {

	public static void main(String[] args) {
		int x = 4;
		int y = x * 4 - x++;
		
		//x in memory: 4
		//y          : 4 * 4 - 4 - x++
		
		System.out.println(y);

	}

}
