package ex1;
/**
 * this class has all attributes for person type
 * @author Sharon Le
 * @Since 10/24/22
 * @version 1.0
 *
 */
public class Person {
	String first;
	String last;
	int age;
	/**
	 * @param first
	 * @param last
	 * @param age
	 */
	public Person(String first, String last, int age) {
		super();
		this.first = first;
		this.last = last;
		this.age = age;
	}
	/**
	 * @return the first
	 */
	public String getFirst() {
		return first;
	}
	/**
	 * @param first the first to set
	 */
	public void setFirst(String first) {
		this.first = first;
	}
	/**
	 * @return the last
	 */
	public String getLast() {
		return last;
	}
	/**
	 * @param last the last to set
	 */
	public void setLast(String last) {
		this.last = last;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * To string method
	 * @return Strings of all elements
	 */
	@Override
	public String toString ()
	{
		String temp = "First Name :" + this.getFirst() + "\n";
		temp += "Last Name :" + this.getLast() + "\n";
		temp += "Department :" + this.getAge() + "\n";
		return temp;
	}
}
