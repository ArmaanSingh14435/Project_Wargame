/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Armaan Singh 9 June
 */
public class PlayingCard extends Card {
    public PlayingCard(String suit, String rank) {
        super(suit, rank);
    }

    @Override
    public String toString() {
        return getRank() + " of " + getSuit();
    }
}
