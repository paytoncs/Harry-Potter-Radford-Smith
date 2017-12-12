/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Radford
 */
class SelectSpellView extends View {

    void displaySelectSpellView() {
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

        this.console.println("*************************************"
                + "\n* Spells List *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            this.console.println("* Lumos - Use this spell to light the area *");
            this.console.println("* Expecto Patronum - Use to defend against certain creature. *");
            this.console.println("* Incendio - Used for attacking certain creatures *");
            this.console.println("* Wingardium Leviosa - Helps lift objects *");
            this.console.println("* Accio - Helps retrieve certain items *");
            this.console.println("*************************************"
                + "\n* E - Exit Spells List *"
                + "\n*************************************");
            try {
                inputs[0] = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(SelectSpellView.class.getName()).log(Level.SEVERE, null, ex);
            }
            inputs[0].trim();
            if (inputs.length < 1) {
                this.console.println("**** You must enter a value. ***");
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
            case "E":
                GameMenuView gameMenuView = new GameMenuView();
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid menu item");
                break;
        }
        return false;
    }
}
