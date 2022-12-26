package hw3;
/**
 * This is the class for students that hold all elements and deep clones
 * @author Sharon Le
 * @since 10/10/22
 * @version 1.0
 */
public class Student implements Cloneable{
	String fname;
	String lname;
	int age;
	float gpa;
	String major;
	String dept;
	Course course;
	/**
	 * counstructor of class
	 * @param fname
	 * @param lname
	 * @param age
	 * @param gpa
	 * @param dept
	 * @param course
	 */
	public Student(String fname,String lname,int age,float gpa, String major, String dept, Course course)
	{
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.dept = dept;
		this.course = course;
	}
	/**
	 * Constructor for shallow copy
	 * @param student
	 */
	public Student (Student student)
	{
		super ();
	}
	/**
	 * this method return input for string
	 * @return name
	 */
	public String getFirst() {	return fname;}
	/**
	 * this method return input for string
	 * @return name
	 */
	public String getLast() {	return lname;}
	/**
	 * this method return input for int
	 * @return name
	 */
	public int getAge() {	return age;}
	/**
	 * this method return input for float
	 * @return name
	 */
	public float getGPA() {	  return gpa;}
	/**
	 * this method return input for string
	 * @return name
	 */
	public String getDept() {	return dept;}
	/**
	 * this method return input for course
	 * @return name
	 */
	public Course getCourse() {	  return course;}
	/**
	 * this method return input for string
	 * @return name
	 */
	public String getMajor() {	return major;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setFirst(String fname) {	this.fname = fname;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setLast(String lname) {	this.lname = lname;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setAge(int age) {	this.age = age;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setGPA(float gpa) {	  this.gpa = gpa;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setDept(String dept) {	this.dept = dept;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setCourse(Course course) {	  this.course = course;}
	/**
	 * this method replace element with new
	 * @param
	 */
	public void setMajor(String major) {	this.major = major;}
	/**
	 * Imeplement method to use deep copy 
	 */
	public Object clone() throws CloneNotSupportedException
	{
		Student person = (Student) super.clone();
		person.course = (Course)course.clone();
		return person;
	}
	/**
	 * this method prints out elements to console
	 */
	public void printInfo()
	{
		String temp = "First Name :" + this.getFirst() + "\n";
		temp += "Last Name :" + this.getLast() + "\n";
		temp += "Age :" + this.getAge() + "\n";
		temp += "GPA :" + this.getGPA() + "\n";
		temp += "Department :" + this.getDept() + "\n";
		temp += this.getCourse() + "\n";
		System.out.println(temp);
	}
}