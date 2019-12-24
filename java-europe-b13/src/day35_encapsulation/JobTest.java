package day35_encapsulation;

import java.util.ArrayList;

public class JobTest {

	public static void main(String[] args) {


		Job job1 = new Job ();
		
		Job job2 = new Job ("Java Developper");
		
		Job job3 = new Job ("SDET", "Amazon", 130000);
		
		
		System.out.println(job1.toString());
		
		System.out.println("----------------------");
		
		System.out.println(job2.toString());
		
		System.out.println("-----------------------");
		
		System.out.println(job3.toString());
		
		//create a list of Jobs
		//add 5 different jobs with company salary title
		
		ArrayList<Job> jobList = new ArrayList<>(); //Job class ta ArrayList oluşturduk.
		
		jobList.add(job3); //Job class a yeni meslekler + şirket + maaş ekledik.
		
		jobList.add(new Job("SM", "abc", 90000));
		jobList.add(new Job("BA", "klm", 98000));
		jobList.add(new Job("FT", "slm", 100000));
		
		System.out.println(jobList.toString());
		
		//find the highest paying job and print it
			
				double maxSalary = 0;
				int heighestIndex=0;
				
				
				for(int i=0;i<jobList.size();i++) {
					if(jobList.get(i).getAnnualSalary()>maxSalary) {
						maxSalary=jobList.get(i).getAnnualSalary();
						heighestIndex=i; //which index has the highest salary
					}
				}
				
				System.out.println(jobList.get(heighestIndex).getAnnualSalary());
		
	}

}
