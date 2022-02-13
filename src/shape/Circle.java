package shape;

import base.ShapeBase;

public class Circle extends ShapeBase {
	/**
	 * Circle constructor
	 * @param name The name of the shape
	 * @param radius The radius of the shape
	 */
	public Circle(String name, int radius){
		//accesses base class to create shape
		super(name, radius);
	}
	
	/**
	 * Overrides the calculateArea() method
	 */
	@Override
	public int calculateArea() {
		//formula for area of a circle
		return (3 * radius * radius) / 2;
	}
}
