package day23_StringManipulationLab_RandomClass;

import java.util.Random;


public class RandonNumbers {

	public static void main(String[] args) {

		Random rn = new Random (); //rastgele girilen türde sayý üretmek.


		System.out.println(rn.nextInt());
		
		System.out.println(rn.nextDouble());
		
		System.out.println(rn.nextFloat());
		
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(10)+5); //5-14arasýnda üretir.
		System.out.println(rn.nextInt(50)); //0-49 arasýnda üretir.
		System.out.println(rn.nextInt(150)-50);// -50 --- +99 arasýnda üretir.
	}

}
