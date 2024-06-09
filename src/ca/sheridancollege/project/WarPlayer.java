package ca.sheridancollege.project;

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