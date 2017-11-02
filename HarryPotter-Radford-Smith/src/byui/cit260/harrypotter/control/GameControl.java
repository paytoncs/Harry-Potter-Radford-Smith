/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harrypotter.control;

import harrypotter.radford.smith.HarryPotterRadfordSmith;
import modelbyui.cit260.model.Player;
import sun.audio.AudioPlayer;

/**
 *
 * @author paytonsmith
 */
public class GameControl {


    public static Player savePlayer(String playerName) {
        if( playerName == null || playerName.length() < 1){
           return null; 
        }
        Player player = new Player(playerName);
        player.setName(playerName);
        HarryPotterRadfordSmith.setPlayer(player);
        return player;
    }
    
    public static void createNewGame (Player player){
        System.out.println("createNewGame() worked");

    }
}
