/**
 * This is a tester class for to test for correct functionality of all animal type classes
 * @author Sharon Le
 * @version 1.0
 * @since 8/26/2022
 */
public class AnimalTest {

	public static void main (String[] args)
	{
		Cat kitty = new Cat("Elysia", "Cat", 4, "Female", "House", (float)2.5);
		Dog doggy = new Dog("Cyno", "Dog", 5, "Male", "House", (float)1.9);
		Racoon racooni = new Racoon("Ambair", "Racoon", 7, "Male", "Forest", (float)0.5);
		Whale whaley = new Whale("Poseidon", "Whale", 50, "Male", "Ocean", (float)0.1);
		
		//this sections test cat
		System.out.println(kitty.toString());
		kitty.walk();
		kitty.greetHuman();
		kitty.move();
		kitty.sound();
		kitty.eat();
		kitty.sleep();
		kitty.scratch();
		
		//this sections test dog
		System.out.println(doggy.toString());
		doggy.walk();
		doggy.greetHuman();
		doggy.move();
		doggy.sound();
		doggy.eat();
		doggy.sleep();
		doggy.bark();
		
		//this section test racoon
		System.out.println(racooni.toString());
		racooni.move();
		racooni.sound();
		racooni.eat();
		racooni.sleep();
		racooni.scratch();
		
		
		//this section test whale
		System.out.println(whaley.toString());
		whaley.move();
		whaley.sound();
		whaley.eat();
		whaley.sleep();
		whaley.swim();
	}
}
