package CardDealingAndSimulation;

import java.util.Arrays;

public class CardDealing {
	
	private static final Card[] player1 = new Card[5];
	private static final Card[] player2 = new Card[5];
	private static final Card[] player3 = new Card[5];
	private static final Card[] player4 = new Card[5];
	
	static DeckOfCards card = new DeckOfCards();
	
	public static void main(String[] args) {
		dealCardToPlayers(player1);
		card.determineWhetherAHandContainsAPair(player1);
		card.determineWhetherAHandContainsTwoPairs(player1);
		dealCardToPlayers(player2);
		card.determineWhetherAHandContainsAPair(player2);
		card.determineWhetherAHandContainsTwoPairs(player2);
		dealCardToPlayers(player3);
		card.determineWhetherAHandContainsAPair(player3);
		card.determineWhetherAHandContainsTwoPairs(player3);
		dealCardToPlayers(player4);
		card.determineWhetherAHandContainsAPair(player4);
		card.determineWhetherAHandContainsTwoPairs(player4);
		
		
	}
	public static void dealCardToPlayers(Card[] player){
		card.shuffle();
		for (int i = 0; i < 5; i++) {
			player[i] = card.dealCard();
		}
		System.out.println(Arrays.toString(player));
	}
}