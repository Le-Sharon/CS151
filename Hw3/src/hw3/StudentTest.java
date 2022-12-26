package hw3;
/**
 * this is the tester class for Students
 * @author Sharon Le
 * @since 10/10/22
 * @version 1.0
 * Source: https://www.baeldung.com/java-deep-copy
 */
public class StudentTest {
	
	public static void main (String [] args) throws CloneNotSupportedException 
	{
		
		Course mycourse =  new Course("CS151", "Study of Science", "Object Oriented Design and Programming, CS", "6:00AM", "Tuesday");
		Student mine = new Student("John", "Smith", 20, (float)3.6, "Computer Science Major" ,"School of Computer Science department", mycourse);
		Student deepcopy =(Student) mine.clone();
		Student shallow = new Student(mine.getFirst(), mine.getLast(), mine.getAge(), mine.getGPA(), mine.getMajor(), mine.getDept(), mine.getCourse());
		//deep copy
		mycourse.setName("Psychology");
		mine.printInfo();
		deepcopy.printInfo();
		//shallow
		shallow.printInfo();
		
	}
	
}

