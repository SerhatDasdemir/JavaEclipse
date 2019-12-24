package day15_methods_Part3;

public class task_67_LastDigit {

	//Write a method that accepts 2 numbers and return if they have the same last digit.
	
	public static void main(String[] args) {
		int x=155;
		int y=115;
		
		if(lastDigit(x,y)) {
			System.out.println("They have the same last digit");
		}else {
			System.out.println("They do not have the same last digit");
		}
		
	}

	public static boolean lastDigit(int num1, int num2) {
		
			if((num1%10)==(num2%10)) {
				return true;
			}else {
				return false;
			}

	}
	}
	

