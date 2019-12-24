package day43_polymorphism;

public class AppleStore {

	public static void main(String[] args) {


		AppleDevice mac = new Mac();
		mac.use();  // Working --> AppleDevice have use() method.
	 // mac.code(); //  Error. Because AppelDevice have not code() method.
		
		Mac myMac = new Mac (); //Mac class have code() and use() method.
		myMac.code();
		myMac.use();

		
		
	}

}
