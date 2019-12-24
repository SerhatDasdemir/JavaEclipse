package day20_StringManipulation_part2;

import java.util.Scanner;


public class Task82_UserName_Password {
/*• Login Functionality Logic
• UserName,Password
• --- > Program will ask to enter username and password
• --- > If both username and password are blank
• "UserName and Password Fields cannot be empty"
• --- > If userName is blank and password is not blank
• "UserName cannot be empty"
• --- > If userName is not blank and password is blank
• "Password cannot be empty"
• --- > If the username or password is not valid
• "UserName or password is not valid. Please verify"
• --- > If the username and password are both valid
• "User Logged in successfully"*/
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		String name="Mike";
		String pass="Mike1234";
		
		System.out.print("Enter your Username : ");
		String userName = sc.nextLine();
		System.out.print("Enter your Password : ");
		String password = sc.nextLine();
		
		if (userName.equals("") && password.equals("") ) {
			System.out.println("UserName and Password Fields cannot be empty");
			
		} else if (userName.equals("") && !password.equals("")){
			System.out.println("UserName cannot be empty");
			
		}else if (userName.equals(name) && password.equals("")){
			System.out.println( "Password cannot be empty");


		} else if (!userName.equals(name) || !password.equals(pass) ){
			System.out.println( "UserName or password is not valid. Please verify");
		
		}else if (userName.equals(name) && password.equals(pass) ){
			System.out.println( "User Logged in successfully");

		}
		
	}}
