package ex1;
/**
 * this class has all elements for students and can sort student course
 * @author sharon Le
 * @since 10/24/22
 * @version 1.0
 */
import java.util.*;

public class Student {
	String first;
	String last;
	int age;
	float gpa;
	String major;
	String dept;
	LinkedList course = new LinkedList<Course>();
	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
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
	 * This is the constructor
	 * @param first
	 * @param last
	 * @param age
	 * @param gpa
	 * @param course
	 */
	public Student(String first, String last, int age, float gpa, LinkedList course, String Major, String dept) {
		super();
		this.first = first;
		this.last = last;
		this.age = age;
		this.gpa = gpa;
		this.course = course;
		this.major = major;
		this.dept = dept;
	}
	
	public void addCourse(Course courses)
	{
		//avoid dups
		if(!this.course.contains(course)) {
			this.course.add(course);
		}
	}
	
	public void removeCourse(Course course)
	{
		//avoid null
		if(this.course.contains(course)) {
			this.course.remove(course);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void sortCourse(boolean ascending, String method)
	{
		
		Collections.sort(this.course, new Comparator<Course>()
		{
			@Override
			public int compare(Course s1, Course s2)
			{	
				switch (method)
				{
				default : return s1.getName().compareTo(s2.getName());
				case "name" : return s1.getName().compareTo(s2.getName()); 
				case "description" : return s1.getDesc().compareTo(s2.getDesc());
				case "department" : return s1.getDept().compareTo(s2.getDept());
				case "time" : return s1.getTime().compareTo(s2.getTime());
				case "weekday" : return s1.getWeekday().compareTo(s2.getWeekday());
				}
				
			}}
		);
		//reverses
		if (!ascending)
		{
			Collections.reverse(course);
		}
		
		for (int x = 0; x < course.size(); x++)
			System.out.println(course.get(x).toString() + "\n");
		
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
	 * @return the gpa
	 */
	public float getGpa() {
		return gpa;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	/**
	 * @return the course
	 */
	public LinkedList getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(LinkedList course) {
		this.course = course;
	}

	/**
	 * To string method
	 * @return Strings of all elements
	 */
	@Override
	public String toString ()
	{
		return course.toString() + "\n First name:" + getFirst() + "\n Last name:" + getLast() + "\n gpa:" + getGpa() + "\n Age:" + getAge() + "\n major:" + getMajor()+ "\n Department:" + getDept(); 
		
	}
	//tester
	public static void main (String[] args)
	{
		
		LinkedList myCourse = new LinkedList<Course>();
		myCourse.add(new Course("Science", "science studies", "Science building", "10am - 11am", "Thursday"));
		myCourse.add(new Course("Art", "Art studies", "Art building", "2pm - 5am", "Monday"));
		myCourse.add(new Course("PE", "PE studies", "PE building", "8pm - 9am", "Tuesday"));
		Student myC = new Student ("helen", "Baker", 18, (float)(3.6), myCourse, "Computer Science", "Science department");
		System.out.println("Test name\n");
		myC.sortCourse(true, "name");
		System.out.println("Test descending\n");
		myC.sortCourse(false, "name");
	}
}
