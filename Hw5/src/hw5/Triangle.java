package hw5;
/**
 * This class is for triangle shape with all its attributes
 * @author Sharon Le
 * @Since 11/11/22
 */
public class Triangle extends Shape{
	private double height, width;

	/**
	 * this is the constructor for triangle
	 * @param height
	 * @param width
	 */
	public Triangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	
	/**
	 * this is getter for height
	 * @return
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * This is setter for height
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * this is the getter for width
	 * @return
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * this is setter for width
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * this is to string for triangle
	 */
	@Override
	public String toString() {
		return "Triangle [height=" + height + ", width=" + width +  ", area= " + computeArea() +"]";
	}
	
	/**
	 * this method compute and print to console the area
	 */
	@Override
	public void compute() {
		
		//calculate area
		double area = 0.5*height*width;
		System.out.println("Area of Triangle is : " + area);
	}
	/**
	 * this method compute area and return it
	 */
	@Override
	public double computeArea() {
		
		//calculate area
		double area = 0.5*height*width;
		return area;
	}
}
