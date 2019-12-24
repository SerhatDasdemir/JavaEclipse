package day40_methodHiding_composition;

public class Bedroom {
	
	private String name;
	
	private Lamp theLamp;
	private Bed theBed;
	private Ceiling theCeiling;
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	
	
	
	public String getName() {
		return name;
	}
	public Lamp getTheLamp() {
		return theLamp;
	}
	public Bed getTheBed() {
		return theBed;
	}
	public Ceiling getTheCeiling() {
		return theCeiling;
	}
	public Wall getWall1() {
		return wall1;
	}
	public Wall getWall2() {
		return wall2;
	}
	public Wall getWall3() {
		return wall3;
	}
	public Wall getWall4() {
		return wall4;
	}
	public Bedroom(String name, Lamp theLamp, Bed theBed, Ceiling theCeiling, Wall wall1, Wall wall2, Wall wall3, Wall wall4) {
		
		this.name = name;
		this.theLamp = theLamp;
		this.theBed = theBed;
		this.theCeiling = theCeiling;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
	}
	public void makeBed() {
		
		System.out.println("Bedroom make Bed");
		
	}
	
	
	

}

	
