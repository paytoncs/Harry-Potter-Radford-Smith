/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import byui.cit260.harrypotter.exception.MapControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.util.ArrayList;
import modelbyui.cit260.model.Actor;
import modelbyui.cit260.model.Game;
import modelbyui.cit260.model.Location;
import modelbyui.cit260.model.Map;
import modelbyui.cit260.model.Player;

/**
 *
 * @author paytonsmith
 */
public class MapControl {

    public static Map createMap(int noOfRows, int noOfColumns) {
        System.out.println("createMap method was called");
        return null;
    }

    public static Location moveActor(Player player, String[] inputs, int currentRow, int currentColumn)
            throws MapControlException {
        if (player == null) {
            throw new MapControlException("There is no actor.");
        }

        Game game = HarryPotterRadfordSmith.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        Location oldLocation = locations[currentRow][currentColumn];

     //   int currentRow = actors.;//getLocation().getRow();
     //   int currentColumn = actors.getLocation().getColumn();     
        int newRow = 0;
        int newColumn = 0;
        switch (inputs[0].toUpperCase()) {
            case "N":
                newRow = currentRow - 1;
                newColumn = currentColumn;
                break;
            case "S":
                newRow = currentRow + 1;
                newColumn = currentColumn;
                break;
            case "E":
                newRow = currentRow;
                newColumn = currentColumn + 1;
                break;
            case "W":
                newRow = currentRow;
                newColumn = currentColumn - 1;
                break;
            default:
                System.out.println("You can't leave, Hagrid needs you.");
                break;
        }

        Location newLocation = locations[newRow][newColumn];

        player.setLocation(newLocation);
        return new Location();
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
