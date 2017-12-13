/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.exception.GameControlException;
import byui.cit260.harrypotter.control.*;

/**
 *
 * @author paytonsmith
 */
class StartExistingGameView extends View{

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
    String filePath = inputs[1];
    try {
        GameControl.getGame(filePath);
    } catch (GameControlException e) {
        this.console.println(e);
        return false;
    }
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        return true;
    }
    
}
