package Inheritance;

//base class
class Shape3{
	public void area() {
		System.out.println("Display area of Shape");
	}
	
}

// Derived Class
class Triangle2 extends Shape{
	public void area(int h, int b) {
		System.out.println((1/2)*b*h);
	}
}
// Derived Class
class Circule extends Shape{
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}


public class Hierarichial_Inheritance {
	
	

}
