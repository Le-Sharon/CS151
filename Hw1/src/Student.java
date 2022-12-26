
/**
 * 
 * @author Sharon Le
 * @version 1.0
 * @since 8/24/2022
 * Source: https://examples.javacodegeeks.com/how-to-call-a-method-in-java/#:~:text=To%20call%20a%20method%20in%20Java%2C%20write%20the%20method%27s%20name,transferred%20to%20the%20called%20method.&text=You%20have%20called%20me!,-My%20name%20isSource: https://examples.javacodegeeks.com/how-to-call-a-method-in-java/#:~:text=To%20call%20a%20method%20in%20Java%2C%20write%20the%20method%27s%20name,transferred%20to%20the%20called%20method.&text=You%20have%20called%20me!,-My%20name%20is
 * 
 * This class is a introductory review of previous knowledge of java, using
 * constructor creation and utilizing simple setters and getters methods.
 */
public class Student 
{
	String first;
	String last;
	int age;
	String major;
	String department;
	float gpa;
	/**
	 * This constructor gets all values given for students
	 * @param first
	 * @param last
	 * @param age
	 * @param major
	 * @param department
	 * @param gpa
	 */
	public Student(String first, String last, int age, String major, String department, float gpa)
	{
		this.first = first;
		this.last = last;
		this.age = age;
		this.major = major;
		this.department = department;
	}

	/**
	 * This method return name
	 * @return first variable 
	 */
	public String getName()
	{
		return first;
	}
	 
	/**
	 * This method return last name
	 * @return last variable
	 */
		public String getLast()
	{
			return last;
	}
	/**
	 * This method return age
	 * @return age variable
	*/
		public int getAge()
	{
			return age;
	}
	/**
	* This method return major
	* @return major variable 
	*/
		public String getMajor()
	{
			return major;
	}
	/**
	* This method return gpa
	* @return gpa variable 
	*/
	public float getGPA()
	{
		return gpa;
	}
	public String getDepartment ()
	{
		return department;
	}
//these are setter methods that changes the initial values

	
	/**
	 * this method changes the values in variable first
	 * @param name 
	 */
	public void changeName(String name)
	{
		this.first = name;
	}
	/**
	 * this method changes the values in variable last
	 * @param last
	 */
	public void changeLast(String last)
	{
		this.last = last;
	}
	/**
	 * this method changes the values in variable age
	 * @param age
	 */
	public void changeAge(int age)
	{
		this.age = age;
	}
	/**
	 * this method changes the values in variable major
	 * @param major
	 */
	public void changeMajor(String major)
	{
		this.major = major;
	}
	/**\
	 * 
	 * this method change department with new department
	 * @param department
	 */
	public void changeDepartment(String department)
	{
		this.department =  department;
	}
	/**
	 * this method changes the values in variable gpa
	 * @param gpa
	 */
	public void changeGPA(float gpa)
	{
		this.gpa = gpa;
	}
	//another class
	public class Course
	{
		/**
		 * this method print schedules to console
		 */
		public void printSchedule()
		{
			System.out.println("CS146 Mon/Wed 12:00 - 1:15");
			System.out.println("Math 161A Mon/Wed 3:00 - 4:15");
			System.out.println("CS 151 Mon/wed 6:00 - 7:15");
		}
	}
	
}
