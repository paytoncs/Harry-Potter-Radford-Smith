/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import java.util.Scanner;

/**
 *
 * @author paytonsmith
 */
public class ItemMenuView {
    public void displayItemMenuView() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs == null || inputs.length < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    private String[] getInputs() {
    String chooseItem = null;
        Scanner in = new Scanner(System.in);

        String[] inputs = new String[1];

        System.out.println("*************************************"
                + "\n* Welcome to your ite inventory. *"
                + "\n*************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter a key to choose an item");
            chooseItem = in.nextLine();
            if (chooseItem.length() > 1) {
                System.out.println("**** You must enter a valid key. ***");
                continue;
            }
            inputs[0] = chooseItem;
            valid = true;

        }

        return inputs;

    }

    private boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
