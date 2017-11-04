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

    public enum Item{
    

    /*    public enum Item {*/        
        Invisibility_Cloak("Invisibility Cloak", "(1)", "Turns character "
                + "invisible for certain creatures."),
        Potions("Potion", "(1)", "Replenish health to your character"),
        Broomstick("Broomstick", "(1)", "Character can fly over an obsticle."),
        Port_Key("Port Key", "(1)", "Teleports character to random location");

    public static void useMaraudersMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void useInvisibilityCloak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void eatChocolateFrog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void useBroomstick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        private final String itemType;
        private final String itemQuantity;
        private final String requiredItem;
        private Game game;
        private Game[] games = new Game[1];
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
        
        

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }
        
        

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
        
        

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

