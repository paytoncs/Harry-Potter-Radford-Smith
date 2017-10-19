/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

/**
 *
 * @author paytonsmith
 */
public class MapControl {

    public static double calcStepsRemaining(double totalMapColumns, double totalMapRows, double totalStepsTaken) {

        if (totalMapColumns < 3) {
            return -1;
        }

        if (totalMapRows < 3) {
            return -1;
        }

        double totalSteps = totalMapColumns * totalMapRows;

        if (totalStepsTaken < 1 || totalStepsTaken > totalSteps) {
            return -1;
        }

        double totalStepsRemaining = totalSteps - totalStepsTaken;

        return totalStepsRemaining;

    }
}
