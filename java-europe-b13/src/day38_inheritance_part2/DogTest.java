package day38_inheritance_part2;

public class DogTest {

	public static void main(String[] args) {


		Dog dog = new Dog ("Yorki", 1, 2, 4, 1, 3, 2, 1, 2, "Long Sly");
		dog.eat();
			System.out.println("--------------------");
		dog.chew();
			System.out.println("----------------------");
		dog.run();
		System.out.println("----------------------");
		dog.walk();
		System.out.println("----------------------");
		dog.move(10);
		
		
	}

}
