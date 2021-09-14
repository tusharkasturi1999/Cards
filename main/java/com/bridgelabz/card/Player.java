package com.bridgelabz.card;

import java.util.*;
/**
 * class to store the number of players and their cards
 * @author Adithya S Shenoy
 *
 */
class individualPlayer{
   /**
    * individualPlayer is each player with 9 cards
    */
    public individualPlayer()
    {
        ArrayList<Card> individualPlayer=new ArrayList<Card>(9); 
    } 
}

public class Player {
    /**
     * constructor to initialize the players
     * @param n number of players
     */
    public Player(int n)
    {
        Deck cards=new Deck();
        //players contain 9 cards of individual player
        ArrayList<individualPlayer> players = new ArrayList<individualPlayer>(n);    
    }
}