/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

/**
 *
 * @author woafr
 */
public class QuitGameView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        this.console.println("*************************************"
                + "\n* Are you sure you want to quit the game? Enter 'y' for yes and 'n' for no! *"
                + "\n*************************************");
        inputs[0] = this.getInput("Enter your decision.");
        return inputs;            
    }

    @Override
    public boolean doAction(String[] inputs) {
        String decision = inputs[0];
        decision = decision.toUpperCase();
        switch(decision) {
        case "Y":
            System.exit(0);
            return false;
        case "N":
            return true;
        default:
            System.exit(0);
            return false;
        }
    }
    
}
