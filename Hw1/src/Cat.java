/**
 * This is a class for type cat animals inheriting parent class animal
 * all basic functionality of printing to console available actions
 * @author Sharon Le
 * @version 1.0
 * @since 8/26/2022
 */
public class Cat extends Animal implements Domesticated, Scratcher{
	/**
	 * this constructor will get all attributes given
	 * @param name of cat
	 * @param type of cat
	 * @param age of cat
	 * @param gender of cat
	 * @param habitat of cat
	 * @param speed of cat
	 */
	public Cat(String type, String name, int age, String gender, String habitat, float speed)
	{
		super(type, name, age, gender, habitat, speed);
	}
	/**
	 * this methods will print to console the action of walking
	 */
	public void walk()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " walked.\n");
	}
	/**
	 * this method will print to console the action of greeting
	 */
	public void greetHuman()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " greeted you.\n");
	}
	/**
	 * this method will print to console the action of moving
	 */
	public void move()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " moved on ground.\n");
	}
	/**
	 * this method will print ot console the action of the sound of the animal
	 */
	public void sound()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " meowed ~\n");
	}
	/**
	 * this method will print to console the action of eating
	 */
	public void eat()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " ate canned tuna.\n");
	}
	/**
	 * this method will print to console the action of sleeping
	 */
	public void sleep()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " slept on trees.\n");
	}
	/**
	 * this method will print to console the action of scratching
	 */
	public void scratch()
	{
		System.out.println(this.getName()+ " the " + this.getType() + " scratches your pants.\n");
	}
	
	
}
