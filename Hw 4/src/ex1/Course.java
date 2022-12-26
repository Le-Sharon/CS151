package ex1;
/**
 * This class hold all elements for course
 * @author Sharon Le
 * @since 10/21/22
 * @version 1.0
 *
 */
public class Course {
	String name;
	String desc;
	String dept;
	String time;
	String weekday;
	
	/**
	 * counstructor
	 * @param name
	 * @param desc
	 * @param dept
	 * @param time
	 * @param weekday
	 */
	public Course(String name, String desc, String dept, String time, String weekday) {
		super();
		this.name = name;
		this.desc = desc;
		this.dept = dept;
		this.time = time;
		this.weekday = weekday;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the weekday
	 */
	public String getWeekday() {
		return weekday;
	}
	/**
	 * @param weekday the weekday to set
	 */
	public void setWeekday(String weekday) {
		this.weekday = weekday;
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
		temp += "Weekdays :" + this.getWeekday();
		return temp;
	}
	
}
