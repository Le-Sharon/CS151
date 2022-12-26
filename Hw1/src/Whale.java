/**
 * This is a class for type whale animals inheriting parent class animal
 * all basic functionality of printing to console available actions
 * @author Sharon Le
 * @version 1.0
 * @since 8/26/2022
 */
public class Whale extends Animal implements Swimmer{
	/**
	 * this constructor will get all attributes given
	 * @param type of whale
	 * @param name of whale
	 * @param age of whale
	 * @param gender of whale
	 * @param habitat of whale
	 * @param speed of whale
	 */
	public Whale(String type, String name, int age, String gender, String habitat, float speed)
	{
		super(type, name, age, gender, habitat, speed);
	}
	/**
	 * this method will print to console the action of moving
	 */
	public void move()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " move around in water.\n");
	}
	/**
	 * this method will print ot console the action of the sound of the animal
	 */
	public void sound()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " echoed location ~\n");
	}
	/**
	 * this method will print to console the action of eating
	 */
	public void eat()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " ate fish that swims right into its mouth.\n");
	}
	/**
	 * this method will print to console the action of sleeping
	 */
	public void sleep()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " slept with eyes open in the deep ocean.\n");
	}
	/**
	 * this method will print to console the action of swimming
	 */
	public void swim()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " swims around.\n");
	}
}
