package shape;

import base.ShapeBase;

public class Triangle extends ShapeBase {
	/**
	 * Triangle constructor
	 * @param name The name of the shape
	 * @param width The width of the shape
	 * @param height The height of the shape
	 */
	public Triangle(String name, int width, int height) {
		//accesses the base class to create the shape
		super(name, width, height);
	}
	
	/**
	 * Overrides the calculateArea() method
	 */
	@Override
	public int calculateArea() {
		//calculates the area of a triangle
		return (width * height) / 2;
	}

}
