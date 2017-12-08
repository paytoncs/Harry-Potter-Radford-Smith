/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter.radford.smith;

import citbyui.cit260.harrypotter.view.ItemMenuView;
import citbyui.cit260.harrypotter.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import modelbyui.cit260.model.Game;
import modelbyui.cit260.model.Player;

public class HarryPotterRadfordSmith {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        HarryPotterRadfordSmith.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        HarryPotterRadfordSmith.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        HarryPotterRadfordSmith.logFile = logFile;
    }

    public static void main(String[] args) {
        try {
            HarryPotterRadfordSmith.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            HarryPotterRadfordSmith.outFile
                    = new PrintWriter(System.out, true);
            //open log file
            String filePath = "log.txt";
            HarryPotterRadfordSmith.logFile = new PrintWriter(filePath);

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            ItemMenuView itemMenuView = new ItemMenuView();
            itemMenuView.displayItemMenuView();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (HarryPotterRadfordSmith.inFile != null) {
                    HarryPotterRadfordSmith.inFile.close();
                }

                if (HarryPotterRadfordSmith.outFile != null) {
                    HarryPotterRadfordSmith.outFile.close();
                }

                if (HarryPotterRadfordSmith.logFile != null) {
                    HarryPotterRadfordSmith.logFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public int setMyColumn() {
        
    }
    
    public void setMyRow() {
        
    }
    
    public int getMyColumn() {
        return column;
    }
    
    public int getMyRow() {
        return row;
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
