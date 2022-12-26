package hw2;
/**
 * this class is for person with the roll of a FullTimeHourly with all elements of a FullTimeHourly
 * @author Sharon Le
 * @since 10/3/2022
 * @version 1.0
 */
public class FullTimeHourly extends FullTimeEmployee {
	double overtime;
	/**
	 * empty constructor
	 */
	public FullTimeHourly() {}
	/**
	 * Constructor of executive class
	 * @param first name
	 * @param last name
	 * @param x address
	 * @param id
	 * @param basePay
	 * @param overtime
	 * @param ssn social security
	 */
	public FullTimeHourly (String first, String last, Address x, int id, double basePay, double overtime, String ssn)
	{
		super(first, last, x, id, basePay, ssn);
		this.overtime = overtime;
	}
	/**
	 * This method return value
	 * @return
	 */
	public double getOverTimePay()
	{
		return overtime;
	}
	/**
	 * This method replace value
	 * @return
	 */
	public void setOverTime(double overtime)
	{
		this.overtime = overtime;
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
		temp += "- Overtime: " + this.getOverTimePay() + "\n";
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
	 * This method compute pay using the formula for FullTimeHourly position
	 * @return pay
	 */
	public double computePay(int hrs)
	{
		if (hrs > 40)
		{
			return (40* this.getBasePay() + (hrs - 40)* this.getOverTimePay());
		}
		return hrs * this.getBasePay();
	}
}
