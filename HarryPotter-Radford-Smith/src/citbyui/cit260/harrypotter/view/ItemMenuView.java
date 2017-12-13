/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.ItemControl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelbyui.cit260.model.Item;

/**
 *
 * @author paytonsmith
 */
public class ItemMenuView extends View {

    public void displayItemMenuView() {

        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs == null || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println("*************************************"
                + "\n* Please select an item to use. *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("M - Marauder’s map");
            System.out.println("C - Chocolate frogs (Replenishes Health)");
            System.out.println("W - Wand");
            System.out.println("H - Help - What do the items do?");
            System.out.println("\n*************************************");
            System.out.println(" Press E to exit this menu?");
            System.out.println("*************************************");
            try {
                inputs[0] = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(ItemMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            inputs[0].trim();
            if (inputs.length < 1) {
                System.out.println("**** You must enter a value. ***");
                continue;
            }
            valid = true;

        }

        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
         menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "M":
                GameMenuView.mapView();
                return false;
            case "C":
                UseHealthView();
                return false;
            case "W":
                wandView();
            case "H":
                System.out.println(" 1. Marauder’s map (keep track of where you are.) \n 2. Invisibility cloak (Hides you from enemies for 3 moves.) \n 3. Antidotes (Heals you from dragon burns.) \n 4. Chocolate frogs (Heals you.) \n 5. Broom (Quickly move to any spot on the map.)");
                return false;
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item");
                break;
        }
        return false;
    }

    public static void UseHealthView() {
        UseHealthItemView useHealthItemView = new UseHealthItemView();
        useHealthItemView.display();
    }

    private void wandView() {
SelectSpellView selectSpellView  = new SelectSpellView();
        selectSpellView.displaySelectSpellView();    
                }
}