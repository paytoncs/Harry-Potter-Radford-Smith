/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import byui.cit260.harrypotter.exception.GameControlException;
import harrypotter.radford.smith.HarryPotterRadfordSmith;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelbyui.cit260.model.Actor;
import modelbyui.cit260.model.Game;
import modelbyui.cit260.model.Location;
import modelbyui.cit260.model.Map;
import modelbyui.cit260.model.Player;
import modelbyui.cit260.model.Scene;
import modelbyui.cit260.model.SceneType;

/**
 *
 * @author paytonsmith
 */
public class GameControl {

    public static Player savePlayer(String playerName)
            throws GameControlException {
        if (playerName == null || playerName.length() < 1) {
            throw new GameControlException("That name is too short.");
        }
        Player player = new Player(playerName);
        player.setName(playerName);
        HarryPotterRadfordSmith.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player)
            throws GameControlException {
        if (player == null) {
            throw new GameControlException("You haven't input a valid player.");
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
            throw new GameControlException("You need to put in an input");
        }
        game.setMap(map);

    }

    public static Actor[] createActors() {
        Actor hagrid = new Actor();
        hagrid.setName("Hagrid");
        hagrid.setDescription("A loyal friend of Dumbledore and teacher at Hogwarts");
        hagrid.setCoordinates(new Point(2, 2));

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

    public static Map createMap(int noOfRows, int noOfColumns)
            throws GameControlException {
        if (noOfRows < 0 || noOfColumns < 0) {
            throw new GameControlException("That input is too small.");
        }

        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);

        Location[][] locations = GameControl.createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);

        Scene[] scenes = GameControl.createScenes();
        GameControl.assignItemsToScenes(scenes, locations);
        GameControl.assignScenesToLocations(map, scenes);

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
                locations[row][column] = location;
            }
        }
        int row;
        int col;
        if (HarryPotterRadfordSmith.getMyColumn() == 0 || HarryPotterRadfordSmith.getMyRow() == 0) {
            col = 2;
            row = 2;
        } else {
            col = HarryPotterRadfordSmith.getMyColumn();
            row = HarryPotterRadfordSmith.getMyRow();
        }
        HarryPotterRadfordSmith.setMyRow(row);
        HarryPotterRadfordSmith.setMyColumn(col);
        locations[col][row].setVisited(true);
        return locations;
    }

    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[10];

        Scene scene1 = new Scene("You've encountered a spider!", "SP", "Spider");
        scenes[SceneType.spider_scene.ordinal()] = scene1;

        Scene scene2 = new Scene("You've encountered a giant!", "GI", "Giant");
        scenes[SceneType.giant_scene.ordinal()] = scene2;

        Scene scene3 = new Scene("You've encountered a dementor!", "DE", "Dementor");
        scenes[SceneType.dementor_scene.ordinal()] = scene3;

        Scene scene4 = new Scene("You've encountered a dragon!", "DR", "Dragon");
        scenes[SceneType.dragon_scene.ordinal()] = scene4;

        Scene scene5 = new Scene("You found a chocolate frog", "FR", "Frog");
        scenes[SceneType.chocolate_frog_scene.ordinal()] = scene5;

        Scene scene6 = new Scene("You've encountered a boulder on the path!", "BO", "Boulder");
        scenes[SceneType.boulder_scene.ordinal()] = scene6;

        Scene scene7 = new Scene("You've found an ingredient for Hagrid!", "IN", "Ingredient");
        scenes[SceneType.found_main_item_scene.ordinal()] = scene7;

        Scene scene8 = new Scene("This is where Hagrid is.", "HA", "Hagrid");
        scenes[SceneType.hagrid_scene.ordinal()] = scene8;

        return scenes;
    }

    public static void assignItemsToScenes(Scene[] scenes, Location[][] locations) {
        System.out.println("assignItemsToScenes called");
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        // hagrid_scene is where the end user will start
        locations[2][2].setScene(scenes[SceneType.hagrid_scene.ordinal()]);

        locations[4][3].setScene(scenes[SceneType.spider_scene.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.spider_scene.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.spider_scene.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.friendly_scene.ordinal()]);
    }

    public static Game getGame(String filePath) throws GameControlException, ClassNotFoundException {
        Game game = null;
        if (filePath == null) {
            throw new GameControlException("FilePath cannot be null!!");
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
           game = (Game) in.readObject();
           HarryPotterRadfordSmith.setCurrentGame(game);
           HarryPotterRadfordSmith.setPlayer(game.player);
        } catch (FileNotFoundException ex) {
            System.out.println("Error message: " + ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return game;
    }
    
    public static void saveGame(Game game, String filePath) throws GameControlException {
        if (game == null || filePath == null || filePath.length() < 1) {
            throw new GameControlException("Invalid inputs");
        }
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(game);
        } catch (FileNotFoundException ex) {
            System.out.println("Error message: " + ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
