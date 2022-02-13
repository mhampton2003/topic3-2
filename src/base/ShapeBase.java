package base;

public class ShapeBase implements ShapeInterface {
	protected int width;
	protected int height;
	protected String name;
	protected int a;
	protected int b;
	protected int radius;
	
	/**
	 * Shape constructor
	 * @param name The name of the shape
	 * @param width The width of the shape
	 * @param height The height of the shape
	 */
	public ShapeBase(String name, int width, int height) {
		this.name = name;		
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Shape constructor
	 * @param name The name of the shape
	 * @param radius The radius of the shape
	 */
	public ShapeBase(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}
	
	/**
	 * Shape constructor
	 * @param name The name of the shape
	 * @param a Base 1 of the shape
	 * @param b Base 2 of the shape
	 * @param height The height of the shape
	 */
	public ShapeBase(String name, int a, int b, int height) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.height = height;
	}
	
	/**
	 * Returns the name of the shape
	 * @return name The name of the shape
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Overrides the calculateArea() method
	 * default sets the area to -1
	 */
	@Override
	public int calculateArea() {
		return -1;
	}

}
