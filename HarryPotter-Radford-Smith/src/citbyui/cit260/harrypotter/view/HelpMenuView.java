/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

/**
 *
 * @author paytonsmith
 */
class HelpMenuView extends View {

    public String[] getInputs() {

        String[] inputs = new String[1];

        this.console.println("*************************************"
                + "\n* Please select a help menu item. *"
                + "\n*************************************");
        this.console.println("G - What is the goal of the game?");
        this.console.println("M - How to move");
        this.console.println("E - Exit");
        inputs[0] = this.getInput("Enter a menu item.");
        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        switch (inputs[0].toUpperCase()) {
            case "G":
                this.console.println("\nThe goal of this game is to collect the items to heal Hagrid from his injury.\n");
                return false;
            case "M":
                this.console.println("\nYou will need to press a command key to choose the direction in which you will move.\n");
                return false;
            case "E":
                MainMenuView mainMenuView = new MainMenuView();
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid menu item");
                break;
        }
        return false;
    }

}
