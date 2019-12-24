package day23_StringManipulationLab_RandomClass;

public class Question13_ {

	public static void main(String[] args) {


		String str = "emir"; //"The" --> "TThhii" print  substring(0,1) substring(1,2)   substring(2,3)
		String newstr = "";
		
		for (int i=0;i<str.length();i++) {
			
			newstr = newstr + str.substring(i,i+1).concat(str.substring(i,i+1));
			
		}
		
		System.out.println(newstr);
			
			
	}

}
