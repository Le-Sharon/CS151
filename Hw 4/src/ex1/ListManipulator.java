package ex1;
/**
 * this class utilizes collections and arraylist method to sort, swap smallest and largest & count occurences
 * @author Sharon Le
 * @since 10/21/22
 * @version 1.0
 * Sources : https://stackoverflow.com/questions/35780278/making-a-table-in-java-using-loops
 */
import java.util.ArrayList;
import java.util.Collections;
public class ListManipulator {
	/**
	 * this method sort the arraylist using given list and boolean ascending to indicate which method to sort
	 * @param myLst my list
	 * @param ascending
	 * @return sorted list
	 */
	public static ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending)
	{
		//ArrayList<Integer> temp = new ArrayList<Integer>(myLst);
		if(ascending == true)
		{
			Collections.sort(myLst);
			return myLst;
		}
		else 
		{
			Collections.sort(myLst, Collections.reverseOrder());
			return myLst;
		}
	}
	/**
	 * this method swap largest with smallest
	 * @param myLst
	 * @return swapped list
	 */
	public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst)
	{
		int high = 0;
		int low = 0;
		//find high
		for (int x = 0; x < myLst.size(); x++)
		{
			if (x == 0)
				high = x;
			else if (high < myLst.get(x))
				high = x;
		}
		for (int y = 0; y < myLst.size(); y++)
		{
			if (y == 0)
				low = y;
			else if (low < myLst.get(y))
				low = y;
		}
		Collections.swap(myLst, high, low);
		return myLst;
	}
	/**
	 * this method counts occurence of a key number and return a table with all the data set to console
	 * @param myLst
	 */
	public static void table(ArrayList<Integer> myLst)
	{
		ArrayList<Integer> occ = new ArrayList<Integer>(); //occurences
		ArrayList<Integer> unique = new ArrayList<Integer>();
		for (int x = 0; x < myLst.size(); x++)
		{
			if (!unique.contains(myLst.get(x)))
			{
				unique.add(myLst.get(x));
				occ.add(1);
			}
			else
			{
				int increase = occ.get(unique.indexOf(myLst.get(x)));
				occ.set(unique.indexOf(myLst.get(x)), increase+1);
			}
		}
		//printing
		System.out.printf("%10s", "Uniques");
		for (int x = 0; x < unique.size(); x++)
			System.out.printf(" | %4s", unique.get(x));
		System.out.println("");
		System.out.printf("%10s", "Occurrence");
		for (int x = 0; x < occ.size(); x++)
			System.out.printf(" | %4s", occ.get(x));
		
	}
	//tester
	public static void main (String [] args)
	{
		//test sort
		ArrayList<Integer> ex = new ArrayList<Integer> ();
		ex.add(9);
		ex.add(3);
		ex.add(1);
		ex.add(2);
		System.out.println(ex);
		sort(ex, true);
		System.out.println(ex);
		sort(ex, false);
		System.out.println(ex);
		//test table
		ArrayList<Integer> ex2 = new ArrayList<Integer> ();
		ex2.add(1);
		ex2.add(6);
		ex2.add(4);
		ex2.add(9);
		ex2.add(6);
		ex2.add(4);
		table(ex2);
	}
}
