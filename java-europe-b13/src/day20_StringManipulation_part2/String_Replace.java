package day20_StringManipulation_part2;

public class String_Replace {

	public static void main(String[] args) {

		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpace= sentence.replace(" ", ""); //metinde de�i�mesini istedi�in karakteri yeni karakter ile de�i�tirir.
		
		System.out.println(withNoSpace);
		
		//replace, with !!!
		
		String comma = sentence.replace("," , "!!!");
		
		System.out.println(comma);
		
		String mixed = "&&�#$�#$�$6�";
		
		mixed = mixed.replace("&&�#", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("$", "0");		
		System.out.println(mixed);

		
		String result = "About 8.930.000.000 result (0,68 second)" ;
		
		result = result.replace("About " , "").replace("result (0,68 second)", ""); 
		
		// farkl� ifadeleri araya . koyarak tek sat�rda yazabilirisin.
	
		
		
		System.out.println(result);
	}

}
