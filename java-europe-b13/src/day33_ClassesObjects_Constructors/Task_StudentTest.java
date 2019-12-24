package day33_ClassesObjects_Constructors;

public class Task_StudentTest {

	public static void main(String[] args) {

  Task_Student s1 = new Task_Student ("Mike", 17, 'M', 2016, "Java", "Cybertek",true);
  Task_Student s2 = new Task_Student ("Smith" , 19, 'F', 2017, "TS", "Cybertek", true);
  
  s1.attendLecture();
  s2.attendLecture();
  
  System.out.println("---------------------");
  s1.attendLab();
  s2.attendLab();
  
  System.out.println("-------------------------");
  s1.submitAssignment();
  s2.submitAssignment();

	}

}
