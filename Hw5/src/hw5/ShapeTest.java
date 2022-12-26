package hw5;
/**
 * This class is a tester for shapes
 * @author Sharon Le
 * @Since 11/11/22
 */
import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
		
		//create Shapes object
		Shapes shapes = new Shapes(new ArrayList<Shape>());
		
		//all cases
		shapes.add(new Hexagon(18));
		shapes.add(new Hexagon(15));
		shapes.add(new Triangle(9, 2));
		shapes.add(new Triangle(6, 9));
		shapes.add(new Circle(5));
		shapes.add(new Circle(9));
		shapes.add(new Rectangle(22, 17));
		shapes.add(new Rectangle(5, 10));
		
		// test max mins
		shapes.min(shapes);
		shapes.max(shapes);
		System.out.println();
		
		//test concurrent compute
		shapes.compute();
	
		
		
	}
}
