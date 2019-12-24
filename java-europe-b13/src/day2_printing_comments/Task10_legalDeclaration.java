package day2_printing_comments;

public class Task10_legalDeclaration {

	public static void main(String[] args) {
		
		//boolean b1,b2;
		//String s1= "1", s2;
		//double d1, -double d2; does not compile
		//int i1; int i2;
		//int i3; i4; -does not compile
		
		int i=100;
		i=10;

		System.out.println(i);

		int a,b,c;
		a=10;
		b=20;
		c=a;
		a=b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);



	}

}
