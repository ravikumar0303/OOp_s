package Polymorphism;


class Student{
	
	String name;
	int age;
	
	// Create All function with same name
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name+""+age);
	}
	
	// all the polymorphism Concept
}


public class ConceptPolymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.name="Rishikesh";
		s1.age=22;
		
		
		
		// You can seen the out-put
//		s1.printInfo(s1.age);
//		s1.printInfo(s1.name);
		
		
		
		s1.printInfo(s1.name, s1.age);

	}

}
