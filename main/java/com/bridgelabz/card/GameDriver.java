package com.bridgelabz.card;

import java.util.*;

public class GameDriver {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");
		n = sc.nextInt();
		if (n < 2 || n > 4) {
			System.out.println("Enter the value between 2 and 4");
			n = sc.nextInt();
		}
		sc.close();
        Player player=new Player(n);
        player.orderPlayer();
        player.cardDistribution();
        player.verifyCards();
	}

}
