/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liars.dice;

// @author 710568

import java.util.Scanner;

public class LiarsDice {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Player player = new Player();
        System.out.println("The game is Liar's Dice. You and your oponent roll dice and bet on how many");
        System.out.println("of what number on how many of what number of dice their are in each hand in total.");
        System.out.println("You and your oponent each have five dice and you have to bet on how many and of which");
        System.out.println("dice you think their are amoung all of the hands in all of the players' hands.");
        System.out.println("You can only bet a value higher then the previous dice value or any dice value of a higher number.");
        System.out.println("If you think your oponent is lying, then you can call. If you are correct, you win.");
        System.out.println("To bet, type 'bet', then type the amount of dice, then the type of dice you think are on the board");
        System.out.println("If you think your oponent is a liar, then just type 'call'.");
        System.out.println("");
        System.out.println("You roll your dice,");
        System.out.println("");
        System.out.println("Your dice read "+ player.dice[0] +", "+ player.dice[1] +", "+ player.dice[2] +", "+ player.dice[3] +", and "+ player.dice[4]);
        boolean end = false;
        while (!end) {
            String commandInput = kb.nextLine();
            if (commandInput.equals("bet")) {
                
            }
            else if (commandInput.equals("call")) {
                
            }
            else {
                System.out.println("That is not a valid function.");
            }
        }
    }
}
