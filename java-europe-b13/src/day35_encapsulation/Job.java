package day35_encapsulation;

public class Job {
	
	private String title;
	private String company;
	private double annualSalary;
	
	public Job () {
		
		System.out.println("No-args constructor");
		this.title = "undefined";
		this.company = "undefined";
				
	}
	
	public Job (String title) {
		System.out.println("one-arg constructor");
		this.title=title;
		this.company="undefined";
				
	}

	public Job(String title, String company, double annualSalary) {
		System.out.println("Three-args  constructor");
		this.title = title;
		this.company = company;
		this.annualSalary = annualSalary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		//condition
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		//condition
		this.company = company;
	}
	
	public String toString() {
		return "Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
		
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}


}
