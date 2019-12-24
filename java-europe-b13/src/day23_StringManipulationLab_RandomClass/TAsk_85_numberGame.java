package day23_StringManipulationLab_RandomClass;

import java.util.Random;
import java.util.Scanner;

public class TAsk_85_numberGame {

	public static void main(String[] args) {

		Random rn = new Random();
		Scanner sc = new Scanner (System.in);
		
		
		int computers;
        int users;
        int computerPoints =0;
        int userPoints=0;
        
        for(int i = 0 ; i < 10 ; i++) {
        	computers = rn.nextInt(6)+1;
        	users =rn.nextInt(6)+1;
        	
        	if (computers>users) {
        		computerPoints++;
        		
        	}else if (users>computers) {
        		userPoints++;
        	}
        	
        	
        }
       
		
		System.out.println("Computer :" +computerPoints);
		System.out.println("User :"+userPoints);
		
		if(computerPoints>userPoints) {
			System.out.println("Computer wins");
		}else if(userPoints>computerPoints) {
			System.out.println("User wins");
		}else {
			System.out.println("There is no winner");
		}
	}

}
