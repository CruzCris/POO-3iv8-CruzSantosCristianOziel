/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.io.Serializable;

/**
 *
 * @author crist
 */
public class Player implements Serializable{
    
    String gt;
    int edad;
    int score;
    
    public Player(){
        
    }

    public Player(String gt, int edad, int score) {
        this.gt = gt;
        this.edad = edad;
        this.score = score;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    
}
