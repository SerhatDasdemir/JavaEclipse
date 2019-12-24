package day31_arrayList;

public class Task98_2 {

	public static void main(String[] args) {
		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";		
		
		System.out.println(decodeTheCode(str1));		
		
		String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";		
		System.out.println(decodeTheCode(str2));
		
		}
	
	
	public static int decodeTheCode(String s) {		
		
			String s2="";		
			String end="";		
			
			for (int i=0;i<s.length();i++) {	
				
				if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i)==' ') {								
					
					s2=s2+s.charAt(i);			
					
				}		
				
			}				
			
			System.out.println(s2);	
			
			String[] arr=s2.split(" ");	
			
			for (int i=0;i<arr.length;i++) {			
				
				switch (arr[i].toLowerCase()) {			
				
				case "one": end=end+1; break;			
				case "two": end=end+2; break;			
				case "three": end=end+3; break;			
				case "four": end=end+4; break;			
				case "five": end=end+5; break;			
				case "six": end=end+6; break;			
				case "seven": end=end+7; break;			
				case "eight": end=end+8; break;			
				case "nine": end=end+9; break;			
				case "zero": end=end+0; break;			
				}					
				}
			return Integer.parseInt(end);		
		}}
