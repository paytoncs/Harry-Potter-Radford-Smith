/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import harrypotter.radford.smith.HarryPotterRadfordSmith;
import harrypotter.radford.smith.HarryPotterRadfordSmith.SceneType;
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
        hagrid.setCoordinates(new Point(3, 3));

        Actor spider = new Actor();
        spider.setName("Giant Spider");
        spider.setDescription("A dangerous creature hunting for human flesh");
        spider.setCoordinates(new Point(2, 2));

        Actor giant = new Actor();
        giant.setName("Giant");
        giant.setDescription("An unintelligent monster");
        giant.setCoordinates(new Point(4, 1));

        Actor dementor = new Actor();
        dementor.setName("Dementors");
        dementor.setDescription("Foul creatures out for your soul");
        dementor.setCoordinates(new Point(2, 4));

        Actor dragon = new Actor();
        dragon.setName("Dragon");
        dragon.setDescription("The most dangerous creature in the forbidden forest");
        dragon.setCoordinates(new Point(5, 3));

        Actor centaur = new Actor();
        centaur.setName("Centaur");
        centaur.setDescription("Friend of Hagrid, they will help you in your quest");
        centaur.setCoordinates(new Point(3, 5));

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

        Location[][] locations = new Location[noOfRows][noOfColumns];
        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                Location location = new Location();
                location.setRow(row);
                location.setColumn(column);
                location.setVisited(false);

            }
        }
        return new Location[1][1];
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[10];

        Scene scene1 = new Scene("You've encountered a spider!", "S", "Spider");
        scenes[0] = scene1;

        Scene scene2 = new Scene("You've encountered a giant!", "G", "Giant");
        scenes[1] = scene1;

        Scene scene3 = new Scene("You've encountered a dementor!", "D", "Dementor");
        scenes[2] = scene1;

        Scene scene4 = new Scene("You've encountered a dragon!", "R", "Dragon");
        scenes[3] = scene1;

        Scene scene5 = new Scene("You found a chocolate frog", "F", "Frog");
        scenes[4] = scene1;

        Scene scene6 = new Scene("You've encountered a boulder on the path!", "B", "Boulder");
        scenes[5] = scene1;

        Scene scene7 = new Scene("You've found an ingredient for Hagrid!", "I", "Ingredient");
        scenes[6] = scene1;

        Scene scene8 = new Scene("This is where Hagrid is.", "H", "Hagrid");
        scenes[7] = scene1;

        return scenes;
    }

    private static void assignItemsToScenes(Scene[] scenes, Location[][] locations) {
        System.out.println("assignItemsToScenes called");
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        locations[5][3].setScene(scenes[SceneType.battle_scene.ordinal()]);

        locations[2][2].setScene(scenes[SceneType.battle_scene.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.battle_scene.ordinal()]);

        locations[3][3].setScene(scenes[SceneType.friendly_scene.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.friendly_scene.ordinal()]);
        
        locations[4][1].setScene(scenes[SceneType.battle_scene.ordinal()]);
    }
}
