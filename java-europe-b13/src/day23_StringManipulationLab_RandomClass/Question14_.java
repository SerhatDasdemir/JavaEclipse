package day23_StringManipulationLab_RandomClass;

public class Question14_ {

	public static void main(String[] args) {


		String str = "oddjghjlvyn"; //"ly" --> true. //else --> false.
		
		if (str.length()<2) {
			
			System.out.println(false);
			return;
			
		}		
			
			//if (str.substring(str.length()-2).equals("ly")) 
		
		if (str.contains("ly")){ //listede "ly" varsa true.
				
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
			
	}


