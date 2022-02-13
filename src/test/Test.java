package test;
import shape.Rectangle;
import base.ShapeBase;
import shape.Triangle;
import shape.Circle;
import shape.Trapezoid;

/**
 * 
 * @author Maya
 *
 */
public class Test {
	/**
	 * Displays the name and area of the shape
	 * @param shape The shape
	 */
	private static void displayArea(ShapeBase shape) {
		System.out.println("The " + shape.getName() + " has an area of " + shape.calculateArea());
	}
	
	/**
	 * Main. Creates array of shapes and displays their areas
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		//creates array of shapes
		ShapeBase[] shapes = new ShapeBase[4];
		shapes[0] = new Rectangle("Rectangle", 10, 200);
		shapes[1] = new Triangle("Triangle", 10, 50);
		shapes[2] = new Circle("Circle", 25);
		shapes[3] = new Trapezoid("Trapezoid", 3, 6, 5);
		
		//displays the area for each shape
		for (int i = 0; i < shapes.length; ++i) {
			displayArea(shapes[i]);
		}
	}

}
