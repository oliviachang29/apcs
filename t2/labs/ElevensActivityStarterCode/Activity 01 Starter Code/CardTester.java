/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card jackOfSpades = new Card("jack", "spades", 11);
		System.out.println(jackOfSpades);
		Card aceOfDiamonds = new Card("ace", "diamonds", 1);
		System.out.println(aceOfDiamonds);
		if (jackOfSpades.matches(aceOfDiamonds)) {
			System.out.println("They match!");
		} else {
			System.out.println("They don't match.");
		}
		Card tenOfHearts = new Card("ten", "hearts", 10);
		System.out.println(tenOfHearts);
	}
}
