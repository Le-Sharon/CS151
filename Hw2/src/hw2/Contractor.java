package hw2;
/**
 * this class is for person with the roll of contractor with all elements of a contractor
 * @author Sharon Le
 * @since 10/3/2022
 * @version 1.0
 */

public class Contractor extends Employee{
	double basePay;
	/**
	 * empty constructor
	 */
	public Contractor() {}
	/**
	 * Constructor of contractor class
	 * @param first name
	 * @param last name 
	 * @param x address
	 * @param id
	 * @param pay base
	 * @param ssn social security
	 */
	public Contractor(String first, String last, Address x, int id, double pay, String ssn)
	{
		super(first, last, x, id, ssn);
		this.basePay = pay;
	}
	/**
	 * This method return value
	 * @return
	 */
	public double getBasePay()
	{
		return basePay;
	}
	/**
	 * This method return value
	 * @return
	 */
	public void setBasePay(double basePay)
	{
		this.basePay = basePay;
	}
	/**
	 * return all types to string
	 */
	@Override
	public String toString()
	{
		String temp = "";
		temp += "- first: " + this.getFirstName() + "\n";
		temp += "- last: " + this.getLastName() + "\n";
		temp += "- age: " + this.getAge() + "\n";
		temp += "- Address: \n" + this.getAddress();
		temp += "- ID: " + this.getID() + "\n";
		temp += "- base Pay: " + this.getBasePay() + "\n";
		return temp;
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
	
	public double computePay(int hrs)
	{
		return basePay * hrs;
	}
}
