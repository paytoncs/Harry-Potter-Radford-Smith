/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter.radford.smith;

import citbyui.cit260.harrypotter.view.ItemMenuView;
import citbyui.cit260.harrypotter.view.StartProgramView;
import modelbyui.cit260.model.Game;
import modelbyui.cit260.model.Player;

/**
 *
 * @author Radford
 */
public class HarryPotterRadfordSmith {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    
    public enum SceneType {
        battle_scene,
        obstacle_scene,
        found_item_scene,
        friendly_scene,        
    }
    
    public static void main(String[] args) {
      StartProgramView startProgramView = new StartProgramView();
      startProgramView.display();
      
      ItemMenuView itemMenuView = new ItemMenuView();
      itemMenuView.displayItemMenuView();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HarryPotterRadfordSmith.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        HarryPotterRadfordSmith.player = player;
    }
    private long currentHealth;
    
      public long getCurrentHealth() {
        return currentHealth;
    }

  
    }
    

