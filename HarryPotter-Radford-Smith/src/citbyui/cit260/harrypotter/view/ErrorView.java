/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.io.PrintWriter;

/**
 *
 * @author Radford
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = HarryPotterRadfordSmith.getOutFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                "----------------------------------------------"
               +"\n- ERROR -" + errorMessage
               +"----------------------------------------------");
    }
}
