package day34_Constructors_PassingObjectToMethod;

public class AppleTest {

	public static void main(String[] args) {

		Apple a1 = new Apple ();
		
		System.out.println(a1.color);

		
		changeApple(a1);
		
		System.out.println(a1.color);
	}

	public static void changeApple(Apple b1) { //Apple sınıfını referans yaptık (Apple b1 = new Apple ();). "b1" atadık.
	
	b1.color = "orange";
	
	
	
	
	
}
}
