package hw5;
/**
 * this has functionalities for the shape circle
 * @author Sharon Le
 * @since 11/11/22
 *
 */
public class Circle extends Shape{
	private double radius;

	/**
	 * this is the constructor
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

		
	/**
	 * this method get radius of circle
	 * @return
	 */
	public double getRadius() {
			return radius;
	}

	/**
	 * this methood set radius of circle
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * this method provide to string method to class
	 */
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area= " + computeArea() + "]";
	}
		
	/**
	 * this method compute area and sent to console
	 */
	@Override
	public void compute() {
		double area = Math.PI*radius*radius;
		System.out.println("Area of Circle is : " + area);
	}
	
	/**
	 * this method directly compute area and return area
	 */
	@Override
	public double computeArea() {
		double area = Math.PI*radius*radius;
		return area;
	}
}
