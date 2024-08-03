/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

// an abstract class which is used to build warPlayer in the game
/**
 *
 * @author Varundeep Singh - 9 June
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private String name;
    private int points;
    private List<Card> hand;

    //constructor for player
    public Player(String name) {
        this.name = name;
        this.points = 0;
        this.hand = new ArrayList<>();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void incrementPoints() {
        points++;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public List<Card> getHand() {
        return hand;
    }

    public abstract Card playCard();

    // function to print points at last 
    public void printStatus() {
        System.out.println(name + " points: " + points);
    }
}
