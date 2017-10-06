/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbyui.cit260.model;
import java.io.Serializable;

/**
 *
 * @author paytonsmith & Connor Radford
 */
public class Items implements Serializable {

    public Items() {
    }

    public enum Item {
        
        Invisibility_Cloak("Invisibility Cloak", "(1)", "Turns character "
                + "invisible for certain creatures."),
        Potions("Potion", "(1)", "Replenish health to your character"),
        Broomstick("Broomstick", "(1)", "Character can fly over an obsticle."),
        Port_Key("Port Key", "(1)", "Teleports character to random location");
        
        private final String itemType;
        private final String itemQuantity;
        private final String requiredItem;

            Item(String itemType, String itemQuantity, String requiredItem) {
                this.itemType = itemType;
                this.itemQuantity = itemQuantity;
                this.requiredItem = requiredItem;
            }

        public String getItemType() {
            return itemType;
        }

        public String getItemQuantity() {
            return itemQuantity;
        }

        public String getRequiredItem() {
            return requiredItem;
        }

        @Override
        public String toString() {
            return "Item{" + "itemType=" + itemType + ", itemQuantity=" + itemQuantity + ", requiredItem=" + requiredItem + '}';
        }
        
        
    }
}
