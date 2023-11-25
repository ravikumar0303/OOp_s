package abstraction;

interface Animal2{
	void walk();
}

interface Herbivore{
	void eat();
}

class Horse2 implements Animal2,Herbivore{
	
	public void walk() {
		System.out.println("Walk in 4 leg`s");
	}
	public void eat() {
		System.out.println("eat`s plants only");
	}
}
public class multipe_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Horse2 horse=new Horse2();
          horse.walk();
          horse.eat();
	}

}
