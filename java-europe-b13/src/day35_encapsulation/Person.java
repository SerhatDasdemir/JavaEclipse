package day35_encapsulation;

public class Person {
	
	
	String name;
	int age;
	public char gender;
	
	
	
	public Person(String name, int age, char gender) {
		getAge();
		getName();
		this.gender = gender;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
//	public void setAge(int age) {
//		//condition
//		this.age=age;
//
//	}
//	
//	public int getAge() {
//		return age;
//		
//	}
//	
//	public void print() {
//		
//		System.out.println(name + " " + age);
//		
//	}
//	
//	public void year() {
//		System.out.println(2019-age);
//		
//	}
//	
	
}
