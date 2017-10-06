/*Client side program to test shapes
Joshua Ferguson
*/
import java.util.Scanner;

public class ShapeClient{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double radius, width, length;
		
		//Gather data
		System.out.println("Enter the radius of the circle");
		radius=scan.nextDouble();
		Shape circle = new Circle(radius);
		//rectangle test
		
		System.out.println("Enter the length of the rectangle");
		length=scan.nextDouble();
		System.out.println("Enter the width of the rectangle");
		width=scan.nextDouble();
		Shape rectangle = new Rectangle(width,length);
		
		//output results
		System.out.println("The area of a circle with a radius of "+
		radius + " is "+ circle.area() );
		System.out.println("The perimeter of a circle with a radius of "+
				radius + " is "+ circle.perimeter() );
		System.out.println("The area of a rectangle with a length of "+
				length + " and width of "+width+ " is "+ rectangle.area() );
		System.out.println("The perimeter of a rectangle with a length of "+
				length + " and width of "+width+ " is "+ rectangle.perimeter() );
	}
}