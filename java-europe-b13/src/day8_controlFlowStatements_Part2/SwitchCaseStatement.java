package day8_controlFlowStatements_Part2;

public class SwitchCaseStatement {

	public static void main(String[] args) {
	
		String weather="gvhjblýjn"; //switch (".....") ne yazarsan (sunny - hot - snow .. gibi) o ifadenin altýndaki kodu okuyor.
		
		switch(weather) {
		
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break; // break aralara koymazsan break görene kadar aþaðýya doðru tüm kodlarý okur.
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
		default: //hatalý yani olmayan bir ifade girilirse default altýndaki kodu uygular. 
			//Default da case ile ayný iþleve sahiptir yani araya yazýlabilir. ama ayný þekilde break ile kapatmak gerekir.
			//yoksa aþaðýya doðru break görene kadar tüm kodlarý uygular.default koymazsan hata vermez ama boþ sayfa çýkar.
		System.out.println("Code Java in any other weather");
		
		
		
		
		
		}

	}

}
