package hw5;
/**
 * this has functionalities for the shape Rectangle
 * @author Sharon Le
 * @Since 11/11/22
 *
 */
public class Rectangle extends Shape{
	private double height, width;

	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	/**
	 * this is getters for given attributes	
	 * @return
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * this is setters for given attributes	
	 * @return
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * this is getters for given attributes	
	 * @return
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * this is setters for given attributes	
	 * @return
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * this method provide to string method to class
	 */
	@Override
	public String toString() {
		return "Triangle [height=" + height + ", width=" + width + ", area= " + computeArea() +"]";
	}
		
	/**
	 * method to compute area and print to console
	 */
	@Override
	public void compute() {
		//calculate area
		double area = height*width;
		System.out.println("Area of Rectangle is : " + area);
	}
	/**
	 * method to compute area and return area
	 */
	@Override
	public double computeArea() {
		//calculate area
		double area = height*width;
		return area;
	}
}
