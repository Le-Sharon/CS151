package hw2;
/**
 * This class saves all the input for address of a person
 * @author Sharon Le
 * @Since 10/3/2022
 * @version 1.0
 */
public class Address {
	private int number;
	private String name;
	private String city;
	private int zip;
	private String state;
	
	/**
	 * This constructor receives inputs for address
	 * @param number
	 * @param name
	 * @param city
	 * @param zip
	 * @param state
	 */
	public Address(int number, String name, String city, int zip, String state)
	{
		this.number = number;
		this.name = name;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	
	/**
	 * This method gets street number
	 * @return street number
	 */
	public int getStreetNum()
	{
		return number;
	}
	/**
	 * This method gets street name
	 * @return Street name
	 */ 
	public String getStreetName()
	{
		return name;
	}
	/**
	 * This method get city name
	 * @return city name
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * this method get zip code
	 * @return zip code
	 */
	public int getZip()
	{
		return zip;
	}
	/**
	 * this method get state name
	 * @return return state name
	 */
	public String getState()
	{
		return state;
	}
	/**
	 * This method replace street number to new street number
	 * @param number to replace
	 */
	public void setStreetNum(int number)
	{
		this.number = number;
	}
	/**
	 * this method replace street name to new street name
	 * @param name to replace
	 */
	public void setStreetName(String name)
	{
		this.name = name;
	}
	/**
	 * this method repalce city name with new city name
	 * @param city to replace
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	/**
	 * this method replace zip code to new zip code
	 * @param zip to replace
	 */
	public void setZip(int zip)
	{
		this.zip = zip;
	}
	/**
	 * this method replace state to new state 
	 * @param state to replace
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	
	/**
	 * return all types to string
	 */
	@Override
	public String toString()
	{
		String temp = "";
		temp += "- Street Number: " + this.getStreetNum() + "\n";
		temp += "- Street Name: " + this.getStreetName() + "\n";
		temp += "- City: " + this.getCity() + "\n";
		temp += "- ZipCode: " + this.getZip() + "\n";
		temp += "- State: " + this.getState() + "\n";
		return temp;
	}
}
