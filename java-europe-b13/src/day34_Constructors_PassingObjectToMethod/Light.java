package day34_Constructors_PassingObjectToMethod;

public class Light {
	
	int noOfWatts;
	boolean indication;
	String location;
	
	public Light () {
	this(0,false);
	System.out.println("Returning from no-argument constructor no.1");
		
	}
	
	public Light (int watt, boolean ind) {
		this (0,false,"X");
		System.out.println("Returning from constructor no.2");
		
	}
	
	public Light(int noOfWatts, boolean indication, String location) {
		
		this.noOfWatts = noOfWatts;
		this.indication = indication;
		this.location = location;
	System.out.println("Returning fromconstructor no.3");	
		
	}
	
	
	

}
