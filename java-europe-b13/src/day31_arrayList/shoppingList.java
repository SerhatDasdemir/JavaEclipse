package day31_arrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {


		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trach bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
	//print numbers of item
		int count = shoppingList.size();
		System.out.println(shoppingList.size());
		
	//print all items in single Line
		System.out.println(shoppingList.toString());
		
	//print first and last item
		System.out.println(shoppingList.get(0) + " | "+ shoppingList.get(count-1));
		
	//remove paper tower and shovel
		
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
	//print each item
		for(String item : shoppingList) {
			System.out.println(item);
		}
		
	//remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());




		
		
	}

}
