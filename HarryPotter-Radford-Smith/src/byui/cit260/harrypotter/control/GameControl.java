/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.awt.Point;
import modelbyui.cit260.model.Actor;
import modelbyui.cit260.model.Game;
import modelbyui.cit260.model.Item;
import modelbyui.cit260.model.Location;
import modelbyui.cit260.model.Map;
import modelbyui.cit260.model.Player;
import modelbyui.cit260.model.Scene;

/**
 *
 * @author paytonsmith
 */
public class GameControl {

    public static Player savePlayer(String playerName) {
        if (playerName == null || playerName.length() < 1) {
            return null;
        }
        Player player = new Player(playerName);
        player.setName(playerName);
        HarryPotterRadfordSmith.setPlayer(player);
        return player;
    }

    public static int createNewGame(Player player) {
        if (player == null) {
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);

        HarryPotterRadfordSmith.setCurrentGame(game);

        Actor[] actors = GameControl.createActors();
        game.setActors(actors);

        int noOfRows = 5;
        int noOfColumns = 5;

        Map map = createMap(noOfRows, noOfColumns);
        if (map == null) {
            return -1;
        }
        game.setMap(map);
        return 1;
    }

    private static Actor[] createActors() {
        Actor hagrid = new Actor();
        hagrid.setName("Hagrid");
        hagrid.setDescription("A loyal friend of Dumbledore and teacher at Hogwarts");
        hagrid.setCoordinates(new Point(1, 1));

        Actor spider = new Actor();
        spider.setName("Giant Spider");
        spider.setDescription("A dangerous creature hunting for human flesh");
        spider.setCoordinates(new Point(1, 2));

        Actor giant = new Actor();
        giant.setName("Giant");
        giant.setDescription("An unintelligent monster");
        giant.setCoordinates(new Point(1, 3));

        Actor dementor = new Actor();
        dementor.setName("Dementors");
        dementor.setDescription("Foul creatures out for your soul");
        dementor.setCoordinates(new Point(1, 4));

        Actor dragon = new Actor();
        dragon.setName("Dragon");
        dragon.setDescription("The most dangerous creature in the forbidden forest");
        dragon.setCoordinates(new Point(1, 5));

        Actor centaur = new Actor();
        centaur.setName("Centaur");
        centaur.setDescription("Friend of Hagrid, they will help you in your quest");
        centaur.setCoordinates(new Point(1, 6));

        return new Actor[1];
    }

    private static Map createMap(int noOfRows, int noOfColumns) {
        if (noOfRows < 0 || noOfColumns < 0) {
            return null;
        }

        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);

        Location[][] locations = GameControl.createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);

        Scene[] scenes = GameControl.createScenes();
        GameControl.assignItemsToScenes(scenes, locations);

        return map;
    }

    public static Location[][] createLocations(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1) {
            return null;
        }
        
        System.out.println("createLocations called");
        return new Location[1][1];
    }

    private static Scene[] createScenes() {
        System.out.println("createScenes() called");
        return new Scene[1];
    }

    private static void assignItemsToScenes(Scene[] scenes, Location[][] locations) {
        System.out.println("assignItemsToScenes called");                
    }
}
