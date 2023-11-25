package Inheritance;

//base class
class Shape2{
	public void area() 
	{
		System.out.println("Display Area of Shape");
	}
}

//Devired Class
class Tringle extends Shape2{
	public void area(int h, int b) {
		System.out.println((1/2)*b*h);
	}
}
//Devired Class
// multilevel Inheritance
class EquilateralTrangle extends Triangle{
	public void area(int h,int b) {
		System.out.println((1/2)*b*h);
	}
}


public class Multilevel_Inheritance {

}
