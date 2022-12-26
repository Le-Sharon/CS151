package hw3;
/**
 * employee class that stores attributes and calculate pay
 * @author Sharon Le
 *
 */
public class Employee {
	String fname;
	String lname;
	String id;
	float pay;
	
	public Employee(String fname, String lname, String id, float pay)
	{
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		this.pay = pay;
	}
	/**
	 * this method return input for string
	 * @return name
	 */
	public String getFirst() { return fname;}
	/**
	 * this method return input for string
	 * @return name
	 */
	public String getLast() { return lname;}
	/**
	 * this method return input for string
	 * @return name
	 */
	public String getID() { return id;}
	/**
	 * this method return input for float
	 * @return name
	 */
	public float getPay() { return pay;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setFirst(String fname) { this.fname = fname;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setLast(String lname) { this.lname = lname;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setFID(String id) { this.id = id;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setPay(float pay) { this.pay = pay;}
	/**
	 * calculates pay and return errors when the inputted hours are overtime or a negative number
	 * @param hrs
	 * @return
	 * @throws Exception
	 */
	public float calculatePay(int hrs) throws Exception
	{
		try
		{
			if (hrs < 0)
				throw new NumberFormatException();
			if (hrs > 40)
				throw new TooManyHoursWorkedException("You worked overtime");
		}
		catch (Exception e)
		{
			 e.printStackTrace();
			 return -1;
		}
		return pay*hrs;
	}
}
