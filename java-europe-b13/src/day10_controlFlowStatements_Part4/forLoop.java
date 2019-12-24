package day10_controlFlowStatements_Part4;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<=5; i++)  // i -> 5 ten küçük (i>5) kalacak þekilde aþaðýdaki kodu tekrarla.
								// her tekrarda i+1 þeklinde arttýr.
		
		{ System.out.println("Hello " + i);	}
		
		for (int num=20; num>=10; num--) { //num>=10 kalana kadar num dan 1 eksilterek kodu tekrarla.
			System.out.println("num " + num);
		}
		
		for (int x=50; x>=0; x-=10) {System.out.println("x" + x);}
		
		
	}

}
