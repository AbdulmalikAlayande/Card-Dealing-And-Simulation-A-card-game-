package CardDealingAndSimulation;

public class Card {
	private Face cardFace;
	private String suit;
	
	public Card( Face cardFace, String suit){
		this.cardFace = cardFace;
		this.suit = suit;
	}
	
	public Face getCardFace() {
		return cardFace;
	}
	
	public void setCardFace(Face cardFace) {
		this.cardFace = cardFace;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String toString(){
		return getCardFace() + " of " + getSuit();
	 }
}
