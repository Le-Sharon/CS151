/**
 * This is a class for type racoon animals inheriting parent class animal
 * all basic functionality of printing to console available actions
 * @author Sharon Le
 * @version 1.0
 * @since 8/26/2022
 */
public class Racoon extends Animal implements Scratcher{
	/**
	 * this constructor will get all attributes given
	 * @param type of racoon
	 * @param name of racoon
	 * @param age of racoon
	 * @param gender of racoon
	 * @param habitat of racoon
	 * @param speed of racoon
	 */
	public Racoon(String type, String name, int age, String gender, String habitat, float speed)
	{
		super(type, name, age, gender, habitat, speed);
	}
	/**
	 * this method will print to console the action of moving
	 */
	public void move()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " moved in the bushes.\n");
	}
	/**
	 * this method will print ot console the action of the sound of the animal
	 */
	public void sound()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " screammmeeedddd ~\n");
	}
	/**
	 * this method will print to console the action of eating
	 */
	public void eat()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " ate your trash.\n");
	}
	/**
	 * this method will print to console the action of sleeping
	 */
	public void sleep()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " slept in your closet.\n");
	}
	/**
	 * this method will print to console the action of scratching
	 */
	public void scratch()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " scratches the trash bin.\n");
	}
}
