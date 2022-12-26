/**
 * This is a class for type dog animals inheriting parent class animal
 * all basic functionality of printing to console available actions
 * @author Sharon Le
 * @version 1.0
 * @since 8/26/2022
 */
public class Dog extends Animal implements Domesticated{
	/**
	 * this constructor will get all attributes given
	 * @param type of dog
	 * @param name of dog
	 * @param age of dog
	 * @param gender of dog
	 * @param habitat of dog
	 * @param speed of dog
	 */
	public Dog(String type, String name, int age, String gender, String habitat, float speed)
	{
		super(type, name, age, gender, habitat, speed);
	}
	/**
	 * this methods will print to console the action of walking
	 */
	public void walk()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " walked around the yard.\n");
	}
	/**
	 * this method will print to console the action of greeting
	 */
	public void greetHuman()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " greeted you with its paw.\n");
	}
	/**
	 * this method will print to console the action of moving
	 */
	public void move()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " moved in your yard.\n");
	}
	/**
	 * this method will print ot console the action of the sound of the animal
	 */
	public void sound()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " woof !\n");
	}
	/**
	 * this method will print to console the action of eating
	 */
	public void eat()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " ate dog food.\n");
	}
	/**
	 * this method will print to console the action of sleeping
	 */
	public void sleep()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " slept on your bed.\n");
	}
	/**
	 * this method will print to console the action of barking
	 */
	public void bark()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " barked.\n");
	}
}
