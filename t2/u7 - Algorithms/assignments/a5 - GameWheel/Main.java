import java.util.*;

public class Main {

	public static boolean alreadyLandedOn (ArrayList <PrizeCard> cards, PrizeCard newCard) {
		for (PrizeCard p: cards) {
			if (p.getID() == newCard.getID())
				return true;
		}
		return false;
	}

	public static int totalPrizeAmount(ArrayList <PrizeCard> cards) {
		int total = 0;
		for (PrizeCard p: cards) {
			total += p.getPrizeAmount();
		}
		return total;
	}

	public static void printCards(ArrayList <PrizeCard> cards) {
		for (PrizeCard p: cards) {
			System.out.println(p);
		}
	}

	public static void main (String[] args) {
		ArrayList <PrizeCard> player1Cards = new ArrayList <PrizeCard> ();
		ArrayList <PrizeCard> player2Cards = new ArrayList <PrizeCard> ();

		GameWheel g = new GameWheel();

		// Player 1
		int c1 = 0;
		while (c1 != 5) {
			PrizeCard temp = g.spinWheel();
			if (!alreadyLandedOn(player1Cards, temp)) {
				player1Cards.add(temp);
				c1++;
			}
			
		}

		// Player 2
		int c2 = 0;
		while (c2 != 5) {
			PrizeCard temp2 = g.spinWheel();
			if (!alreadyLandedOn(player2Cards, temp2)) {
				player2Cards.add(temp2);
				c2++;
			}
			
		}

		int player1TotalPrizeAmount = totalPrizeAmount(player1Cards);
		int player2TotalPrizeAmount = totalPrizeAmount(player2Cards);

		System.out.println("Player 1 Total: $" + player1TotalPrizeAmount);
		printCards(player1Cards);
		System.out.println("\nPlayer 2 Total: $" + player2TotalPrizeAmount);
		printCards(player2Cards);
		System.out.println("");

		if (player1TotalPrizeAmount == player2TotalPrizeAmount) {
			System.out.println("It's a tie!");
		} else if (player1TotalPrizeAmount > player2TotalPrizeAmount) {
			System.out.println("Player 1 won by $" + (player1TotalPrizeAmount - player2TotalPrizeAmount) + "!");
		} else if (player1TotalPrizeAmount < player2TotalPrizeAmount) {
			System.out.println("Player 2 won by $" + (player2TotalPrizeAmount - player1TotalPrizeAmount) + "!");
		}
	}
}
