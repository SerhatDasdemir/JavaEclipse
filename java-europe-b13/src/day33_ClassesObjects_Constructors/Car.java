package day33_ClassesObjects_Constructors;

public class Car {
	
	String model;
	String make;
	String color;
	int year;
	double mile;
	
	/*public Car (String m, String ma, int yr, double ml, String cl) {
		model = m;
		make = ma;
		year = yr;
		mile = ml;
		color = cl;
		*/
		
		public Car (String model, String make, int year, double mile, String color) {
			
			this.model = model;
			this.make = make;
			this.year = year;
			this.mile = mile;
			this.color = color;
			
			System.out.println("1: " + model +" "+ make);
		
	}
		public void car() {
			System.out.println("2: " + model + " "+ make);
			
		}

}
