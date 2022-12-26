package hw5;
import java.util.*;
/**
 * this has class does most of the work for calculating concurrently for all shapes
 * @author Sharon Le
 * @Since 11/11/22
 *
 */
public class Shapes {
	private ArrayList<Shape> list = new ArrayList<Shape>();
	
	/**
	 * This constructor for shapes
	 * @param shapeList
	 */
	public Shapes(ArrayList<Shape> list) {
		this.list = list;
	}
	
	/**
	 * this method get list and return it
	 * @return list
	 */
	public ArrayList<Shape> getList() {
		return list;
	}
	/**
	 * this method set list
	 * @param shapeList
	 */
	public void setShapeList(ArrayList<Shape> shapeList) {
		this.list = shapeList;
	}

	/**
	 * this method add on shapes to list
	 * @param s
	 */
	public void add(Shape s) {
		list.add(s);
	}
		
	/**
	 * this method remove shape from list
	 * @param s
	 */
	public void remove(Shape s) {
		list.remove(s);
	}
		
	/**
	 * this method compute synchronously and send to console all shapes from list
	 */
	public synchronized void compute() {
		
		//iterate 
		for(Shape s : list){
			s.start();
		}	
	}
	
	/**
	 * find the minimum area shape from list
	 * @param lis
	 */
	public void min(Shapes lis) {

		ArrayList<Shape> list = lis.getList();

		Shape s = null;

		double area = Integer.MAX_VALUE;

		for(int i=0;i<list.size();i++) {

		if(area > list.get(i).computeArea() ) {

		area = list.get(i).computeArea() ;
		s = list.get(i);

			}
		}
		
		System.out.println("\nThis is your Mins\n" + s.toString());
	}
	
	/**
	 * find the shape with maximum area
	 * @param lis
	 */
	public void max(Shapes lis) {

		ArrayList<Shape> list = lis.getList();

		Shape s = null;

		double area = Integer.MIN_VALUE;

		for(int i=0;i<list.size();i++) {

		if(area < list.get(i).computeArea() ) {

		area = list.get(i).computeArea() ;
		s = list.get(i);

			}
		}
		System.out.println("\nThis is your Max\n" + s.toString());
	}
}
