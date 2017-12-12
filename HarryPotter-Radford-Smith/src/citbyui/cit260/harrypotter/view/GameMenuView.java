/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.ActorControl;
import static byui.cit260.harrypotter.control.ActorControl.addHealthItemsToHealth;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelbyui.cit260.model.Game;
import modelbyui.cit260.model.Location;

/**
 *
 * @author paytonsmith and Connorradford
 */
class GameMenuView extends View {

    void displayGameMenuView() {

        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs == null || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    public String[] getInputs() {

        String[] inputs = new String[1];
                                    
   System.out.println("---------------------------------------------------------------------"
                + "\n* Hagrid is injured and needs your help. Your objective is to find    *"
                + "\n* the correct ingredients around the Forbidden Forest to              *"
                + "\n* heal him. Be wary, the Forbidden Forest is a dangerous              *"
                + "\n* place full of monsters and obstacles. You must overcome them        *"
                + "\n* by selecting the correct spell or item. If you make the wrong       *"
                + "\n* choice, you will take damage. Too many mistakes will leave you for  *"
                + "\n* a dragons midnight snack. Find chocolate frogs around the forest to *"
                + "\n* gain health. Good Luck! Remember, Hagrid's life is in your hands.   *"
                + "\n---------------------------------------------------------------------");
   
        mapView();

        System.out.println("*************************************"
                + "\n* Please select a game menu item. *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("M - Move to new location");
            System.out.println("I - Items List");
            System.out.println("S - Spells List");
            System.out.println("W - What should I do?");
            System.out.println("H - What’s my health?");
            System.out.println("T - How much time do I have? ");
            System.out.println("H - Help");
            System.out.println("Q - Quit");
            try {
                inputs[0] = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            inputs[0] = inputs[0].trim();
            if (inputs.length < 1) {
                ErrorView.display(this.getClass().getName(),
                        "**** You must enter a value. ***");
                continue;
            }
            valid = true;

        }

        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        switch (inputs[0].toUpperCase()) {
            case "D":
                addHealthItemsToHealth();
                return false;
            case "S":
                spellList();
                return false;
            case "I":
                itemList();
                return false;
            case "M":
                mapView();
                moveActorView();
                break;
            case "H":
                healthView();
                return false;
            default:
                System.out.println("Invalid menu item");
                break;
        }
        return false;
    }

    public static void startNewGame() {
        ActorControl.addHealthItemsToHealth(HarryPotterRadfordSmith.getPlayer());
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    public static void spellList() {
        SelectSpellView selectSpellView = new SelectSpellView();
        selectSpellView.displaySelectSpellView();
    }

    public static void itemList() {
        ItemMenuView itemMenuView = new ItemMenuView();
        itemMenuView.displayItemMenuView();
    }

    public static void mapView() {
        Game game = HarryPotterRadfordSmith.getCurrentGame();
        Location[][] locations = game.getMap().getLocations();
        int rowCount = game.getMap().getRowCount();
        int columnCount = game.getMap().getColumnCount();
        System.out.println("\t   Marauder's Map");
        System.out.println("  |  C0  |  C1  |  C2  |  C3  |  C4  |");
        for (int row = 0; row < rowCount; row++) {
            System.out.println("--------------------------------------");
            System.out.print("R" + row);
            for (int column = 0; column < columnCount; column++) {

                System.out.print("|");

                if (locations[row][column].visited) {
                    String symbol = locations[row][column].getScene().getDisplaySymbol();
                    if (symbol == null) {
                        symbol = "VT";
                    }
                    System.out.print("  " + symbol + "  ");
                } else {
                    System.out.print("  ??  ");
                }
            }
            System.out.print("|\n");
        }
        System.out.println("--------------------------------------");
    }

    public static void healthView() {
        SelectHealthView selectHealthView = new SelectHealthView();
        selectHealthView.displaySelectHealthView();
    }

    private void moveActorView() {
        MoveActorView moveActorView = new MoveActorView();
        moveActorView.displayMoveActorView();
    }
}
