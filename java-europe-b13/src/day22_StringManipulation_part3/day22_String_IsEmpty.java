package day22_StringManipulation_part3;

public class day22_String_IsEmpty {

	public static void main(String[] args) {
		
		String userName = "";
		String password = "";
		
		if(userName.isEmpty()) { //Empty : bo�-bo�luk (hi�) anlam�nda. But " space " bo�luk karakter kabul eder.
			System.out.println("Username field can not be empty");
		}else {
			System.out.println("Username is not empty");
		}
		
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can not be empty");
		}else {
			System.out.println("Username or password is not empty");
		}
	}

}
