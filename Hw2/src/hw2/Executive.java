package hw2;
/**
 * this class is for person with the roll of a executive with all elements of a executive
 * @author Sharon Le
 * @since 10/3/2022
 * @version 1.0
 */

public class Executive extends Employee {
	double yearlyBonus;
	double yearlyCompensation;
	/**
	 * empty constructor
	 */
	public Executive() {}
	/**
	 * Constructor of executive class
	 * @param first name
	 * @param last name
	 * @param x address
	 * @param id
	 * @param pay base
	 * @param bonus pay
	 * @param ssn social security number
	 */
	public Executive(String first, String last, Address x, int id, double pay, double bonus, String ssn)
	{
		super(first, last, x, id, ssn);
		this.yearlyBonus = bonus;
		this.yearlyCompensation = pay;
	}
	/**
	 * This method return value
	 * @return
	 */
	public double getBonus()
	{
		return yearlyBonus;
	}
	/**
	 * This method replace value bonus
	 * @return
	 */
	public void setBonus(double yearlyBonus)
	{
		this.yearlyBonus = yearlyBonus;
	}
	/**
	 * This method return value
	 * @return
	 */
	public double getCompensation ()
	{
		return yearlyCompensation;
	}
	/**
	 * this method replace compensation
	 * @param id
	 */
	public void setCompensation(double yearlyCompensation)
	{
		this.yearlyCompensation = yearlyCompensation;
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
		temp += "- yearly bonus: " + this.getBonus() + "\n";
		temp += "- yearly compensation: " + this.getCompensation() + "\n";
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
	/**
	 * This method compute pay using the formula for executive position
	 * @return pay
	 */
	public double computePay()
	{
		return yearlyBonus + yearlyCompensation;
	}
}
