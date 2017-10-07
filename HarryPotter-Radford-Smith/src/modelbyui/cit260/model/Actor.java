/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbyui.cit260.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author paytonsmith & Connor Radford
 */
public class Actor implements Serializable { 
    
    private String name;
    private String description;
    private Point coordinates;
    private long totalHealth;
    private long movesLeft;
    private Game[] game = new Game[10];
    private Player player;
    private final Player[] players = new Player[1];
    private Location location;
    private final ArrayList<Location> locations = new ArrayList<Location>();

    public ArrayList<Location> getLocations() {
        return locations;
    }
    
    
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    

    public Player[] getPlayers() {
        return players;
    }
    
    
    
    

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
    
    
    public Actor() {
        
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public long getTotalHealth() {
        return totalHealth;
    }

    public void setTotalHealth(long totalHealth) {
        this.totalHealth = totalHealth;
    }

    public long getMovesLeft() {
        return movesLeft;
    }

    public void setMovesLeft(long movesLeft) {
        this.movesLeft = movesLeft;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", totalHealth=" + totalHealth + ", movesLeft=" + movesLeft + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.coordinates);
        hash = 59 * hash + (int) (this.totalHealth ^ (this.totalHealth >>> 32));
        hash = 59 * hash + (int) (this.movesLeft ^ (this.movesLeft >>> 32));
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
        final Actor other = (Actor) obj;
        if (this.totalHealth != other.totalHealth) {
            return false;
        }
        if (this.movesLeft != other.movesLeft) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }
   
    
}
