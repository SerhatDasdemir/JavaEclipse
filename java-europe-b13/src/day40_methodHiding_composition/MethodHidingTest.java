package day40_methodHiding_composition;

public class MethodHidingTest {

	public static void main(String[] args) {
		
		Panda.eat();
	
	}

}

class Bear{
	public static void eat() {
		System.out.println("Bear is eating");	
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");	
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");	
	}
}

class Panda extends Bear {
	
	public static void eat() { //yukarida da static -- hiding -- calisiyor.
		System.out.println("Panda is eating");	
	}
	
	/*public  void sneeze() { //yukarida static olduğu için burada errror
		System.out.println("PAnda ");
		
	}*/
	@Override
	public void hibernate() { //yukarida da void oldugu icin --hiddiing - calisiyor
		
		System.out.println("Panda is hibernating");
		
	}
	
}






