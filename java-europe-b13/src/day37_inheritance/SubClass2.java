package day37_inheritance;

public class SubClass2 extends SuperClass2 {	//child
	
		public SubClass2() {
			
			super(10);//JVM automatic in parent class (SuperClass2) with argument constructor worked.
			
			System.out.println("This is the subclass2 constructor");
			
		}

}
