package day35_encapsulation;

public class PersonTest {

	public static void main(String[] args) {


		Person p1 = new Person ("Serhat", 30, 'A');
		
		p1.setAge(40);
		
		System.out.println(p1.getAge());
		
		
//		p1.name = "Serhat";
//		p1.age = 33;
//		
//		p1.print();
//		p1.year();
//		
//	System.out.println("------------------------");			
//		
//		Person p2 = new Person ();		
//
//		p2.name = "Smith";
//		p2.age = -25;
//		
//		p2.print();
//		p2.year();
//		

	}

}
