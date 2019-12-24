package day40_methodHiding_composition;

public class TestPC {

	public static void main(String[] args) {

		
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		Monitor theMonitor = new Monitor("27inc", "Acer", 27, new Resolution(2540, 1440));
		Motherboard theMotherboard = new Motherboard("bj-200", "Asus", 4, 6, "v2.44");
		
		//asus to sony:
		//theMotherboard.model="Sony"; //private oldugu icin degistirilemez...error! (private String model;)
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
		thePC.getMonitor().drawPixel(1500, 1200, "red");;//
		
		//call loadProgram method.
		
		thePC.getMotherboard().loadProgram("Wind 10...");
		
		//call pressPowerButton:
		
		thePC.getTheCase().pressPowerButton();
	}

}
