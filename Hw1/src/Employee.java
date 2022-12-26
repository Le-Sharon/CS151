/**
 * 
 * @author Sharon Le
 * @version 1.0
 * @since 8/26/2022
 * Source: https://examples.javacodegeeks.com/how-to-call-a-method-in-java/#:~:text=To%20call%20a%20method%20in%20Java%2C%20write%20the%20method%27s%20name,transferred%20to%20the%20called%20method.&text=You%20have%20called%20me!,-My%20name%20isSource: https://examples.javacodegeeks.com/how-to-call-a-method-in-java/#:~:text=To%20call%20a%20method%20in%20Java%2C%20write%20the%20method%27s%20name,transferred%20to%20the%20called%20method.&text=You%20have%20called%20me!,-My%20name%20is
 * 
 * This class is a introductory review of previous knowledge of java, using
 * constructor creation and utilizing simple setters and getters methods.
 */
public class Employee extends Person 
{
	String id;
	String status;
	float pay;
	/**
	 * this constructor will get all attributes given
	 * @param first
	 * @param last
	 * @param age
	 * @param ssc
	 * @param address
	 * @param gender
	 * @param weight
	 * @param id
	 * @param status
	 * @param pay
	 */
	public Employee(String first, String last, int age, int ssc, String address, String gender, float weight, String id, String status, float pay)
	{
		super(first, last, age, ssc, address, gender, weight);
		this.id = id;
		this.status = status;
		this.pay = pay;
	}
	
	//getters
	/**
	 * get ID
	 * @return id
	 */
	public String getID()
	{
		return id;
	}
	
	/**
	 * get status
	 * @return status
	 */
	public String getStatus()
	{
		return status;
	}
	
	/**
	 * get pay amount
	 * @return pay
	 */
	public float getPay()
	{
		return pay;
	}
	
	//setters
	/**
	 * change ID
	 * @param newID
	 */
	public void changeID(String newID)
	{
		this.id = newID;
	}
	
	/**
	 * change status
	 * @param status
	 */
	public void changeStatus(String status)
	{
		this.status = status;
	}
	
	/**
	 * change pay
	 * @param pay
	 */
	public void changePay(float pay)
	{
		this.pay = pay;
	}
	/**
	 * This method return a profile strings of this employee data
	 * @return temporary profile string
	 */
	@Override
	public String toString()
	{
		String temp = "";
		temp += "- firstName: " + first + "\n";
		temp += "- lastName: " + last + "\n";
		temp += "- age: " + age + "\n";
		temp += "- ssn: " + ssc + "\n";
		temp += "- address: " + address + "\n";
		temp += "- gender: " + gender + "\n";
		temp += "- weight: " + weight + "\n";
		temp += "- id: " + id + "\n";
		temp += "- status: " + status + "\n";
		temp += "- basePay: " + pay + "\n";
		return temp; 
	}
	/**
	 * This method prints out the profile of this employee data to console
	 */
	@Override
	public void introduce()
	{
		System.out.print(toString());
	}
	/**
	 * this method will calculate all pays
	 * @param units
	 * @return
	 */
	public double calculatePay(double units)
	{
		double salary = 0;
		if (this.getStatus() == "full time")
		{
			salary = (getPay()/52) * units;
		}
		if (this.getStatus() == "part time" || this.getStatus() == "contractor" || this.getStatus() == "contractor employee")
		{
			salary = getPay() * units;
		}
		return salary;
	}
	
}
