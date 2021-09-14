package com.bridgelabz.card;

import java.util.*;
/**
 * class to store the number of players and their cards
 * @author tushar.kasturi_ymedi
 *
 */
class IndividualPlayer{
	
	private ArrayList<Card> individualPlayerCards;
	/**
     * Constructor to initialize cards for players
     */
    public IndividualPlayer()
    {
    	individualPlayerCards = new ArrayList<Card>(9); 
    } 
    /**
     * Gets the individualPlayer
     * @return the list containing cards
     */
    public List<Card> getIndividualPlayerCards()
    {
        return this.individualPlayerCards;
    }
    /**
     * to add a value to the individual Player's Cards
     * @param a card value
     */
    public void setIndividualPlayerCards(Card card)
    {
        this.individualPlayerCards.add(card);
    }
}

public class Player {
    /**
     * constructor to initialize the players
     * @param n number of players
     */
	private int n;
	private static ArrayList<IndividualPlayer> players;
	private ArrayList<Integer> sequencePlayer;
	private Deck deck;
    public Player(int n)
    {
    	this.n = n;
        deck = new Deck();
        players = new ArrayList<IndividualPlayer>(n);
        for(int i=0;i<n;i++)
            players.add(new IndividualPlayer());
    }
    
    /**
     * Method to sequence the players order
     */
    public void orderPlayer()
    {
       sequencePlayer=new ArrayList<Integer>(n);
       for(int i=0;i<n;i++)
           sequencePlayer.add(i);
       Collections.shuffle(sequencePlayer);
    }
    
    /**
     * This method Shuffles the card and 
     * distributes those card among players
     * 
     */
    public void cardDistribution()
    {
        deck.shuffle();
        //to remove the card which is already given to player
        ArrayList<Card> tempCards=deck.getCards();
        Random random = new Random();  
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<n;j++)
            {
               //to get the player according to sequence 
               IndividualPlayer IP = players.get(sequencePlayer.get(j));
               int x = random.nextInt(tempCards.size());
               IP.setIndividualPlayerCards(tempCards.get(x));
               tempCards.remove(x);
            }
        }  
    }  
}