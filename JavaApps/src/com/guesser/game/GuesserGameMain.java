package com.guesser.game;

import java.util.Scanner;

class Guesser {
	int guessNum;

	int guessNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Player {
	int guessNum;

	int guessNumber() {
		System.out.println("Playerr kindly guess the number");
		Scanner scan = new Scanner(System.in);
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}

	void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
	}

	void compare() {
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All Players Guess Correct Number::");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player1 and Player 2 won the game");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player1 and Player3  won the game");
			} else {
				System.out.println("Player1 won the game");
			}
		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 & Player3 won");
			} else {
				System.out.println("Player 2 won the game");
			}
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player3  won the game");
		} else {
			System.out.println("All are lost the game, Try Again!");
		}
	}

}

public class GuesserGameMain {
	public static void main(String[] args) {

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}
}
