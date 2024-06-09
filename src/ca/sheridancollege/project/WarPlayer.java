package ca.sheridancollege.project;

/*
* StudentID - 991722075
* Author - Varundeep Singh
* Date Modified - 06/09/2024
*/

public class WarPlayer extends Player {

    public WarPlayer(String name) {
        super(name);
    }

    @Override
    public Card playCard() {
        if (getHand().isEmpty()) {
            return null;
        }
        return getHand().remove(0);
    }
}