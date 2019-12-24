package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList (numsList);
		
	System.out.println("\n--------------------------------------");
		
		ArrayList<Double> doubleList = new ArrayList <>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double sum = sumList(doubleList);
		System.out.println(Math.round(sum));
		
	System.out.println("-------------------------------------------");
		
		ArrayList<Integer> list = getList(15); //1,2,3....15
		System.out.println(list.toString());
		
	System.out.println("------------------------------------------");
	
		
		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());
		
	System.out.println("------------------------------------------");

		ArrayList<String> strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
	
		ArrayList<Integer> converted = convertToIntList(strnums);
		System.out.println(converted);
	
	
	}
	
	public static void printList(ArrayList <Integer> nums) {
		
		for (int n :nums) {
			
			System.out.print(n +" ");
		}
		
			
	}
	
	public static double sumList(ArrayList <Double> num) {
		
		double sum = 0;
		
		for(Double x :num) {
			
			sum = sum + x;
		}
		return sum;
		
	}
	
	public static ArrayList<Integer> getList(int i) {
		
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int j=0;j<=15;j++) {
			list.add(j);
		}
		
		
		
		return list;	
		
	}
	
	
	public static ArrayList<Integer> getRandomList(int x) {
		
		Random r = new Random ();
		
		ArrayList <Integer> randomNums = new ArrayList<>();
		
		for(int i = 1; i<=x;i++) {

			randomNums.add(r.nextInt(101));

			
		}
		
		
		
		return randomNums;	
		
	
	}

	public static ArrayList<Integer> convertToIntList(ArrayList<String>strList) {
		
		ArrayList <Integer> newList = new ArrayList<>();
		
		for(String str : strList) {

			newList.add(Integer.parseInt(str));

			
		}
		
		
		
		return newList;	
		
	
	
	
}}
