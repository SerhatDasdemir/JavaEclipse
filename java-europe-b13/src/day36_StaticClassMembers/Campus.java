package day36_StaticClassMembers;

public class Campus {
	
	private String city;
	static String country;
	
	static {
		System.out.println("Static Block");
		country = "USA";
		
	}

	public Campus (String city) {
		
		System.out.println("Constructor");
		this.city= city;
	}
	static {
		System.out.println("Static Block-2");
		country = "UK";
		
	}
	
}
