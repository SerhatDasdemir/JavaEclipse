package day34_Constructors_PassingObjectToMethod;

public class LightTest {

	public static void main(String[] args) {
		
		System.out.println("Creating Light object no.1\n");
		
		Light l1  = new Light(); // hiç değer atamadık. Light sınıfında değer beklemeyen kod çalıştı. o da kendi içinden diğer methotlara değer atayarak 3 methodu da çalıştırdı.
		
		System.out.println("-----------------------------");
		
		System.out.println("Creating Light object no.2\n");
		
		Light l2 = new Light (250, true);

		System.out.println("-----------------------------");
		
		System.out.println("Creating Light object no.3\n");
		
		Light l3 = new Light (250, true, "attic"); //3 değer atadık Light sınıfında 3 değer bekleyen kod çalıştı
		
		
	}

}
