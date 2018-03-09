import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner3
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie3 maggie = new Magpie3();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		// maggie.findKeyword("She's my sister", "sister", 0);
		// maggie.findKeyword("Brother Tom is helpful", "brother", 0);
		// maggie.findKeyword("I can't catch wild cats.", "cat", 0);
		// maggie.findKeyword("I know nothing about snow plows.", "no", 0); 
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
