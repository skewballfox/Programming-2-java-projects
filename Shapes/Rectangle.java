/* Rectangle subclass
inherents from the shape superclass
Joshua Ferguson
*/

public class Rectangle extends Shape
{
	private double width, length; //sides
	
	
	public Rectangle () {
		super();
		width = 0;
		length = 0;
	}
	public Rectangle(double input_width, double input_length) {
		width=setWidth(input_width);
		length=setLength(input_length);
		
	}
	//sets the necessary variables
	public double setWidth(double newWidth) {
		return  newWidth;
	}
	public double setLength(double newLength) {
		return newLength;
	}
	
	
	//overide methods for perimeter and area
	public double perimeter() {
		return 2 * (Math.abs(width) + Math.abs(length));
	}
	public double area() {
		return Math.abs(width) * Math.abs(length);
	}
}