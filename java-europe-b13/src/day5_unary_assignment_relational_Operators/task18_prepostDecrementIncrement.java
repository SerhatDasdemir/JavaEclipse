package day5_unary_assignment_relational_Operators;

public class task18_prepostDecrementIncrement {

	public static void main(String[] args) {


		int x= 2;
		//x++;
		int y= x++; // y=x=2 (++ aktif deðil burada. Ama araya biryere x++; yazsaydýk x'i 1 arttýrmýþ olacaktýk)
				
		System.out.println(x); // bu kod yukarýdaki x++ yý gördüðü için x+1 = 3 yapýyor.
		System.out.println(y); //burada ++ aktif olmadýðýndan y=x=2 yapýyor. 
								//Ama ++x olarak görseydi ++ aktif olacak, y için 1+x =3 olacaktý.
		
		int z= ++x; //burada ++ aktif gördüðü için x'i (yukarýda 3 olmuþtu) +1 arttýrdý. 3+1=4 oldu.
					//ama burada da x++ olsaydý ++ lar pasif olacak x'i arttýrmadan son halini yani x=3 kabul edecekti.
		System.out.println(z);
		
		int u=2;
		//a++; yapmadýðým için a+1=3 yapmýyýr. 
		System.out.println(u++); //Yani ++ lar arkada olduðu için kod için + lar pasif durumda ve görmüyor.
		
		int b=2;
		System.out.println(--b); //-- önde olduðu için kod b den önce eksileri görüyor ve eksiltme iþlemini yapýyor.
		
		x=8;
		y= x--; ////-- lar arkada olduðu için y için - lar pasif durumda ve görmüyor.
		System.out.println(y); 
		System.out.println(x); //bu kod yukarýdaki x-- yý gördüðü için x-1 = 7 yapýyor.
		
		
		
		
	}

}
