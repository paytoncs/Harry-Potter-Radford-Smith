/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.GameControl;
import byui.cit260.harrypotter.control.MapControl;
import byui.cit260.harrypotter.exception.MapControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import modelbyui.cit260.model.Actor;
import modelbyui.cit260.model.Location;
import modelbyui.cit260.model.Player;

/**
 *
 * @author Radford
 */
public class MoveActorView extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[2];

        System.out.println("*************************************"
                + "\n* Which direction do you want to go? *"
                + "\n*************************************");
        System.out.println("N - NORTH");
        System.out.println("S - SOUTH");
        System.out.println("E - EAST");
        System.out.println("W - WEST");

        String input1 = this.getInput("Enter a menu item.");
        inputs[0] = input1;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String row = inputs[0];
        String column = inputs[1];
        try {
            int rowNumber = Integer.parseInt(row);
            int columnNumber = Integer.parseInt(column);
        } catch (NumberFormatException ex) {
            System.out.println("The row and column must be a number");
            return false;
        }
        Player player = HarryPotterRadfordSmith.getPlayer();
        Actor actor = player.getActor();
        
        try {
            Location newLocation = MapControl.moveActor(actor, row);
        } catch (MapControlException e) {
            System.out.println("Error passed with the exception");
            return false;
        }
        
        System.out.println(GameControl.createScenes());
        
        switch (inputs[0].toUpperCase()) {
            case "N":
                try {
                MapControl.moveActor(actor, "N");}
                catch (MapControlException mce) {
                    System.out.println(mce);
                }
                return false;
            case "S":
                try {
                MapControl.moveActor(actor, "S");}
                catch (MapControlException mce) {
                    System.out.println(mce);
                }
                return false;
            case "E":
                try {
                MapControl.moveActor(actor, "E");}
                catch (MapControlException mce) {
                    System.out.println(mce);
                }
                return false;
            case "W":
                try {
                MapControl.moveActor(actor, "W");}
                catch (MapControlException mce) {
                    System.out.println(mce);
                }
                break;
            default:
                System.out.println("You can't leave, Hagrid needs you.");
                break;
        }
        return true;
    }
}
