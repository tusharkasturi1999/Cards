package com.bridgelabz.card;

import java.util.*;

/**
 * class to store the number of players and their cards
 * @author tushar.kasturi_ymedi
 */
class individualPlayer {
	/**
	 * individualPlayer is each player with 9 cards
	 */
	public individualPlayer() {
		ArrayList<Card> individualPlayer = new ArrayList<Card>(9);
	}
}

public class Player {
	/**
	 * constructor to initialize the players
	 * 
	 * @param n number of players
	 */
	private static int noOfPlayers;

	public Player(int noOfPlayers) {
		Deck cards = new Deck();
		// players contain 9 cards of individual player
		ArrayList<individualPlayer> players = new ArrayList<individualPlayer>(noOfPlayers);
	}
	
    /**
     * Method to sequence the players order
     */
    public void orderPlayer()
    {
       ArrayList<Integer> sequencePlayer=new ArrayList<Integer>(noOfPlayers);
       for(int i=0;i<noOfPlayers;i++)
           sequencePlayer.add(i);
       Collections.shuffle(sequencePlayer);
    }

}