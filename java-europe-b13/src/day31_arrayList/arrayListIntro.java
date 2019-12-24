package day31_arrayList;

import java.util.ArrayList;

public class arrayListIntro {

	public static void main(String[] args) {

		//Creating an ArrayList

		ArrayList<String> names = new ArrayList<>();
			System.out.println(names); //[]

		ArrayList<Integer> nums = new ArrayList<>();
			System.out.println(nums);
		
		//Assigning values to ArrayList
			
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer ("100"));
		
		//Reading from arrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		
		System.out.println("names count: " +names.size());
		System.out.println("nums count: "  +nums.size());
		
			System.out.println(names.toString());
			
	}

}
