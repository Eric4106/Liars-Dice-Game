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
        System.out.println("To bet, type 'bet', then type the amount of dice, then the type of dice you think are on the board.");
        System.out.println("If you think your oponent is a liar, then just type 'call'.");
        System.out.println("");
        System.out.println("You roll your dice,");
        System.out.println("");
        System.out.println("Your dice read "+ player.pDice[0] +", "+ player.pDice[1] +", "+ player.pDice[2] +", "+ player.pDice[3] +", and "+ player.pDice[4]+ ".");
        System.out.println("");
        while (!player.end) {
            player.pBet = kb.nextLine();
            if (player.pBet.equals("bet")) {
                System.out.println("How many of the dice number do you want to bet?");
                player.pAmount = kb.nextInt();
                System.out.println("What dice number do you want to bet?");
                player.pNumber = kb.nextInt();
                player.cThink();
                if (player.cBet.equals("call")) {
                    System.out.println("The Computer thinks you're a liar and says 'call'");
                    player.cCall();
                }
                else {
                    System.out.println("The computer says their are " + player.cAmount + " dice of " + player.cNumber + ".");
                }
            }
            else if (player.pBet.equals("call")) {
                System.out.println("You call the computer's bluff.");
                player.pCall();
            }
        }
    }
}
