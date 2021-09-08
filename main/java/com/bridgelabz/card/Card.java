package com.bridgelabz.card;

/**
 * @author tushar.kasturi_ymedi This class consist of Card class
 * @param suits This defines the suits
 * @param ranks This defines the ranks
 * @param deck  This is a integer array of deck
 * @param cardCount This keeps the count of cards in the deck
 */
public class Card {

	private final String[] deck = new String[52];
	private final String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private final String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	private static int cardCount = 0;

	//This method assigns card to the deck
	public void initialize() {
		for (int sIndex = 0; sIndex < ranks.length; sIndex++) {
			for (int rIndex = 0; rIndex < suits.length; rIndex++) {
				deck[cardCount] = ranks[sIndex] + " of " + suits[rIndex];
				cardCount++;
			}
		}
	}

	// This is the main class
	public static void main(String[] args) {
		System.out.println("Welcome to Card Game");
		Card deck = new Card();
		deck.initialize();
	}
}
