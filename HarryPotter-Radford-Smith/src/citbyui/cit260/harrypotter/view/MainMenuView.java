/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.GameControl;
import byui.cit260.harrypotter.exception.GameControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;

/**
 *
 * @author paytonsmith
 */
class MainMenuView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println("*************************************"
                + "\n* Please select a menu item. *"
                + "\n*************************************");

        this.console.println("G - Start Game");
        this.console.println("H - Get Help");
        this.console.println("R - Restart Game");
        this.console.println("C - Character List");
        inputs[0] = this.getInput("");
        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "G":
                startNewGame();
                return false;
            case "H":
                getHelp();
                return false;
            case "R":
                restartGame();
                return false;
            case "C":
                restartGame();
                return false;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid menu item");
                break;
        }
        return false;
    }

    public void startNewGame() {
        try {
            GameControl.createNewGame(HarryPotterRadfordSmith.getPlayer());
        } catch (GameControlException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    public static void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView() {};
        startExistingGameView.display();

    }

    public static void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
