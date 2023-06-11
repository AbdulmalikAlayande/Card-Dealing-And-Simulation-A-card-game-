package CardDealingAndSimulation;

import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards {
	private static final int NUMBER_OF_CARDS = 52;
	private static final Card[] deck = new Card[NUMBER_OF_CARDS];
	private int currentCard;
	private final SecureRandom random = new SecureRandom();
	
	public DeckOfCards(){
		Face[] face = {Face.ACE, Face.DEUCE, Face.THREE, Face.FOUR, Face.FIVE, Face.SIX, Face.SEVEN, Face.EIGHT,
				Face.NINE, Face.TEN, Face.JACK, Face.KING, Face.QUEEN};
		String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		for (int i = 0; i < deck.length; i++) {
			deck[i] = new Card(face[i % 13], suit[i/13]);
		}
	}
	
	public void shuffle(){
		for (int firstCard = 0; firstCard < deck.length; firstCard++) {
			int secondCard = random.nextInt(52);
			
			Card temporaryCard = deck[firstCard];
			deck[firstCard] = deck[secondCard];
			deck[secondCard] = temporaryCard;
		}
	}
	
	public Card dealCard(){
		if (currentCard < deck.length) {
			return deck[currentCard++];
		}
		return null;
	}
	
	public void determineWhetherAHandContainsAPair(Card[] player1){
		boolean isPairOccurred = false;
		for (int i = 0; i < player1.length; i++) {
			for (int j = i+1; j < player1.length; j++) {
				isPairOccurred = player1[i].getCardFace() == player1[j].getCardFace();
				if (isPairOccurred)
					System.out.println("A pair occurred with the cards at indices "+ i + " and " + j);
			}
		}
		if (!isPairOccurred)
			System.out.println("No pair occurred");
	}
	
	public void determineWhetherAHandContainsTwoPairs(Card[] player1){
		int[] emptyList1 = new int[2];
		int[] emptyList2 = new int[2];
		for (int i = 0; i < player1.length; i++) {
			for (int j = i+1; j < player1.length; j++) {
				if (player1[i].getCardFace() == player1[j].getCardFace()){
					emptyList1[0] = i;   emptyList1[1] = j;
				}
				emptyList2[0] = i;   emptyList2[1] = j;
			}
		}
		System.out.println(Arrays.toString(emptyList1));
		System.out.println(Arrays.toString(emptyList2)+ "\n");
	}
	public void determineWhetherAHandContainsThreeOfAKind(){
		
	}
	public void determineWhetherAHandContainsFourOfAKind(){
	
	}
	public void determineWhetherAHandContainsAFlush(){
		
	}
	public void determineWhetherAHandContainsAFullHouse(){
	
	}
	public void determineWhetherAHandContainsAStraight(){
	
	}
}
//, Card[] player2, Card[] player3, Card[] player4