
class Student {
	String name;
	int age;

	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	// Default or Non parameteties Constructor
//	 Student(){
//		 System.out.println("Non parameteries Constructor");
//	 }
//	 
	 
	 //Parameteries Constructor
	 Student(String ravi, int age){
		 this.name=ravi;
		 this.age=age;
	 }
	 
	 // Copy Contructor
	 
	 Student(Student s2){
		 this.name=s2.name;
		 this.age=s2.age;
	 }
	 
	 // Obj s1 ke liye Default Constructor
	 Student(){
		 System.out.println("s1 Default Constructor");
	 }
	 

}

public class Oops {

	public static void main(String[] args) {
//		Student std=new Student();
//		std.name="Rishikesh";
//		std.age=22;     
//		std.printInfo();
		
		
		// Parameteries Contructor Called Method
		
//		Student std=new Student("Rishikesh",22);
//		std.printInfo();
		
		
		//Copy Constructor
		
		Student s1=new Student();
		s1.name="Rishikesh";
		s1.age=22;     
		
		Student s2=new Student(s1);
		s2.printInfo();
	}

}
