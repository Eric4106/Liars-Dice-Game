/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liars.dice;

// @author 710568

public class Player {
    boolean end = false;
    int pAmount = 0;
    int pNumber = 0;
    int cAmount = 0;
    int cNumber = 0;
    String pBet = null;
    String cBet = null;
    int[] pDice = new int[6];
    int[] cDice = new int[6];
    int[] cTotal = new int[6];
    int[] total = new int[6];
    public Player() {
        for (int i = 0; i < pDice.length; i++) {
            pDice[i] = randDie();
            if (pDice[i] == 1) {
                total[0]++;
            }
            else if (pDice[i] == 2) {
                total[1]++;
            }
            else if (pDice[i] == 3) {
                total[2]++;
            }
            else if (pDice[i] == 4) {
                total[3]++;
            }
            else if (pDice[i] == 5) {
                total[4]++;
            }
            else {
                total[5]++;
            }
        }
        for (int i = 0; i < cDice.length; i++) {
            cDice[i] = randDie();
            if (cDice[i] == 1) {
                total[0]++;
                cTotal[0]++;
            }
            else if (cDice[i] == 2) {
                total[1]++;
                cTotal[1]++;
            }
            else if (cDice[i] == 3) {
                total[2]++;
                cTotal[2]++;
            }
            else if (cDice[i] == 4) {
                total[3]++;
                cTotal[3]++;
            }
            else if (cDice[i] == 5) {
                total[4]++;
                cTotal[4]++;
            }
            else {
                total[5]++;
                cTotal[5]++;
            }
        }
    }
    
    public int randDie() {
        int rand = (int) ((Math.random() * 6) + 1);
        return rand;
    }
    
    public void cThink() {
        if (pAmount > cTotal[pNumber - 1] + (int) ((Math.random() * 3) + 1)) {
            cBet = "call";
        }
        else {
            cBet = "bet";
            if (pAmount < 3) {
                cAmount = 3;
                cNumber = cLargest();
            }
        }
        if (cNumber < pNumber) {
            cNumber = pNumber + 1;
        }
        if (cAmount <= pAmount) {
            cAmount = pAmount + 1;
        }
    }
    
    public int cLargest() {
        int max = 0;
        for (int i = 1; i < cDice.length; i++) {
            if (cDice[i] > max) {
                max = cDice[i];
            }
        }
        return max;
    }
    
    public void pCall() {
        if (cAmount > total[cNumber - 1]) {
            System.out.println("You are correct, the computer was lying.");
            System.out.println("Their were actually only " + total[cNumber - 1] + " total dice of number " + cNumber);
        }
        end = true;
    }
    
    public void cCall() {
        if (pAmount > total[pNumber - 1]) {
            System.out.println("The computer caught you in your lie, you lost.");
            System.out.println("Their were actually only " + total[pNumber - 1] + " total dice of number " + pNumber);
        }
        end = true;
    }
}