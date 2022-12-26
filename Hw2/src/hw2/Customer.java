package hw2;
/**
 * this class is for person with the roll of Customer with all elements of a customer
 * @author Sharon Le
 * @since 10/3/2022
 * @version 1.0
 */

public class Customer extends Person{
	int id;
	String paypref;
	/**
	 * empty constructor
	 */
	public Customer() {}
	/**
	 * Constructor of Customer class
	 * @param first name
	 * @param last name 
	 * @param x address
	 * @param id
	 * @param ssn social security number
	 * @param input pay preference
	 */
	public Customer(String first, String last, Address x, int id, String ssn, String input)
	{
		super(first, last, x, ssn);
		this.id = id;
		this.paypref = input;
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
	public void setID(int id)
	{
		this.id = id;
	}
	/**
	 * This method return value
	 * @return
	 */
	public String getPayPreference()
	{
		return paypref;
	}
	/**
	 * this method replace pay preference
	 * @param input new preference
	 */
	public void setPayPreference(String input)
	{
		this.paypref = input;
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
		temp += "- ID: " + this.getID() +"\n";
		temp += "- Payment Preference: " + this.getPayPreference() +"\n";
		return temp;
	}
	/**
	 * This method print string to console containing all elements with the exception of ssn that need enabling 
	 * 
	 */
	public void introduce()
	{
		System.out.println(this.toString());
	}
	/**
	 * this method will print to console the payment preference of this customer
	 */
	public void makePayment()
	{
		System.out.println("Payment will be made to the prefered payment type: " + this.getPayPreference() +"\n");
	}
}
