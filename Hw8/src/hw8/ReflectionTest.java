package hw8;
import java.lang.reflect.*;
/**
 * This class tests the reflection API
 * @author Sharon Le
 * @version 1.0
 * @date 12/9/22
 * @Source : lecture slide by prof. Yulia Newton
 */
public class ReflectionTest {

	public static void main (String []  args)
	{
		Method[] personMethod = Person.class.getDeclaredMethods();
		
		System.out.println("All Methods from Person class :\n");
		for (int x = 0; x < personMethod.length; x++) {
			System.out.print(personMethod[x].getName() + " --> ");
			System.out.print("Parameter Count = " + personMethod[x].getParameterCount() + " ");
			Class[] paramType = personMethod[x].getParameterTypes();
			if (paramType.length != 0)
			{
				System.out.print(" : ");
				for (Class c : paramType)
				{
					System.out.print("( " + c.getName() + " ) "); // param type
				}
				System.out.println("");
			}
			else 
			{
				System.out.print("\n");
			}
		
		}
		// MOVING ON TO ADDRESS CLASS
			
		Method[] adMethod = Address.class.getDeclaredMethods();
		
		System.out.println("All Methods from Address class :\n");
		for (int x = 0; x < personMethod.length; x++) {
			System.out.print(personMethod[x].getName() + " --> ");
			System.out.print("Parameter Count = " + personMethod[x].getParameterCount() + " ");
			Class[] paramType2 = personMethod[x].getParameterTypes();
			if (paramType2.length != 0)
			{
				System.out.print(" : ");
				for (Class c : paramType2)
				{
					System.out.print("( " + c.getName() + " )"); // param type
				}
					System.out.println("");
				}
				else 
				{
					System.out.print("\n");
				}
		}
		
		Field[] fields = Address.class.getDeclaredFields();
		System.out.println("\nAll class field of Address class : ");
		for (Field n : fields)
		{
			System.out.println(n.getName() + " --> " + n.toString());
		}
		
		
		
		// Instatiating
		try {
			
			Person p1 = new Person();
			Person p2 = new Person();
			Person p3 = new Person();
			Class person = Class.forName("Person");
			Class address = Class.forName("Address");
			Method setFirstNameM = person.getDeclaredMethod("setFirstName", String.class);
			Method setLastNameM = person.getDeclaredMethod("setLastName", String.class);
			Method setAgeM = person.getDeclaredMethod("setAge", int.class);
			// iNVOKING
			setFirstNameM.invoke(p1, "Hex");
			setLastNameM.invoke(p1, "Haywire");
			setAgeM.invoke(p1, 25);
			
			setFirstNameM.invoke(p2, "Doppio");
			setLastNameM.invoke(p2, "DropScythe");
			setAgeM.invoke(p2, 22);
			
			setFirstNameM.invoke(p3, "Ver");
			setLastNameM.invoke(p3, "Vermillion");
			setAgeM.invoke(p3, 20);
			
			System.out.println(person.getName());
			System.out.println(address.getName());
		}
		catch ( Exception e)
		{
			System.out.println("Warning: Problem invoking method");
		}
	}
}
