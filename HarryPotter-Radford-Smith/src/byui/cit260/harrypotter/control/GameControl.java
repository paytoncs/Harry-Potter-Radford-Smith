/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import modelbyui.cit260.model.Player;

/**
 *
 * @author paytonsmith
 */
public class GameControl {
    public static Player savePlayer (String name) {
        System.out.println("*** savePlayer() called ***");
        return new Player();
    }
}
