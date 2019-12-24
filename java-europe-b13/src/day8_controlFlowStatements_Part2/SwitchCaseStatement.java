package day8_controlFlowStatements_Part2;

public class SwitchCaseStatement {

	public static void main(String[] args) {
	
		String weather="gvhjbl�jn"; //switch (".....") ne yazarsan (sunny - hot - snow .. gibi) o ifadenin alt�ndaki kodu okuyor.
		
		switch(weather) {
		
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break; // break aralara koymazsan break g�rene kadar a�a��ya do�ru t�m kodlar� okur.
		case "hot":
			System.out.println("Go to swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
			break;
		default: //hatal� yani olmayan bir ifade girilirse default alt�ndaki kodu uygular. 
			//Default da case ile ayn� i�leve sahiptir yani araya yaz�labilir. ama ayn� �ekilde break ile kapatmak gerekir.
			//yoksa a�a��ya do�ru break g�rene kadar t�m kodlar� uygular.default koymazsan hata vermez ama bo� sayfa ��kar.
		System.out.println("Code Java in any other weather");
		
		
		
		
		
		}

	}

}
