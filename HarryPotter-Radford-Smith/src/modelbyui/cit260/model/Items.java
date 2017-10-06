/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbyui.cit260.model;

import java.io.Serializable;

/**
 *
 * @author paytonsmith
 */
public class Items implements Serializable {

    public Items() {
    }

    public enum Item {
        invisibility_cloak,
        potions,
        broomstick,
        port_key;

        public static Item getInvisibility_cloak() {
            return invisibility_cloak;
        }

        public static Item getPotions() {
            return potions;
        }

        public static Item getBroomstick() {
            return broomstick;
        }

        public static Item getPort_key() {
            return port_key;
        }
        
        private int itemQuantitity;
    }
