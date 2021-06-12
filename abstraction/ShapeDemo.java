package abstraction;

abstract class Shape
{
	double radius;
	double length;
	double width;
	double height;
	double base;
	
	public Shape() {
		
	}
	
	public void method1() {
		System.out.println("This is method 1.");
	}

	public abstract double calculateArea();//method declaration statement
	
	public abstract void drawShape();
}

class Circle extends Shape
{
	double pi = 3.14156;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		
		return pi * radius * radius;
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing a Circle.");
		
	}
	
}

class Triangle extends Shape
{
	
	public Triangle(double base,double height) {
		
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		
		return 0.5 * base * height;
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing a Triangle.");
		
	}
	
}


public class ShapeDemo {

	public static void main(String[] args) {

		Shape s1 = new Circle(6.4);
		
		double area = s1.calculateArea();
		System.out.println("Area of Circle = " + area);
		
		s1 = new Triangle(8.2, 4);
		area = s1.calculateArea();
		System.out.println("Area of Triangle = " + area);
		
	}

}
