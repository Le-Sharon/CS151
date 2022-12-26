/**
 * This is a tester class for employee
 * @author Sharon Le
 * @version 1.0
 * @since 8/26/2022
 */
public class EmployeeTest {
	public static void main (String[] args)
	{
		Employee joe = new Employee("Joe", "Smith", 10, 10000, "something street", "male", 150, "10000", "contractor", 80000);
		joe.introduce();
		String intro1 = joe.first + " " + joe.last + ", pay is $" + joe.pay;
		double time1 = 30;
		if (joe.getStatus() == "full time")
		{
			intro1 += "/yr, should get paid $" + joe.calculatePay(time1) + " for working " + time1 + " weeks, other details are up to you." ;
		}
		if (joe.getStatus() == "part time" || joe.getStatus() == "contractor" || joe.getStatus() == "contractor employee")
		{
			intro1 += "/hr, should get paid $" + joe.calculatePay(time1) + " for working " + time1 + " hours, other details are up to you." ;
		}
		System.out.println(intro1);
	}
}
