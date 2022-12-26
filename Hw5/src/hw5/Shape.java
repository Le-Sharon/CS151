package hw5;
/**
 * This is the parent class for all the shapes, provide basic framcework
 * and provide concurrent executions of commands using threads
 * @author Sharon Le
 * @since 11/10/22
 * Source : https://www.w3schools.com/java/java_threads.asp
 */
public abstract class Shape extends Thread {
	//basic constructor
	public Shape() {}
	/**
	 * this method runs threads concurrently
	 */
	public void run()
	{
		try { compute(); }
		catch (Exception e) { System.out.println(e); }
	}
	
	/**
	 * this method is a placeholder, will be filled using inheritance
	 * @return 
	 */
	public double computeArea() { return 0;}
	/**
	 * this method is a placeholder for sychronization, will be filled later
	 */
	public void compute() {};
	
}
