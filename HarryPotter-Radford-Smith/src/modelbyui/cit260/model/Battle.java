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
public class Battle implements Serializable{
    
    public String enemyType;
    public String enemyWeakness;
    private Item item;
    private ArrayList<Item> items = new ArrayList<Item>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    
    
    

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public String getEnemyWeakness() {
        return enemyWeakness;
    }

    public void setEnemyWeakness(String enemyWeakness) {
        this.enemyWeakness = enemyWeakness;
    }

    public Battle(String enemyType, String enemyWeakness) {
        this.enemyType = enemyType;
        this.enemyWeakness = enemyWeakness;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.enemyType);
        hash = 67 * hash + Objects.hashCode(this.enemyWeakness);
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
        final Battle other = (Battle) obj;
        if (!Objects.equals(this.enemyType, other.enemyType)) {
            return false;
        }
        return Objects.equals(this.enemyWeakness, other.enemyWeakness);
    }

    @Override
    public String toString() {
        return "BattleScene{" + "enemyType=" + enemyType + ", enemyWeakness=" + enemyWeakness + '}';
    }
    
    
}
