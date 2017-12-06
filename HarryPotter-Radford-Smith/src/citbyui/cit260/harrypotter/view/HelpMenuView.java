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

        System.out.println("*************************************"
                + "\n* Please select a help menu item. *"
                + "\n*************************************");
        System.out.println("G - What is the goal of the game?");
        System.out.println("M - How to move");
        System.out.println("E - Exit");
        inputs[0] = this.getInput("Enter a menu item.");
        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem.toUpperCase();
        switch (inputs[0].toUpperCase()) {
            case "G":
                System.out.println("\nThe goal of this game is to collect the items to heal Hagrid from his injury.\n");
                return false;
            case "M":
                System.out.println("\nYou will need to press a command key to choose the direction in which you will move.\n");
                return false;
            case "E":
                MainMenuView mainMenuView = new MainMenuView();
                return true;
            default:
                System.out.println("Invalid menu item");
                break;
        }
        return false;
    }

}
