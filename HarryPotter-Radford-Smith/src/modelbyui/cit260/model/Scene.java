/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbyui.cit260.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Radford
 */
public class Scene implements Serializable {
    
    private String description;
    private String displaySymbol;
    private String obstacleEncounter;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public String getObstacleEncounter() {
        return obstacleEncounter;
    }

    public void setObstacleEncounter(String obstacleEncounter) {
        this.obstacleEncounter = obstacleEncounter;
    }

    public Scene(String description, String displaySymbol, String obstacleEncounter) {
        this.description = description;
        this.displaySymbol = displaySymbol;
        this.obstacleEncounter = obstacleEncounter;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.description);
        hash = 73 * hash + Objects.hashCode(this.displaySymbol);
        hash = 73 * hash + Objects.hashCode(this.obstacleEncounter);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return Objects.equals(this.obstacleEncounter, other.obstacleEncounter);
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", displaySymbol=" + displaySymbol + ", obstacleEncounter=" + obstacleEncounter + '}';
    }
    
    
}
