package abstraction;

interface Animal1 {
	public void walk();

}

class Horse1 implements Animal1 {
	@Override
	public void walk() {
		System.out.println("walk on 4 leg`s");
	}

}

public class _2_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horse1 horse = new Horse1();
		horse.walk();
	}

}
