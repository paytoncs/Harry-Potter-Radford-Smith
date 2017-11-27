/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import java.util.Scanner;
import modelbyui.cit260.model.Item;

/**
 *
 * @author paytonsmith
 */
public class ItemMenuView {

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

    private String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println("*************************************"
                + "\n* Please select an item to use. *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("M - Marauder’s map");
            System.out.println("I - Invisibility cloak");
            System.out.println("C - Chocolate frogs (Adds +10 Health)");
            System.out.println("B - Broom");
            System.out.println("H - Help - What do the items do?");
            System.out.println("\n*************************************");
            System.out.println(" Press E to exit this menu?");
            System.out.println("*************************************");
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
            case "M":
                Item.useMaraudersMap();
                return true;
            case "I":
                Item.useInvisibilityCloak();
                return false;
            case "C":
                addHealthItemsToHealth();
                return false;
            case "B":
                Item.useBroomstick();
            case "H":
                System.out.println("Item functions \br 1.Marauder’s map (keep track of where you are) \n Invisibility cloak \n Potions (health) \n Antidotes (burn healing paste) \n Chocolate frogs and food \n Broom");
                return false;
            case "E":
                return true;
            default:
                System.out.println("Invalid menu item");
                break;
        }
        return false;
    }

    public static void addHealthItemsToHealth() {
        UseHealthItemView useHealthItemView = new UseHealthItemView();
        useHealthItemView.displayHealthItemView();
    }}