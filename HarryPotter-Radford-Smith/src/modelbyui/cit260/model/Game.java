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
public class Game implements Serializable {

    private int totalMoves;
    private Actor actor;

    public Game() {
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public int getTotalMoves() {
        return totalMoves;
    }

    public void setTotalMoves(int totalMoves) {
        this.totalMoves = totalMoves;
    }

    @Override
    public String toString() {
        return "Game{" + "totalMoves=" + totalMoves + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.totalMoves;
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
        final Game other = (Game) obj;
        if (this.totalMoves != other.totalMoves) {
            return false;
        }
        return true;
    }

    public Game(int totalMoves) {
        this.totalMoves = totalMoves;
    }

}
