package day36_StaticClassMembers;

public class ABCTest {

	public static void main(String[] args) {


		ABC.m1(); //call method thru ONLY static way
		
		ABC o1 = new ABC ();
		o1.m1();
		
		//whenever all of your method in your class are static and you want everyone to call them static way (calassname.methodName(),
		//then you can simple make your constructor private.
		
		
		
		
		
	}
	
	
	public static void print() {
		//static int a = 5; //local variables can not be static
		
		
	}

}
