public class StudentTest {
    public static void main(String[] args) throws Exception {
        Student testStudent = new Student("John", "Smith", 20, "Computer Science","School of Computer Science", (float) 3.6);
        Student.Course course = testStudent.new Course();
        course.printSchedule();
    }
}