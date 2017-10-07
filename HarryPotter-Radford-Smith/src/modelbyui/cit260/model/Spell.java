package modelbyui.cit260.model;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paytonsmith
 */
public enum Spell{
    
    Spell_One ("Expecto_Patronum", "This is the spell to defeat dementors."),
    Spell_Two ("Lumos", "Use this spell to light up the area"),
    Spell_Three ("Incendio" , "This spell creates fire."),
    Spell_Four ("Wingardium Leviosa", "This spell can lift large objects."),
    Spell_Five ("Accio", "This spell can summon the things that you need.");
    
    
    
private final String name;   
private final String description;
private Game game;
private Game[] games = new Game[1];
private Scene scene;
private ArrayList<Scene> scenes = new ArrayList<Scene>();

    public <any> Spell() {
        return scenes;
    }

    public void setScenes(<any> scenes) {
        this.scenes = scenes;
    }



    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
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


  
Spell(String name, String description) {
this.name = name;
this.description = description;
}

    public static Spell getSpell_One() {
        return Spell_One;
    }

    public static Spell getSpell_Two() {
        return Spell_Two;
    }

    public static Spell getSpell_Three() {
        return Spell_Three;
    }

    public static Spell getSpell_Four() {
        return Spell_Four;
    }

    public static Spell getSpell_Five() {
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
