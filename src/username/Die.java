/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * Die class
 * Name: Amos Li
 * Last Updated: 9/12/2024
 */
package username;
/**
 *The die class represents a die with a signed number of sides.
 *It provides method to roll the die and provide the current value.
 */
public class Die {
    private final int numSides;
    private int currentValue = 0;
    private final int minSide = 2;
    private final int maxSide = 100;

    Die(int numSides){
        this.numSides = numSides;
        if(numSides < minSide || numSides > maxSide){
            throw new IllegalArgumentException("illegal number of sides: "+ numSides);
        }
    }
    int getCurrentValue(){
        roll();
        if(currentValue ==0 || currentValue > numSides){
            throw new DieNotRolledException("Die has not been rolled yet.");
        }
        int value = currentValue;
        currentValue = 0;
        return value;
    }

    private void roll(){
        currentValue = (int)(Math.random()*numSides+1);
    }
}