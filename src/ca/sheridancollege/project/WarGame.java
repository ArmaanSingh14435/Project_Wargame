/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author armaa
 * @modifier ArshdeepSingh
 * @modifier Varundeep Singh
 */

import java.util.ArrayList;
import java.util.Scanner;

// main class which is based on Game class
public class WarGame extends Game {

    private final GroupOfCards deck;

    // constructor for WarGame
    public WarGame(String name, String player1Name, String player2Name) {
        super(name);
        ArrayList<Player> players = new ArrayList<>();
        players.add(new WarPlayer(player1Name));
        players.add(new WarPlayer(player2Name));
        setPlayers(players);
        deck = new GroupOfCards();
    }

    @Override
    /* function which starts the play
        each player is assigned a random card 
    out of the group of cards and the one with higher value wins.
    */
    public void play() {
        Player player1 = getPlayers().get(0);
        Player player2 = getPlayers().get(1);

        while (!deck.isEmpty()) {
            player1.addCardToHand(deck.getCard());
            player2.addCardToHand(deck.getCard());
        }

        while (true) {
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            if (card1 == null || card2 == null) {
                break;
            }

            System.out.println(player1.getName() + " plays " + card1);
            System.out.println(player2.getName() + " plays " + card2);

            if (card1.getValue() > card2.getValue()) {
                player1.incrementPoints();
                System.out.println(player1.getName() + " wins the round!");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementPoints();
                System.out.println(player2.getName() + " wins the round!");
            } else {
                System.out.println("It's a tie!");
            }

            player1.printStatus();
            player2.printStatus();

            System.out.println();
        }
    }

    /* function to declare winner
    based on the final points
    
    */
    @Override
    public void declareWinner() {
        Player player1 = getPlayers().get(0);
        Player player2 = getPlayers().get(1);

        System.out.println("Point Table: ");
        player1.printStatus();
        player2.printStatus();

        if (player1.getPoints() > player2.getPoints()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getPoints() > player1.getPoints()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("Tie!");
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player Names: \n");

        System.out.print("P1: ");
        String player1Name = scanner.nextLine();

        System.out.print("P2: ");
        String player2Name = scanner.nextLine();

        WarGame game = new WarGame("War Card Game", player1Name, player2Name);
        game.play();
        System.out.println("-------------------");
        System.out.println("-------------------");
        game.declareWinner();
        
    }
}
