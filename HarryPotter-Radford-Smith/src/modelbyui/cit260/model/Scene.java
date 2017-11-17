/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbyui.cit260.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Radford
 */
public class Scene implements Serializable {
    
    private String description;
    private String displaySymbol;
    private String obstacleEncounter;
    private Location location;
    private ArrayList<Location> locations = new ArrayList<Location>();
    private Spell spell;
    private ArrayList<Spell> spells = new ArrayList<Spell>();
    private Encounter encounter;
    private Encounter[] encounters = new Encounter[1];
    private Battle battle;
    private Battle[] battles = new Battle[1];

    public Battle[] getBattles() {
        return battles;
    }

    public void setBattles(Battle[] battles) {
        this.battles = battles;
    }
    
    

    public Battle getBattle() {
        return battle;
    }

    public void setBattle(Battle battle) {
        this.battle = battle;
    }
    
    

    public Encounter[] getEncounters() {
        return encounters;
    }

    public void setEncounters(Encounter[] encounters) {
        this.encounters = encounters;
    }
    
    

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }
    
    

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
    
    

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }
    
    

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    

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

    public Scene() {
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
