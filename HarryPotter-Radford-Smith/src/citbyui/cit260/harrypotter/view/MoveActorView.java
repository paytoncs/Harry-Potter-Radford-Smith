package citbyui.cit260.harrypotter.view;

import byui.cit260.harrypotter.control.GameControl;
import byui.cit260.harrypotter.control.MapControl;
import byui.cit260.harrypotter.exception.MapControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import modelbyui.cit260.model.Location;
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

        this.console.println("*************************************"
                + "\n* Which direction do you want to go? *"
                + "\n*************************************");
        this.console.println("N - NORTH");
        this.console.println("S - SOUTH");
        this.console.println("E - EAST");
        this.console.println("W - WEST");

        this.console.println("P - Port Key (move to random location)");


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
            Location newLocation = MapControl.moveActor(player, inputs, row, column);
            newLocation.visited = true;
        } catch (MapControlException e) {
            System.out.println("Error passed with the exception " + e);
            return false;
        }

        this.console.println(GameControl.createScenes());

        return true;
    }
}
