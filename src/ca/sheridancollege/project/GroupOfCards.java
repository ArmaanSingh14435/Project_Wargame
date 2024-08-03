/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * @author Armaan Singh 9 June
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GroupOfCards {

    private final List<PlayingCard> cards; // The concrete subclass

    public GroupOfCards() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        cards = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new PlayingCard(suit, rank));
            }
        }
        Collections.shuffle(cards);
    }

    public PlayingCard getCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

}
