package day35_encapsulation;
/*Pocket 0 is green.
For pockets 1 through 10, the odd-numbered pockets are red and the even-numbered pockets are black.
For pockets 11 through 18, the odd-numbered pockets are black and the even-numbered pockets are red.
For pockets 19 through 28, the odd-numbered pockets are red and the even-numbered pockets are black.
For pockets 29 through 36, the odd-numbered pockets are black and the even-numbered pockets are red.
*/
public class RoulettePocket {
	
	int pockets;
	String color;
	public int getPockets() {
		return pockets;
	}
	public void setPockets(int pockets) {
		this.pockets = pockets;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public RoulettePocket(int pockets, String color) {
		super();
		this.pockets = pockets;
		this.color = color;
		
		if (pockets == 0) {
			color = "Green";
		}else if (pockets>0 && pockets <=10 ) {
			if(pockets%2==0) {
				color = "Black";
				
			}else {
			color= "Red";
			}
		}else if (pockets>10 && pockets <=18) {
			if(pockets%2==0) {
				color = "Red";
				
			}else {
			color= "Black";
			}
		}else if (pockets>18 && pockets <=28) {
		if(pockets%2==0) {
			color = "Black";
			
		}else {
		color= "Red";
		}
		
		}else if (pockets>28 && pockets <=36 ) {
			if(pockets%2==0) {
				color = "Red";
				
			}else {
			color= "Black";
			}
			}else {
				System.out.println("Error!");
			
			}
		
		System.out.println("The Pocket color is : "+ color);
	}
	

			
	}
	
	


