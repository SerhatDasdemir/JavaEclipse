package day16_classObjekts;

public class DogObjects {

	public static void main(String[] args) { //bu defa sýnýf açarken 	"main method" iþaretledik. 
											//þimdi Dog class ile çalýþacaðýz
		Dog dog1 = new Dog();				//Dog.java sýnýfýna atadýk.
		
		Dog dog2 = new Dog();
		
		Dog dog3 = new Dog();

		dog1.age =10;
		dog1.color= "red";
		dog1.breed ="Maltese";
		dog1.name = "Rover";
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		
		dog1.hungry();
		dog1.sleeping();
		dog1.barking();
		
		//System.out.println(dog2.age); //-->Dog.java sýnýfýnda atama yapýlmadýysa "0" görür.
	}

}
