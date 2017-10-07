/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paytonsmith
 */
public enum Spells{
    
    Spell_One ("Expecto_Patronum", "This is the spell to defeat dementors."),
    Spell_Two ("Lumos", "Use this spell to light up the area"),
    Spell_Three ("Incendio" , "This spell creates fire."),
    Spell_Four ("Wingardium Leviosa", "This spell can lift large objects."),
    Spell_Five ("Accio", "This spell can summon the things that you need.");
    
    
    
private final String name;   
private final String description;
  
Spells(String name, String description) {
this.name = name;
this.description = description;
}

    public static Spells getSpell_One() {
        return Spell_One;
    }

    public static Spells getSpell_Two() {
        return Spell_Two;
    }

    public static Spells getSpell_Three() {
        return Spell_Three;
    }

    public static Spells getSpell_Four() {
        return Spell_Four;
    }

    public static Spells getSpell_Five() {
        return Spell_Five;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Spells{" + "name=" + name + ", description=" + description + '}';
    }

}
