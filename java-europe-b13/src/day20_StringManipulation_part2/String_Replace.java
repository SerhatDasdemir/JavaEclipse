package day20_StringManipulation_part2;

public class String_Replace {

	public static void main(String[] args) {

		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpace= sentence.replace(" ", ""); //metinde deðiþmesini istediðin karakteri yeni karakter ile deðiþtirir.
		
		System.out.println(withNoSpace);
		
		//replace, with !!!
		
		String comma = sentence.replace("," , "!!!");
		
		System.out.println(comma);
		
		String mixed = "&&£#$½#$½$6½";
		
		mixed = mixed.replace("&&£#", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("$", "0");		
		System.out.println(mixed);

		
		String result = "About 8.930.000.000 result (0,68 second)" ;
		
		result = result.replace("About " , "").replace("result (0,68 second)", ""); 
		
		// farklý ifadeleri araya . koyarak tek satýrda yazabilirisin.
	
		
		
		System.out.println(result);
	}

}
