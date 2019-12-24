package day16_classObjekts;

public class CellphoneObjekt {

	public static void main(String[] args) {
		
		Cellphone cell1 = new Cellphone();
		
		System.out.println(cell1.brand); //daha "brand" için atama yapmadýk --> Null
		
			System.out.println("*****************");
		
		
		cell1.brand = "Iphone 10X";
		cell1.color = "Silver";
		cell1.price = 76.16;
		cell1.screenSize = 1.7;
		
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		System.out.println(cell1.color);
		System.out.println(cell1.price);
		
			System.out.println("****************************");
		
		
		Cellphone cell2 = new Cellphone();
		
		cell1.brand = "Siemens";
		cell1.color = "Red";
		cell1.price = 39.22;
		cell1.screenSize = 1.5;
		
			System.out.println("###CELL 2 VALUES###");
		
		System.out.println("Brand: " + cell2.brand);
		System.out.println("Color : " + cell2.color);
		System.out.println("price : " + cell2.price);
		
			System.out.println("----------------------------");
		
			System.out.println("###Calling Methods###");
		
		cell1.cell();
		cell1.message();
		
		
		cell2.cell();
		cell2.message();
		

	}

}
