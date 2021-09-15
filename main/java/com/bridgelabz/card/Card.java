package com.bridgelabz.card;

/**
 * @author tushar.kasturi_ymedi This class consist of Card class
 * @param suits This defines the suits
 * @param ranks This defines the ranks
 * @param deck  This is a integer array of deck
 * @param cardCount This keeps the count of cards in the deck
 */
public class Card {
    private final String rank;
	private final String suit;
	/**
	* Constructs a card of the given rank and suit.
	*/
	public Card(String suit, String rank) 
	{
	    this.suit = suit;
	    this.rank = rank;
	}
	/**
	* Gets the card's rank.
	*/
	public String getRank() 
	{
	    return this.rank;
	}
	/**
	* Gets the card's suit.
	*/
	public String getSuit() 
	{
	    return this.suit;
	}	    
}