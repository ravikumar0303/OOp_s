package abstraction;

//Two type of Abstraction 
/* 1. Abstract class
   2.Interfaces(pure Abstraction)
*/

// 1.Abstract class
/* animal only Concept Does`t Exist */
abstract class Animal {
	abstract void walk(); //Implementation Write karne ki jaroorat nahi hai
  //properties..2. Non-abstract method
	
	public void eat() {
		System.out.println("Animal eat`s");
	}
	
	//4. it can have Construction and static meth0d
	Animal(){
		System.out.println("You are About to create an Animal");
	}
}

class Horse extends Animal {
	public void walk() {
		System.out.println("Walk  4 legs");
	}
	//4. it can have Construction and static meth0d
	    Horse(){
	    	System.out.println("You have Ceate A horse!");
	    }
}

class Chicken extends Animal {
	public void walk() {
		System.out.println("Ealk in 2 leg");
	}
}

public class Abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horse horse = new Horse();
		horse.walk();
		
	/*	Animal animal=new Animal();
		animal.walk();
		User Animal ko walk nahi kara sakta
		*/
		horse.eat();
	}

}
