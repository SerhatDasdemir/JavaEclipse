package day31_arrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {

		//Languages
		//Print Size arrayList
		//Read couple of elements
		
		ArrayList<String> str = new ArrayList<> ();
		
		str.add("English");
		str.add("German");
		str.add("Turkish");
		str.add("Spansh");
		
		
		System.out.println("Num of Values : "+str.size()); //kelie sayýsýný bluruz.
		
		System.out.println(str.toString()); //Kelimelerin listesini çýkartýrýz.
		
		str.add("Russian");
		System.out.println(str.toString()); //Russian da ekledik.
		
		
		str.remove(0); //0 daki -English-  lisaný çýkarttýk.
		System.out.println(str.toString());
		
		System.out.println("Number of values: " + str.size());
		
		
		
		
		
		
		

	}

}
