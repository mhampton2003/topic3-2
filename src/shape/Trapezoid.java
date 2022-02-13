package shape;

import base.ShapeBase;

public class Trapezoid extends ShapeBase {
	/**
	 * Trapezoid constructor
	 * @param name The name of the shape
	 * @param a The top base of the shape
	 * @param b The bottom base of the shape
	 * @param height The height of the shape
	 */
	public Trapezoid(String name, int a, int b, int height) {
		//accesses base class to create shape
		super(name, a, b, height);
	}
	
	/**
	 * Overrides calculateArea() method
	 */
	@Override
	public int calculateArea() {
		//formula for the area of a trapezoid
		return (height / 2) * (a + b);
	}

}
