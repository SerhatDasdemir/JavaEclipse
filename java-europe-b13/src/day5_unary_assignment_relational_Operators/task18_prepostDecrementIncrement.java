package day5_unary_assignment_relational_Operators;

public class task18_prepostDecrementIncrement {

	public static void main(String[] args) {


		int x= 2;
		//x++;
		int y= x++; // y=x=2 (++ aktif de�il burada. Ama araya biryere x++; yazsayd�k x'i 1 artt�rm�� olacakt�k)
				
		System.out.println(x); // bu kod yukar�daki x++ y� g�rd��� i�in x+1 = 3 yap�yor.
		System.out.println(y); //burada ++ aktif olmad���ndan y=x=2 yap�yor. 
								//Ama ++x olarak g�rseydi ++ aktif olacak, y i�in 1+x =3 olacakt�.
		
		int z= ++x; //burada ++ aktif g�rd��� i�in x'i (yukar�da 3 olmu�tu) +1 artt�rd�. 3+1=4 oldu.
					//ama burada da x++ olsayd� ++ lar pasif olacak x'i artt�rmadan son halini yani x=3 kabul edecekti.
		System.out.println(z);
		
		int u=2;
		//a++; yapmad���m i�in a+1=3 yapm�y�r. 
		System.out.println(u++); //Yani ++ lar arkada oldu�u i�in kod i�in + lar pasif durumda ve g�rm�yor.
		
		int b=2;
		System.out.println(--b); //-- �nde oldu�u i�in kod b den �nce eksileri g�r�yor ve eksiltme i�lemini yap�yor.
		
		x=8;
		y= x--; ////-- lar arkada oldu�u i�in y i�in - lar pasif durumda ve g�rm�yor.
		System.out.println(y); 
		System.out.println(x); //bu kod yukar�daki x-- y� g�rd��� i�in x-1 = 7 yap�yor.
		
		
		
		
	}

}
