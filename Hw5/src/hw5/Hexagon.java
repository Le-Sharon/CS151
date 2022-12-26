package hw5;
/**
 * this has functionalities for the shape hexagon
 * @author Sharon Le
 * @since 11/11/22
 *
 */
public class Hexagon extends Shape {
	private double side; //basically radius measurements using sides of hexagons

	/**
	 * this is constructor for hexagon
	 * @param side/radius
	 */
	public Hexagon(double side) {
		super();
		this.side = side;
	}
	
	/**
	 * getter method for radius
	 * @return
	 */
	public double getRadius() {
		return side;
	}
	/**
	 * setters method for radius 
	 * @param side
	 */
	public void setRadius(double side) {
		this.side = side;
	}
		
	/**
	 * this method provide to string method to class
	 */
	@Override
	public String toString() {
		return "Hexagon [side=" + side +  ", area= " + computeArea() +"]";
	}
		
	/**
	 * this method compute area and sent to console
	 */
	@Override
	public void compute() {
			
		//calculate area
		double area = ((Math.sqrt(3)*3)/2)*side*side;
		System.out.println("Area of Hexagon is : " + area);
	}
	
	/**
	 * this method directly compute area and return area
	 */
	@Override
	public double computeArea() {
		double area = ((Math.sqrt(3)*3)/2)*side*side;
		return area;
	}
}
