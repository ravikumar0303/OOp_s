package static_concept;
// static that`s vo class ke liye Common ho

class Student {
	// Properties
	String name;
	// -----------------------------------------------------
	// String school;
	// here school sabhi class Student ke liye to Common hi hogi So.....
	// ------------------------------------------
	static String school;
	
	 public static void changeSchool() {
		 school="Dr.rmlau Ayodhya";
	   }
}

//static keyword in Function/Method

 

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * here school is static TO School ko Class ke name se Access kar sakte hain
		 * Object Create karne se pahle
		 */
		Student.school = "IET Acts";
		Student std = new Student();
		std.name = "Ravi";
		System.out.println("Student name: " + std.name);
		System.out.println("Student School: " + Student.school);

	}

}
