package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.GameControl;
import byui.cit260.harrypotter.control.MapControl;
import byui.cit260.harrypotter.exception.MapControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.util.ArrayList;
import java.util.Arrays;
import modelbyui.cit260.model.Actor;
import modelbyui.cit260.model.Game;
import modelbyui.cit260.model.Location;
import modelbyui.cit260.model.Map;
import modelbyui.cit260.model.Player;

/**
 *
 * @author Radford
 */
public class MoveActorView extends View {

    void displayMoveActorView() {
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

        String[] inputs = new String[2];

        System.out.println("*************************************"
                + "\n* Which direction do you want to go? *"
                + "\n*************************************");
        System.out.println("N - NORTH");
        System.out.println("S - SOUTH");
        System.out.println("E - EAST");
        System.out.println("W - WEST");

        String input1 = this.getInput("Enter which direction you want to go.");
        inputs[0] = input1;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        Player player = HarryPotterRadfordSmith.getPlayer();
        int row = HarryPotterRadfordSmith.getMyRow();
        int column = HarryPotterRadfordSmith.getMyColumn();
        try {
            System.out.println(row + column);
            Location newLocation = MapControl.moveActor(player, inputs, row, column);
        } catch (MapControlException e) {
            System.out.println("Error passed with the exception " + player);
            return false;
        }

    //    System.out.println(GameControl.createScenes());

        return true;
    }
}
