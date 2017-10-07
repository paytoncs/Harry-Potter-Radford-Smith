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
public class Encounter implements Serializable{
    
   private String encounterType;
   private String getSolution;
   private Scene scene;
   private Scene[] scenes = new Scene[1];

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
   
   

    public String getEncounterType() {
        return encounterType;
    }

    public void setEncounterType(String encounterType) {
        this.encounterType = encounterType;
    }

    public String getGetSolution() {
        return getSolution;
    }

    public void setGetSolution(String getSolution) {
        this.getSolution = getSolution;
    }

    public Encounter(String encounterType, String getSolution) {
        this.encounterType = encounterType;
        this.getSolution = getSolution;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.encounterType);
        hash = 53 * hash + Objects.hashCode(this.getSolution);
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
        final Encounter other = (Encounter) obj;
        if (!Objects.equals(this.encounterType, other.encounterType)) {
            return false;
        }
        if (!Objects.equals(this.getSolution, other.getSolution)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EncounterScene{" + "encounterType=" + encounterType + ", getSolution=" + getSolution + '}';
    }
   
   
}
