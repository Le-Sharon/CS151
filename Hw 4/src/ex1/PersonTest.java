package ex1;
/**
 * Tester class for person
 * @author Sharon Le
 * @since 10/24/22
 * @version 1.0
 * @source https://www.baeldung.com/java-8-comparator-comparing
 */
import java.util.*;
public class PersonTest {
	public static void main (String [] args)
	{
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Joe", "Smith", 40));
		people.add(new Person("Amy", "Gold", 32));
		people.add(new Person("Tony", "Stork", 21));
		people.add(new Person("Sean", "Irish", 24));
		people.add(new Person("Tina", "Brocks", 28));
		people.add(new Person("Lenny", "Hep", 18));
			
		// ascending 
		String[] test = {"first", "last", "age"};
		for (int x = 0; x < test.length; x++)
		{
				switch (test[x])
				{
				default : break;
				case "first" : 
					System.out.println("Sorting by First Name");
					Collections.sort(people, Comparator.comparing(Person::getFirst));
					System.out.println(people.toString() + "\n");
					break;
				case "last" : 
					System.out.println("Sorting by Last Name");
					Collections.sort(people, new Comparator<Person>() {
						@Override
						public int compare(Person s1, Person s2)
						{	
							return Integer.compare(s1.getLast().length(), s2.getLast().length());
						}
						});
					//Collections.sort(people, Comparator.comparing(Person::getLast));
					System.out.println(people.toString() + "\n");
					break;
				case "age" : 
					System.out.println("Sorting by Age");
					Collections.sort(people, Comparator.comparing(Person::getAge));
					System.out.println(people.toString() + "\n");
					break;
				}
		}
		// descending
		for (int x = 0; x < test.length; x++)
		{
				switch (test[x])
				{
				default : break;
				case "first" : 
					System.out.println("Sorting by First Name Reversed");
					Collections.sort(people, Comparator.comparing(Person::getFirst).reversed());
					System.out.println(people.toString() + "\n");
					break;
				case "last" : 
					System.out.println("Sorting by Last Name Reversed");
					Collections.sort(people, new Comparator<Person>() {
						@Override
						public int compare(Person s1, Person s2)
						{	
							return Integer.compare(s1.getLast().length(), s2.getLast().length());
						}
						});
					Collections.reverse(people);
					//Collections.sort(people, Comparator.comparing(Person::getLast).reversed());
					System.out.println(people.toString() + "\n");
					break;
				case "age" : 
					System.out.println("Sorting by Age Reversed");
					Collections.sort(people, Comparator.comparing(Person::getAge).reversed());
					System.out.println(people.toString() + "\n");
					break;
				}
			}
		}
}
