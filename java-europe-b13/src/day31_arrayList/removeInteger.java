package day31_arrayList;

import java.util.ArrayList;

public class removeInteger {

	public static void main(String[] args) {


		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(4);
		nums.add(1);
		nums.add(14);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());
		
		nums.remove(5); // 5. sırada -100- listeden çıkarık
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(10);
		Integer n2 = Integer.valueOf(10); // litede n1 == 10 i atadık.
		nums.remove(n1);   // rakam olarak litede n1 == 10 i çıkarttık.
		System.out.println(nums.toString());
		
		
	}

}
