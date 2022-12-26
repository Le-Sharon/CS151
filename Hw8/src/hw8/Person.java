package hw8;
/**
 * this class is for person, a parent class
 * @author Sharon Le
 * @since 10/3/2022
 * @version 1.0
 */
public class Person {
	String first;
	String last;
	int age;
	String ssn;
	Address address;
	/**
	 * empty constructor
	 */
	public Person() {}
	/**
	 * Constructor of Person class
	 * @param first name
	 * @param last name
	 * @param x address 
	 * @param ssn social security
	 */
	public Person(String first, String last, Address x, String ssn)
	{
		this.first = first;
		this.last = last;
		this.age = age;
		this.ssn = ssn;
		this.address = x;
	}
	/**
	 * This method return value
	 * @return pay
	 */
	public String getFirstName()
	{
		return first;
	}
	/**
	 * This method return value
	 * @return pay
	 */
	public String getLastName()
	{
		return last;
	}
	/**
	 * This method return value
	 * @return pay
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * This method return value
	 * @return pay
	 */
	public String getSSN()
	{
		return ssn;
	}
	/**
	 * This method return value
	 * @return pay
	 */
	public Address getAddress()
	{
		return address;
	}
	/**
	 * this method replace value
	 * @param first
	 */
	public void setFirst(String first)
	{
		this.first = first;
	}
	/**
	 * this method replace value
	 * @param last
	 */
	public void setLast(String last)
	{
		this.last = last;
	}
	/**
	 * this method replace value
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	/**
	 * this method replace value
	 * @param ssn
	 */
	public void setSSN(String ssn)
	{
		this.ssn = ssn;
	}
	/**
	 * this method replace value
	 * @param x
	 */
	public void setAddress(Address x)
	{
		this.address = x;
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
		temp += "- SSN: " + this.getSSN() + "\n";
		temp += "- Address: " + this.getAddress() + "\n";
		return temp;
	}
}
