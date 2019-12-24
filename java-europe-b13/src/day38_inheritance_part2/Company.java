package day38_inheritance_part2;

public class Company {

	public static void main(String[] args) {

		Employee mpl = new Employee ();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contractor ct = new Contractor();
		
		
		mpl.calculatePay(45, 15);
		ft.calculatePay(40, 40);
		ct.calculatePay(40, 40);
		
	}

}
