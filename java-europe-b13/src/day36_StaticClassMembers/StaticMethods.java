package day36_StaticClassMembers;

public class StaticMethods {
	
	String name = "Apple";
	static String name2 = "Banana";
	
	public static void show1() {
		System.out.println("Hi");
		//show2(); //Error --> you can not call instance method from static method
		show4();//you can call static method from static method
		
		//System.out.println(name);//errror
		System.out.println(name2);//you can call static method from static method

	}
	
	public void show2() {
		System.out.println("Hi");
		
	}
	public  void show3() {
		System.out.println("Hi");
		show2(); //you can call instance method from instance method
		show1 (); // you can call static from instance
		
	}
	public static void show4() {
		System.out.println("Hi");
	}
}
