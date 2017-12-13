/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.GameControl;
import byui.cit260.harrypotter.exception.GameControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import modelbyui.cit260.model.Game;

/**
 *
 * @author Radford
 */
public class SaveGameView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println("*************************************"
                + "\n* Are You Sure You Want To Save? *"
                + "\n*************************************");
        this.console.println("Y - Yes");
        this.console.println("N - No, lets go back to the game.");
        inputs[0] = this.getInput("Enter a menu item.");
        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        Game game = HarryPotterRadfordSmith.getCurrentGame();
        try {
            GameControl.saveGame(game, filePath);
        } catch (GameControlException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        System.out.println("Your game was saved");
        return true;
    }
}
