package day40_methodHiding_composition;

public class TestBedroom {

	public static void main(String[] args) {
		
		Lamp theLamp = new Lamp("Lamp", false, 565, true);
		Bed theBed = new Bed("Modern", 12, 50, 32, 312);
		Ceiling theCeiling= new Ceiling(230, 5312);
		Wall thewall1=new Wall("East");
		Wall thewall2=new Wall("West");
		Wall thewall3=new Wall("North");
		Wall thewall4=new Wall("South");
		
		
		Bedroom theBedroom = new Bedroom("Serhat", theLamp, theBed, theCeiling, thewall1,thewall2,thewall3,thewall4);
		
		theBedroom.makeBed();
		theBedroom.getTheBed().make();
		theBedroom.getTheLamp().turnOn();

	}

}
