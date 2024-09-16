/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * Main Driver class
 * Name: Amos Li
 * Last Updated: 9/12/2024 splita
 */
package username;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Driver {

    public static final int MIN_DICE = 2;
    public static final int MAX_DICE = 10;

    private static int[] getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter configuration:");
        String strConf = sc.nextLine();
        String[] dieStrData = strConf.split(" ", 3);
        int[] dieIntData = new int[dieStrData.length];
        for(int i: dieIntData){
            dieIntData[i] = Integer.parseInt(dieStrData[i]);
        }
        return dieIntData;
    }

    private static Die[] createDice(int numDice, int numSides) {
        Die[] dice = new Die[numDice];
        for (Die aDie : dice) {
            aDie = new Die(numSides);
        }
        return dice;
    }

    private static int[] rollDice(Die[] dice, int numSides, int numRolls) {
        int rollsLength = (numSides - 1) * dice.length + 1;
        int[] rolls = new int[rollsLength];
        for(int i = 0; i < numRolls; i++) {
            int value = 0;
            for (Die aDie : dice) {
                value += aDie.getCurrentValue();
            }
            rolls[value - dice.length]++;
        }
        return rolls;
    }

       //int findMax();

    public static void main(String[] args) {
        System.out.println("Please enter the number of dice to roll, " +
                "how many sides the dice have,/n and how many rolls to" +
                " complete, separating the values by a space." +
                "\nExample: \"2 6 1000\"\n");
        int[] input = getInput();
        Die[] dice = createDice(5, 5);
        int[] rollDice = rollDice(dice, 5, 10);
        System.out.println(rollDice);
    }
}