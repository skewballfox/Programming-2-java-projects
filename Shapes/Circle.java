/*Circle subclass of Shape abstract class
defines how to get area and perimeter
Joshua Ferguson
*/

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		super();
		radius = 0;
	}
	public Circle(double user_radius) {
		radius= setRadius(user_radius);
	}
	public double setRadius(double newRadius) {
		return newRadius;
	}
	
	//override methods follow
	public double area() {
		return Math.pow(Math.abs(radius), 2)*PI;
	}
	
	public double perimeter() {
		return Math.abs(radius)*2*PI;
		
	}
}