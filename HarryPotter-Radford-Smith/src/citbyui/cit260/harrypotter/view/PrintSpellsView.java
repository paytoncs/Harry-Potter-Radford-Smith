/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.GameControl;
import byui.cit260.harrypotter.exception.GameControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelbyui.cit260.model.Game;

/**
 *
 * @author woafr
 */
public class PrintSpellsView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        this.console.println("*************************************"
                + "\n* Enter the filename you would like to print the report to: *"
                + "\n*************************************");
        inputs[0] = this.getInput("Enter a filename.");
        return inputs;    
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
            try (PrintWriter out = new PrintWriter(new FileWriter("C:\\" + filePath))) {
                out.print("Lumos - Use this spell to light the area");
                out.print("Expecto Patronum - Use to defend against certain creature.");
                out.print("Incendio - Used for attacking certain creatures");
                out.print("Wingardium Leviosa - Helps lift objects");
                out.print("Accio - Helps retrieve certain items");
                out.close();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "file not printed");
        }
        this.console.println("Your game was saved");
        return true;
    }
    
}
