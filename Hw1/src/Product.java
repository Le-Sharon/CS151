
public final class Product {
	final String name;
	final String description;
	final double price;
	final int quantity;
	/**
	 * this constructors receives all attributes givens to product
	 * @param name
	 * @param description
	 * @param price
	 * @param quantity
	 */
	public Product(String name, String description, double price, int quantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	/**
	 * return all types to string
	 */
	@Override
	public String toString()
	{
		String temp = "";
		temp += "- Product Name: " + this.getName() + "\n";
		temp += "- Product Description: " + this.getDescription() + "\n";
		temp += "- Product Price: " + this.getPrice() + "\n";
		temp += "- Product Quantity: " + this.getQuantity() + "\n";
		return temp;
	}
	
}
