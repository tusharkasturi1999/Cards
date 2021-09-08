package com.bridgelabz.card;

/**
 * @author tushar.kasturi_ymedi
 * This class consist of cards class
 */
public class Card {

	/**
	 * This method deines the deck of cards
	 * @param suits defines the suits
	 * @param ranks defines the ranks
	 * @param deck its a integer array of deck
	 */
	public void defineCards(){
	int[] deck = new int[52];
	String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	}

	//This is the main class
	public static void main(String[] args) {
		System.out.println("Welcome to Card Game");
	}
}
