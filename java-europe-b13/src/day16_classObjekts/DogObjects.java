package day16_classObjekts;

public class DogObjects {

	public static void main(String[] args) { //bu defa s�n�f a�arken 	"main method" i�aretledik. 
											//�imdi Dog class ile �al��aca��z
		Dog dog1 = new Dog();				//Dog.java s�n�f�na atad�k.
		
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
		
		//System.out.println(dog2.age); //-->Dog.java s�n�f�nda atama yap�lmad�ysa "0" g�r�r.
	}

}
