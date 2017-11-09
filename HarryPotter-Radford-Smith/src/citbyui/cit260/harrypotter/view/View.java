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
public abstract class View implements ViewInterface {

    public View() {
    }

    @Override
    public void display() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs == null || inputs.length < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    @Override
    public String getInput(String promptMessage) {
        String value = null;
        Scanner in = new Scanner(System.in);

        boolean valid = false;
        while (valid == false) {
            System.out.println(promptMessage);
            value = in.nextLine();

            value = value.trim();
            if (value.length() < 1) {
                System.out.println("**** You must enter a value. ***");
                continue;
            }
            return value;

        }
        return null;

    }

}
