package hw3;
/**
 * This class is tester for employee
 * @author Sharon Le
 *
 */
public class EmployeeTest {
	public static void main (String [] args) throws Exception
	{
		Employee john = new Employee("john", "Smith", "101", (float)35 );
		//test
		System.out.println("$" + john.calculatePay(40));
		System.out.println("$" + john.calculatePay(23));
		System.out.println("$" + john.calculatePay(1));
		System.out.println("$" + john.calculatePay(0));
		System.out.println("$" + john.calculatePay(-5));
		System.out.println("$" + john.calculatePay(45));
	}
}
