package com.bridgelabz.card;

import java.util.*;

/**
 * @author tushar.kasturi_ymedi
 *
 */
public class Deck {
	private ArrayList<Card> cards;
	/**
	 * Constructs a standard deck of 52 cards.
	 */
	private static final String[] RANKS = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };
	private static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

	public Deck() {
		this.cards = new ArrayList<Card>(52);
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 0; rank < 13; rank++) {
				this.cards.add(new Card(SUITS[suit], RANKS[rank]));
			}
		}
	}

	/**
	 * Method to shuffle the 52 cards
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}

	/**
	 * getter method to return cards
	 * 
	 * @return arraylist cards
	 */
	public ArrayList<Card> getCards() {
		return cards;
	}
}
