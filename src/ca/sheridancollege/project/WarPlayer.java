/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Varundeep Singh - 9 June
 * @modifier Rajiv Kumar
 * @modifier Arshdeep Singh
 */

public class WarPlayer extends Player {

    public WarPlayer(String name) {
        super(name);
    }

    // functions which returns a card from the cards in hand (group of cards)
    @Override
    public Card playCard() {
        if (getHand().isEmpty()) {
            return null;
        }
        return getHand().remove(0);
    }
}
