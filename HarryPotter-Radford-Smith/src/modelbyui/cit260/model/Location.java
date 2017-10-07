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
    
    private Point row;
    private Point column;
    private Point visited;
    private Int movesRemainingInGame;
    private String runAway;

    public Location(){
    }
    public Point getRow() {
        return row;
    }

    public Point getColumn() {
        return column;
    }

    public Point getVisited() {
        return visited;
    }

    public Int getMovesRemainingInGame() {
        return movesRemainingInGame;
    }

    public String getRunAway() {
        return runAway;
    }

    public void setRow(Point row) {
        this.row = row;
    }

    public void setColumn(Point column) {
        this.column = column;
    }

    public void setVisited(Point visited) {
        this.visited = visited;
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
