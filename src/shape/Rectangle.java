package shape;

import base.ShapeBase;

public class Rectangle extends ShapeBase {
	/**
	 * Rectangle constructor
	 * @param name The name of the shape
	 * @param width The width of the shape
	 * @param height The height of the shape
	 */
	public Rectangle(String name, int width, int height) {
		//accesses base class to create shape
		super(name, width, height);
	}
	
	/**
	 * Overrides calculateArea() method
	 */
	@Override
	public int calculateArea() {
		//formula for the area of a rectangle
		return width * height;
	}

}
