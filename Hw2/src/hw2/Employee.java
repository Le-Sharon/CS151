package hw2;
/**
 * this class is for person with the generalized roll of Employee with all elements for a employee
 * @author Sharon Le
 * @since 10/3/2022
 * @version 1.0
 */

public abstract class Employee extends Person{
	int id;
	String edu;
	boolean directDepot;
	/**
	 * empty constructor
	 */
	public Employee() {}
	/**
	 * Constructor of Employee class
	 * @param first name
	 * @param last name
	 * @param x address
	 * @param id
	 * @param ssn social security number
	 */
	public Employee(String first, String last, Address x, int id, String ssn)
	{
		super(first, last, x, ssn);
		this.id = id;
	}
	/**
	 * This method return value
	 * @return
	 */
	public int getID()
	{
		return id;
	}
	/**
	 * This method return value
	 * @return
	 */
	public String getEducation()
	{
		return edu;
	}
	/**
	 * This method return value
	 * @return
	 */
	public boolean getDirectDeposit()
	{
		return directDepot;
	}
	/**
	 * this method replace id
	 * @param id
	 */
	public void setID(int id)
	{
		this.id = id;
	}
	/**
	 * this method replace education level
	 * @param id
	 */
	public void setEducation (String edu)
	{
		this.edu = edu;
	}
	/**
	 * this method replace direct deposit preference
	 * @param id
	 */
	public void setDirectDeposit(boolean depot)
	{
		this.directDepot = depot;
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
		temp += "- Address: " + this.getAddress() + "\n";
		temp += "- ID: " + this.getID() + "\n";
		return temp;
	}
}
