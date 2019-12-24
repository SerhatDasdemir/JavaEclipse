package day33_ClassesObjects_Constructors;

public class Task_Student {
			
		String name;
		int age;
		char gender;
		int year;
		boolean course;
		String uni;
	
	public Task_Student (String name, int age, char gender, int year, String cours, String uni, boolean course) {
		

		
			this.name=name;
			this.course =course;
			this.gender=gender;
			this.year = year;
			this.age = age;
			this.uni= uni;
			
			
		
		
	}

	public void attendLecture() {
		System.out.println(name + " is attending lecture.");
	}
	
	public void submitAssignment() {
		System.out.println(name +  " is making the assignment");
	}
	
	public void attendLab() {
		System.out.println(name +  " is attending Lab");
		
		
	}
}


