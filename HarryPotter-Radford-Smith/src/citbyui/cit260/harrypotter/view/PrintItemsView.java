/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Radford
 */
public class PrintItemsView extends View {

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
            try (PrintWriter out = new PrintWriter(new FileWriter("C:\\" + filePath + ".txt"))) {
                out.println("Marauder’s map - Helps View The Map\n");
                out.println("Invisibility cloak - Helps You Sneak Past Certain Enemies\n");
                out.println("Chocolate frogs - Gives you +10 Health\n");
                out.println("Broomstick - Allows You To Fly Over Objects\n");
                out.close();
                this.console.println("Your report was successfully printed at: C:\\" + filePath + ".txt"); 
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "file not printed");
                System.out.println(ex);
        }
        return true;
    }    

}
