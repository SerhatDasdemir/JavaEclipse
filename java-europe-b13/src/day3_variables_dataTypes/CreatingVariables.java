package day3_variables_dataTypes;

public class CreatingVariables {

	public static void main(String[] args) {
		
		int price = 5;
		int quantity = 14;
		System.out.println("Serhat is " + (price+quantity) + " years old");
		
		int price2,quantity2;
		String name,address,country,lastname;
		
		name= "Serhat ";
		address= "Köln";
		country="\\Germany ";
		lastname="Dasdemir ";
		
		
		price2=20;
		quantity2=10;
		
		System.out.println(name + lastname + "lived in " + address + country + "for " + (price2/quantity2) + " years");
		
		int price3=06,
		quantity3=46;
		
		String s1,s2;
		s1="Ankara"; s2=" Ýstanbul";
		String s3="yes ",s4="no";
		System.out.println(s1 + " is " + price3 + " = " + s3 + "/"
		+ s2 + " is " + quantity3 + " = " + s4  );
		
		//int num,String value; //Does not compile
		int num;
		String value = " OK";
		num=5;
		
		System.out.println(num + " pencil is" + value);
		
		
		
		
		

	}

}
