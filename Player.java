/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liars.dice;

// @author 710568

public class Player {
    int[] dice = new int[5];
    public Player() {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = randDie();
        }
    }
    
    public static int randDie() {
        int rand = (int) ((Math.random() * 6) + 1);
        return rand;
    }
}