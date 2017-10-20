/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbyui.cit260.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author paytonsmith
 */
public class Map implements Serializable {

    
    private String description;
    private Point rowCount;
    private Point columnCount;
    private Game game;
    private final Game[] games = new Game[1];

    public Game[] getGames() {
        return games;
    }
    

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    

    public Map(String description, Point rowCount, Point columnCount) {
        this.description = description;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    
    public String getDescription() {
        return description;
    }

    public Point getRowCount() {
        return rowCount;
    }

    public Point getColumnCount() {
        return columnCount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRowCount(Point rowCount) {
        this.rowCount = rowCount;
    }

    public void setColumnCount(Point columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.rowCount);
        hash = 89 * hash + Objects.hashCode(this.columnCount);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

}
