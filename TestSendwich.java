
public class TestSendwich 
{
	public static void main (String [] args)
	{
		Sandwich sandwich = new Sandwich();
		sandwich.setBreadType("wheat");
		sandwich.setMainIngredient("tuna");
		sandwich.setPrice(10);
		
		System.out.println(sandwich.getBreadType());
		System.out.println(sandwich.getMainIngredient());
		System.out.println("$" +sandwich.getPrice());
	}

}
