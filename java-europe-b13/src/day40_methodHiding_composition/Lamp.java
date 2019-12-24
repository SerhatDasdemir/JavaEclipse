package day40_methodHiding_composition;

public class Lamp {
	
	private String styl;
	private boolean  battery;
	private int  globalRating;


	public void turnOn() {
		
		System.out.println("The lamp turning On");
		
	}
	
	
	public String getStyl() {
		return styl;
	}
	public boolean getBattery() {
		return battery;
	}
	public int  getGlobalRating() {
		return globalRating;
	}
	
	public Lamp(String styl, boolean battery, int globalRating, boolean turnOn) {
	
		this.styl = styl;
		this.battery = battery;
		this.globalRating = globalRating;
	
	}

}
