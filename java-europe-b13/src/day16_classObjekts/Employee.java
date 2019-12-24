package day16_classObjekts;

public class Employee {

	String name ="Serhat";
	String jobTitle ="Av.";
	double salary = 1.2;
	
	
	public void work() {
		System.out.println(name  + " is working hard...");
	}
	
	public void attendMeeting() {
		System.out.println(name + " is attending a meeting...");
	}
	
	public void introduce() {
		System.out.println("Name:" + name + "Job title:" + jobTitle + "Salary:" + salary);
	}


}
