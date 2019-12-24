package day25_arrays_part2;

public class ForEachLoop {

	public static void main(String[] args) {


		String [] products = {"Timberland", "Shirt", "Watch", "Bag","Shoes"};
		double [] prices = {120.0,12.99,300,25,67.89};
 
		for (int i=0;i<products.length;i++) { //normalde "array" liste yazd�rma usul�m�z. A�a��dakiler k�sa yol.
			System.out.println(products[i]);
		}
		System.out.println("===================");
		
		for (String prod : products) {//prod de�i�keni olarak for d�ng�s�nde "products" atad�k. "products" listesini yazd�rd�k.
			System.out.println(prod);
		}
		System.out.println("===================");
		
		for (double pr : prices) { //pr de�i�keni olarak for d�ng�s�nde "prices" atad�k. "prices" listesini yazd�rd�k.
			System.out.println(pr);
		}
		
		System.out.println("----------------------");
		
		//print products in reverse order 
		
		for(int i=products.length-1;i>=0;i--) { //listeyi tersten yazd�ral�m.
			System.out.println(products[i]);
		}
		
		
		
	}

}
