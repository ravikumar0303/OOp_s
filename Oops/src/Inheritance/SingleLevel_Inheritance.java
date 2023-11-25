package Inheritance;

//base class
class Shape1 {
	public void area() {
		System.out.println("Displays Area of Shape");
	}
}

//Devired Class
class Triangle extends Shape1 {
	public void area(int h, int b) {
		System.out.println((1 / 2) * b * h);
	}
}

public class SingleLevel_Inheritance {
	public static void main(String[] args) {
	
		

	}
}
