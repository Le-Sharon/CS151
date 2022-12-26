
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
public class Person 
{
	String first;
	String last;
	int age;
	int ssc;
	String address;
	String gender;
	float weight;
	
/**
 * Constructor that takes in values
 * @param first
 * @param last
 * @param age
 * @param ssc
 * @param weight
 */
	public Person(String first, String last, int age, int ssc, String address, String gender, float weight)
	{
		this.first = first;
		this.last = last;
		this.age = age;
		this.ssc = ssc;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}
//getter
	/**
	 * get first name
	 * @return first name
	 */
	public String getfirstN()
	{
		return first;
	}
	/**
	 * this method get last name
	 * @return last name
	 */
	public String getLastN()
	{
		return last;
	}
	/**
	 * this method get age
	 * @return age
	 */
	public int getAgeN()
	{
		return age;
	}
	/**
	 * this method get social security
	 * @return ssc
	 */
	public int getSSC()
	{
		return ssc;
	}
	/**
	 * return address
	 * @return address
	 */
	public String getAddress()
	{
		return address;
	}
	/**
	 * this method return gender
	 * @return gender
	 */
	public String getGender()
	{
		return gender;
	}
	/**
	 * this method get weight
	 * @return weight
	 */
	public float getWeight()
	{
		return weight;
	}
	
//setters
	/**
	 * change first name
	 * @param first
	 */
	public void changeFirstN(String first)
	{
		this.first = first;
	}
	/**
	 * change last name
	 * @param last
	 */
	public void changeLastN(String last)
	{
		this.last = last;
	}
	/**
	 * this method change age
	 * @param age
	 */
	public void changeAgeN(int age)
	{
		this.age = age;
	}
	/**
	 * change social security
	 * @param ssc
	 */
	public void changeSSC(int ssc)
	{
		this.ssc = ssc;
	}
	/**
	 * this method change address
	 * @param address
	 */
	public void changeAddress(String address)
	{
		this.address = address;
	}
	/**
	 * this method change gender
	 * @param gender
	 */
	public void changeGender(String gender)
	{
		this.gender = gender;
	}
	/**
	 * this method change weight
	 * @param weight
	 */
	public void changeWeight(float weight)
	{
		this.weight = weight;
	}
	/**
	 * This method return a profile strings of this person data
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
		return temp;
	}
	/**
	 * This method prints out the profile of this person data to console
	 */
	public void introduce()
	{
		System.out.print(toString());
	}
}
