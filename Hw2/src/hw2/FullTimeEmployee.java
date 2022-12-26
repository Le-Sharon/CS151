package hw2;
/**
 * this class is for person with the roll of a FullTimeEmployee with all elements of a FullTimeEmployee
 * @author Sharon Le
 * @since 10/3/2022
 * @version 1.0
 */
public abstract class FullTimeEmployee extends Employee{
	double basePay;
	/**
	 * empty constructor
	 */
	public FullTimeEmployee() {}
	/**
	 * Constructor of FullTimeEmployee class
	 * @param first name
	 * @param last name
	 * @param x address
	 * @param id
	 * @param pay base
	 * @param ssnsocial security number
	 */
	public FullTimeEmployee (String first, String last, Address x, int id, double pay, String ssn){
		super(first, last, x, id, ssn);
		this.basePay = pay;
	}
	/**
	 * This method return value
	 * @return pay
	 */
	public double getBasePay()
	{
		return basePay;
	}
	/**
	 * This method replace value
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
		temp += "- BasePay: " + this.getBasePay() + "\n";
		return temp; 
	}
}
