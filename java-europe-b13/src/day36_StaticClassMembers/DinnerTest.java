package day36_StaticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {

		Dinner mom = new Dinner ();
		Dinner kid = new Dinner ();
		Dinner dad = new Dinner ();
		
		System.out.println("Total Slices: " + Dinner.pizzaSlice); //8 pizza
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println("Total Slices: " + Dinner.pizzaSlice); //5 pizza

		kid.takeASlice(3);
		dad.takeASlice(2);
		//mom.takeASlice();
		
		System.out.println("Total Slices: " + Dinner.pizzaSlice); //0 pizza

		
	}

}
