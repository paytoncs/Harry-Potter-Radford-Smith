/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.GameControl;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author paytonsmith
 */
class MainMenuView extends View{


@Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println("*************************************"
                + "\n* Please select a menu item. *"
                + "\n*************************************");
        
           System.out.println("G - Start Game");
            System.out.println("H - Get Help");
            System.out.println("R - Restart Game");
         inputs[0] = this.getInput("");
        return inputs;

    }
@Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        switch (inputs[0].toUpperCase()) {
            case "G":
                startNewGame();
                return false;
            case "H":
                getHelp();
                return false;
            case "R":
                restartGame();
                return false;
            default:
                System.out.println("Invalid menu item");
                break;
        }
        return false;
    }

    public static void startNewGame() {
        GameControl.createNewGame(HarryPotterRadfordSmith.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    public static void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();

    }

    public static void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
