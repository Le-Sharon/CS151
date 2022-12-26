package hw2;
/**
 * this class is for person with the roll of a PartTimeHourly with all elements of a PartTimeHourly
 * @author Sharon Le
 * @since 10/3/2022
 * @version 1.0
 */
public class PartTimeHourly extends Employee{
	double baseHourlyPay;
	/**
	 * empty constructor
	 */
	public PartTimeHourly() {}
	/**
	 * Constructor of PartTimeHourly class
	 * @param first name
	 * @param last name
	 * @param x address
	 * @param id
	 * @param pay
	 * @param ssn social security
	 */
	public PartTimeHourly(String first, String last, Address x, int id, double pay, String ssn)
	{
		super(first, last, x, id, ssn);
		this.baseHourlyPay = pay;
	}
	/**
	 * This method return value
	 * @return pay
	 */
	public double getHourlyPay()
	{
		return baseHourlyPay;
	}
	/**
	 * This method replace value
	 * @return pay
	 */
	public void setHourlyPay(double baseHourlyPay)
	{
		this.baseHourlyPay = baseHourlyPay;
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
		temp += "- Base Hourly Pay: " + this.getHourlyPay() + "\n";
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
	 * This method compute pay using the formula for PartTimeHourly position
	 * @return pay
	 */
	public double computePay(int hrs)
	{
		if (hrs > 40)
		{
			return -1;
		}
		return hrs * baseHourlyPay;
	}
}
