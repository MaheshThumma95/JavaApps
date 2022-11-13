package com.guesser.game;

import java.util.Scanner;

class Guesser {
	int guessNum;
	int guessNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser kindly guess the number (1-100)");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Player {
	int guessNum;

	int guessNumber() {
		System.out.println("\nPlaye kindly guess the number (1-100)");
		Scanner scan = new Scanner(System.in);
		guessNum = scan.nextInt();

		if (guessNum > 0 && guessNum <= 100) {
			return guessNum;
		} else {
			System.out.println("Invalid Input, Please Enter Again between 1-100 only");
			guessNum = scan.nextInt();
		}
		return guessNum;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	int collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
		return numFromGuesser;
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
				System.out.println("Congratulations!, All The Players Guess Correct");
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
		int collectGuessNum = u.collectNumFromGuesser();

		//check range for guesser number
		if (collectGuessNum > 0 && collectGuessNum <= 100) {
			u.collectNumFromPlayers();
			u.compare();
		} else {
			System.out.println("Guesser, Plese select guess range b/w 1-100 only");
		}

	}
}
