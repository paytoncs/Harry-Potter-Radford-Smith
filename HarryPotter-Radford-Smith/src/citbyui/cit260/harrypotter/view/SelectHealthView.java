/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.ActorControl;
import static byui.cit260.harrypotter.control.ActorControl.totalHealthRemaining;


/**
 *
 * @author Radford
 */
class SelectHealthView extends View {

    void displaySelectHealthView() {
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
        ActorControl.totalHealthRemaining(0, 0);

        System.out.println("*************************************"
                + "\n* Your current heatlth is " + totalHealthRemaining(100, 1)
                + "\n*************************************");


        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
