/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import byui.cit260.harrypotter.exception.MapControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import modelbyui.cit260.model.Actor;
import modelbyui.cit260.model.Game;
import modelbyui.cit260.model.Location;
import modelbyui.cit260.model.Map;

/**
 *
 * @author paytonsmith
 */
public class MapControl {

    public static Map createMap(int noOfRows, int noOfColumns) {
        System.out.println("createMap method was called");
        return null;
    }

    public static Location moveActor(Actor actor, String direction)
            throws MapControlException {
        if (actor == null) {
            throw new MapControlException("There is no actor.");
        }

        Game game = HarryPotterRadfordSmith.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        // If direction is North then
        //  newRow = oldRow - 1
        //  newColumn = oldColumn
        // else If direction is South then
        //  newRow = oldRow + 1
        //  newColumn = oldColumn
        // else If direction is East then
        //  newRow = oldRow
        //  newColumn = oldColumn + 1
        // else If direction is West then
        //  newRow = oldRow
        //  newColumn = oldColumn - 1
        
        if (direction =)

        if (newRow < 1 || newRow > map.getRowCount() || newColumn < 1 || newColumn > map.getColumnCount()) {
            throw new MapControlException("That's out of bounds.");
        }

        int currentRow = actor.getLocation().getRow();
        int currentColumn = actor.getLocation().getColumn();
        Location oldLocation = locations[currentRow][currentColumn];

        Location newLocation = locations[newRow][newColumn];

        oldLocation.setActor(null);
        newLocation.setActor(actor);

        actor.setLocation(newLocation);

        return newLocation;
    }

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
