/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		// String ranks [] = {"A", "B", "C"};
		// String suits [] = {"Giraffes", "Lions"};
		// int values [] = {2,1,6};

		// Deck myDeck = new Deck(ranks, suits, values);
		// System.out.println(myDeck);

		String ranks2 [] = {"ace", "king", "queen", "jack", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two"};
		String suits2 [] = {"spades", "hearts", "diamonds", "clubs"};
		int values2 [] = {11, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2};

		Deck fiftyTwo = new Deck(ranks2, suits2, values2);
		System.out.println(fiftyTwo);
	}
}
