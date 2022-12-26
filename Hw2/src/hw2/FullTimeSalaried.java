package hw2;
/**
 * this class is for person with the roll of a FullTimeSalaried with all elements of a FullTimeSalaried
 * @author Sharon Le
 * @since 10/3/2022
 * @version 1.0
 */
public class FullTimeSalaried extends FullTimeEmployee{
	/**
	 * empty constructor
	 */
	public FullTimeSalaried() {}
	/**
	 * Constructor of FullTimeSalaried class
	 * @param first name
	 * @param last name
	 * @param x address
	 * @param id
	 * @param salary
	 * @param ssn social security
	 */
	public FullTimeSalaried (String first, String last, Address x, int id, double salary, String ssn)
	{
		super (first, last, x, id, salary, ssn);
	}
	/**
	 * This method print string to console containing all elements with the exception of ssn that need enabling 
	 * @param displaySSN bolean to display or not
	 */
	public void introduce(boolean displaySSN)
	{
		if (displaySSN == true)
		{
			String temp = this.toString();
			temp += "- SSN: " + this.getSSN() + "\n";
		}
		System.out.println(this.toString());
	}
	/**
	 * This method compute pay using the formula for FullTimeSalaried position
	 * @return pay
	 */
	public double computePay(int weeks)
	{
		return this.getBasePay() * weeks;
	}
}
