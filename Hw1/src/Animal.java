/**
 * This is a parent class for Animals of any type to inherits
 * @author Sharon Le
 * @version 1.0
 * @since 8/26/2022
 */
public class Animal {
	String type;
	String name;
	int age;
	String gender;
	String habitat;
	float speed;
	/**
	 * this constructor will get all attributes given
	 * @param name of animal
	 * @param type of animal
	 * @param age of animal
	 * @param gender of animal
	 * @param habitat of animal
	 * @param speed of animal
	 */
	public Animal (String name, String type, int age, String gender, String habitat, float speed)
	{
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.habitat = habitat;
		this.speed = speed;
	}
	/**
	 * This method gets type
	 */
	public String getType()
	{
		return type;
	}
	/*
	 * this method gets name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * this method get age
	 * @return
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * this method get gender
	 * @return
	 */
	public String getGender()
	{
		return gender;
	}
	/**
	 * this method get habitat
	 * @return
	 */
	public String getHabitat()
	{
		return habitat;
	}
	/**
	 * this method get speed
	 * @return
	 */
	public float getSpeed()
	{
		return speed;
	}
	/**
	 * this method set type
	 * @param type
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	/**
	 * this method set name
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * this method set age
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	/**
	 * this method set gender
	 * @param gender
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	/**
	 * this method set habitat
	 * @param habitat
	 */
	public void setHabitat(String habitat)
	{
		this.habitat = habitat;
	}
	/**
	 * this method set speed
	 * @param speed
	 */
	public void setSpeed(float speed)
	{
		this.speed = speed;
	}
	
	/**
	 * return all types to string
	 */
	@Override
	public String toString()
	{
		String temp = "";
		temp += "- Type: " + this.getType() + "\n";
		temp += "- Name: " + this.getName() + "\n";
		temp += "- age: " + this.getAge() + "\n";
		temp += "- Gender: " + this.getGender() + "\n";
		temp += "- Habitat: " + this.getHabitat() + "\n";
		temp += "- Speed: " + this.getSpeed() + "\n";
		return temp;
	}
}
