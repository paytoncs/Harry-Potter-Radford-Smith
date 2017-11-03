/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import static citbyui.cit260.harrypotter.view.MainMenuView.doAction;
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
            if (inputs == null || inputs[0].toUpperCase().equals("E")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[1];

        System.out.println("*************************************"
                + "\n* Please select a game menu item. *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("S - Spell options");
            Scanner keyboard = new Scanner(System.in);
            inputs[0] = keyboard.nextLine();
            inputs[0].trim();
            if (inputs.length < 1) {
                System.out.println("**** You must enter a valid Command. ***");
                continue;
            }
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        switch (inputs[0].toUpperCase()) {
            case "S":
                spellList();
                return true;
            default:
                System.out.println("Invalid menu item");
                break;
        }
        return false;
    }

    public static void spellList() {
        SelectSpellView selectSpellView = new SelectSpellView();
        selectSpellView.displaySelectSpellView();
    }
}

