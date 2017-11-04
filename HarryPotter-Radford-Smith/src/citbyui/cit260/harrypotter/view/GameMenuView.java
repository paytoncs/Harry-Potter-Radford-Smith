/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.ActorControl;
import static byui.cit260.harrypotter.control.ActorControl.addHealthItemsToHealth;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.util.Scanner;

/**
 *
 * @author paytonsmith and Connorradford
 */
class GameMenuView {

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


    static String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println("*************************************"
                + "\n* Please select a game menu item. *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("V - View Map");
            System.out.println("I - Items List");
            System.out.println("S - Spells List");
            System.out.println("M - Move to new location");
            System.out.println("R - Run away");
            System.out.println("W - What should I do?");
            System.out.println("H - What’s my health?");
            System.out.println("T - How much time do I have? ");
            System.out.println("D - How much would this item help my health?");
            System.out.println("H - Help");
            System.out.println("V - Quit");
            Scanner keyboard = new Scanner(System.in);
            inputs[0] = keyboard.nextLine();
            inputs[0].trim();
            if (inputs.length < 1) {
                System.out.println("**** You must enter a value. ***");
                continue;
            }
            valid = true;

        }

        return inputs;

    }

    static boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        switch (inputs[0].toUpperCase()) {
            case "D":
                addHealthItemsToHealth(0, 0);
                return false;
                 case "S":
                spellList();
                return true;
            case "I":
                itemList();
                return true;
 
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
        SelectItemView selectItemView = new SelectItemView();
        selectItemView.displaySelectItemView();
    }

}
