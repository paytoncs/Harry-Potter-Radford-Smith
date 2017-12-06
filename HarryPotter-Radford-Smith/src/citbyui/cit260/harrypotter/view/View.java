/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paytonsmith
 */
public abstract class View implements ViewInterface {

    private String message;
    protected final BufferedReader keyboard = HarryPotterRadfordSmith.getInFile();
    protected final PrintWriter console = HarryPotterRadfordSmith.getOutFile();
    
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

        boolean valid = false;
        while (valid == false) {
            System.out.println(promptMessage);
            try {
                value = keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }

            value = value.trim();
            if (value.length() < 1) {
                System.out.println("\n**** You must enter a value. ***\n");
                continue;
            }
            return value;

        }
        return null;

    }

}
