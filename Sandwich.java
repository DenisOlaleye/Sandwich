

//Denis Olaleye
//21.09.22
/*
a.	Create a class named Sandwich. Data fields include a String for the main ingredient (such as tuna), a String for bread type (such as wheat), and a
double for price (such as 4.99). Include methods to get and set values for each of these fields. Save the class as Sandwich.java.

b.	Create an application named TestSandwich that instantiates one Sandwich object and demonstrates the use of the set and get methods. Save this
application as TestSandwich.java.*/

public class Sandwich 
{
	private String mainIngredient;
	private String breadType;
	private double price;
	
	public String getMainIngredient()
	{
		return mainIngredient;
	}
	public void setMainIngredient(String ingredient)
	{
		mainIngredient = ingredient;
	}
	public String getBreadType()
	{
		return breadType;
	}
	public void setBreadType(String bread)
	{
		breadType = bread;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double sandwichPrice)
	{
		price = sandwichPrice; 
	}
}
