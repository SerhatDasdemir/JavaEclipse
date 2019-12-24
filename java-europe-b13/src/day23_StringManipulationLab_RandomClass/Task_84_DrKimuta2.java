package day23_StringManipulationLab_RandomClass;

import java.util.Random;

public class Task_84_DrKimuta2 {

	public static void main(String[] args) {

		Random rn = new Random ();
		
		 for(int i=0; i<10; i++) {
	            
	            boolean flag=rn.nextBoolean();
	            
	            if(flag==true) {	                
	                System.out.println( "Heads");
	            }else {
	                System.out.println("Tails");
	            }
	}

}}
