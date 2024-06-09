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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author armaa
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
