package modelbyui.cit260.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paytonsmith
 */
public class Location implements Serializable {
    
    private int row;
    private int column;
    public boolean visited;
    private Int movesRemainingInGame;
    private String runAway;
    private Actor actor;
    private Actor[] actors = new Actor[1];
    private Scene scene;
    private Scene[] scenes = new Scene[1];
    private Map map;
    private Map[] maps = new Map[1];

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    

    public Map[] getMaps() {
        return maps;
    }

    public void setMaps(Map[] maps) {
        this.maps = maps;
    }
    
    

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    

    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }
    
    

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }
    

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    

    public Location(){
    }


    public Int getMovesRemainingInGame() {
        return movesRemainingInGame;
    }

    public String getRunAway() {
        return runAway;
    }



    public void setMovesRemainingInGame(Int movesRemainingInGame) {
        this.movesRemainingInGame = movesRemainingInGame;
    }

    public void setRunAway(String runAway) {
        this.runAway = runAway;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.row);
        hash = 59 * hash + Objects.hashCode(this.column);
        hash = 59 * hash + Objects.hashCode(this.visited);
        hash = 59 * hash + Objects.hashCode(this.movesRemainingInGame);
        hash = 59 * hash + Objects.hashCode(this.runAway);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.runAway, other.runAway)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.movesRemainingInGame, other.movesRemainingInGame)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", movesRemainingInGame=" + movesRemainingInGame + ", runAway=" + runAway + '}';
    }
    
    
}
