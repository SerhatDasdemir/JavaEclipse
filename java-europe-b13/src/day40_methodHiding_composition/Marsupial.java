package day40_methodHiding_composition;

public class Marsupial {
	
	public boolean isBiped() {
		return false;
		
	}
	
	/*public static boolean isBiped() {
		return false;
		
	}*/

	public void getMarsupialDescription() {
		System.out.println("Get Marsupial Description "+ isBiped());
		
	}
}
