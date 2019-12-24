package day15_methods_Part3;

public class Task_68_Calculate_AgeNameYear {
	
	/* Write two methods:
1-calculateAge(yearBirth); and returns the age
2-yearsUntilRetirement(name,year); and displays in the console following: “Mike retires
in 36 years”
Example: yearsUntilRetirement(“Mike”,1990);*/

	public static void main(String[] args) {


		yearsUntilRetirement("Mike",1990);
	
	}
			
			
			public static void yearsUntilRetirement(String name,int year) {  //name=MiKE  year=1950
				
				 //retirement age = 65 - age
				
				int retiremenAge = 65 - calculateAge(year);
				
				System.out.println(name  + " retires in " + retiremenAge + " years");
				
				
				
			}
			
			
			public static int calculateAge(int yearBirth) {
				
				return 2019-yearBirth;
				
			}

	}

