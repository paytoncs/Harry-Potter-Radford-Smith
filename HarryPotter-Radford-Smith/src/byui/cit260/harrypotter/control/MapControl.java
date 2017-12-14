/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import byui.cit260.harrypotter.exception.MapControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
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
            case "P":
                //Move to random location
                portKey();
                break;
            default:
                System.out.println("That's out of bounds.");
                break;
        }
        HarryPotterRadfordSmith.setMyColumn(newColumn);
        HarryPotterRadfordSmith.setMyRow(newRow);
        Location newLocation = locations[newRow][newColumn];
        player.setLocation(newLocation);
        return newLocation;
    }

    private static Location portKey() {
        Game game = HarryPotterRadfordSmith.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        int newRow = 0;
        int newColumn = 0;
        HarryPotterRadfordSmith.setMyColumn(newColumn);
        HarryPotterRadfordSmith.setMyRow(newRow);
        Location previousLocation = locations[newRow][newColumn];
        return previousLocation;
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
