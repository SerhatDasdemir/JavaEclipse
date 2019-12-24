package day36_StaticClassMembers;

import static java.lang.Math.*;

public class StaticImport {
	
	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16));	//be for import -->
		
		System.out.println(sqrt(16)); //after then import --> 
		
		method();
		main1(args);
	}

	public static void method() {
		System.out.println("Test");
	}
	
	public static void main1(String[] args) {
		
		System.out.println("1232");
	}
	
}
