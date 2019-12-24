package day43_polymorphism;

public class TestShape {

	public static void main(String[] args) {


		Shape shape1 = new Shape(); //we colled parrent class
		shape1.draw();
		
		Shape shape2 = new Circle(); //we called child class
		shape2.draw();
		
		Shape shape3 = new Triangle(); //we called child class
		shape3.draw();
		
		
	}

}
