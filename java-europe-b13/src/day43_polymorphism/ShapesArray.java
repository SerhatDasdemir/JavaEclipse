package day43_polymorphism;

import java.util.ArrayList;

public class ShapesArray {

	public static void main(String[] args) {

		//int [] number = new int[3]; //number hold 3 integer 1 2 3
		
		Shape [] shapes = new Shape[3]; //shapes holding 3 object
		shapes[0] = new Triangle();
		shapes[1] = new Square();
		shapes[2] = new Circle();
		
		for(Shape sh: shapes) {	
			
			System.out.println(sh.getClass().getName());
			
			sh.draw();
		}
		
		ArrayList<Shape> shapeList = new ArrayList<>();
		shapeList.add(new Triangle());
		shapeList.add(new Square());
		
	} 

}
