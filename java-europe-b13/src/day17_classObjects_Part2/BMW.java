package day17_classObjects_Part2;

public class BMW {
	
	String make = "BMW";
	String model;
	double price;
	
	public void showPrice() {
		
		switch (model) {
		case "330i":
			price=4020;
			break;
		case "740i":
			price=85000;
			break;
		case "m3":
			price=65000;
			break;
		default:
			System.out.println(model + " is not evailable.");
	
		}
		
		System.out.println("Price : " + price);
		
	}

}
