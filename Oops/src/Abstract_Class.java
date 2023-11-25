//Abstract class
abstract class fruit{
	abstract void run();
}


//Derived class
class Apple extends fruit{
	void run() {
		System.out.println("Astract class");
	}
}
public class Abstract_Class {
	public static void main(String[] args) {
		fruit obj=new Apple();
		obj.run();
		
	}
	
	

}
