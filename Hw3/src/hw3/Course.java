package hw3;
/**
 * 
 * @author Sharon Le
 * @since 10/10/2022
 * @version 1.0
 */
public class Course implements Cloneable{
	String name;
	String desc;
	String dept;
	String time;
	String weekday;
	/**
	 * this is the constructor
	 * @param name course
	 * @param desc description
	 * @param dept department
	 * @param time
	 * @param weekday
	 */
	public Course(String name, String desc, String dept, String time, String weekday)
	{
		this.name = name;
		this.desc = desc;
		this.dept = dept;
		this.time = time;
		this.weekday = weekday;
	}
	public Course(Course course)
	{
		super();
	}
	/**
	 * this method return input for string
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * this method return input for string
	 * @return desc
	 */
	public String getDesc()
	{
		return desc;
		
	}
	/**
	 * this method return input for string
	 * @return dept
	 */
	public String getDept()
	{
		return dept;
	}
	/**
	 * this method return input for string
	 * @return time
	 */
	public String getTime()
	{
		return time;
	}
	/**
	 * this method return input for string
	 * @return weekday
	 */
	public String getWeekDay()
	{
		return weekday;
	}
	//setters
	/**
	 * this method set variable
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * this method set variable
	 * @param name
	 */
	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	/**
	 * this method set variable
	 * @param name
	 */
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	/**
	 * this method set variable
	 * @param name
	 */
	public void setTime(String time)
	{
		this.time = time;
	}
	/**
	 * this method set variable
	 * @param name
	 */
	public void setWeekDay(String weekday)
	{
		this.weekday = weekday;
	}
	/**
	 * cloning methodfor deep copy
	 */
	public Object clone() throws CloneNotSupportedException
	{
		Course courses = (Course) super.clone();
		return courses;
	}
	
	/**
	 * To string method
	 * @return Strings of all elements
	 */
	@Override
	public String toString ()
	{
		String temp = "Course name :" + this.getName() + "\n";
		temp += "Description :" + this.getDesc() + "\n";
		temp += "Department :" + this.getDept() + "\n";
		temp += "Time :" + this.getTime() + "\n";
		temp += "Weekdays :" + this.getWeekDay();
		return temp;
	}
}