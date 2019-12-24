package day35_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {


		Employee p1 = new Employee ();
		Employee p2 = new Employee ("Mark Jones", 39119);
		Employee p3 = new Employee ("Tedd Britt.", 81774, "Sales", "Sales Person");
		
		System.out.println(p1.getName() +" | " + p1.getIdNumber()+" | "+p1.getDepartment() +" | "+p1.getPosition());
		System.out.println(p2.getName() +" | " + p2.getIdNumber()+" | "+p2.getDepartment() +" | "+p2.getPosition());
		System.out.println(p3.toString());
		

	}

}
