package hw6;
/**
 * This class test generics method 
 * 
 * @author Sharon Le
 * @since 11/14/22
 */
import java.util.*;
public class MethodTest {
	/**
	 * this method counts the elements inside given list
	 * @param <T>
	 * @param list
	 * @return
	 */
	public static <T> int count (List<T> list)
	{
		return list.size();
	}
	
	public static void main(String [] args)
	{
		ArrayList<String> test1 = new ArrayList<>();
		test1.add("hi");
		test1.add("hello");
		test1.add("yes");
		test1.add("no");
		
		ArrayList<Integer> test2 = new ArrayList<>();
		test2.add(2);
		test2.add(3);
		test2.add(4);
		
		ArrayList<Double> test3 = new ArrayList<>();
		test3.add(1.2);
		test3.add(2.3);
		test3.add(3.4);
		test3.add(4.5);
		test3.add(5.6);
		test3.add(6.7);
		
		System.out.println("Testing strings count : " + count(test1));
		System.out.println("Testing integers count : " + count(test2));
		System.out.println("Testing doubles count : " + count(test3));
	}
}
