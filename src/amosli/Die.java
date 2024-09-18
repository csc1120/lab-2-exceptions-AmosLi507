/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * Die class
 * Name: Amos Li
 * Last Updated: 9/17/2024
 */

package amosli;

import java.util.Random;

/**
 *The die class represents a die with a signed number of sides.
 *It provides method to roll the die and provide the current value.
 */
public class Die {
    /**
     * The minimum side of a die is 2.
     */
    public static final int MIN_SIDES = 2;
    /**
     * The maximum of the side is 100.
     */
    public static final int MAX_SIDES = 100;
    private int currentValue;
    private final int numSides;
    private final Random random;

    /**
     * Constructs a die with certain number of sides.
     * @param numSides The number of sides must between 2-100.
     * @throws IllegalArgumentException if numSides is out of range
     */
    public Die(int numSides){
        if(numSides < MIN_SIDES || numSides > MAX_SIDES) {
            throw new IllegalArgumentException("Bad die creation: " +
                    "illegal number of sides: " + numSides);
        }
        this.currentValue = 0;
        this.numSides = numSides;
        this.random = new Random();
    }

    /**
     * Gets the current value of the die.
     * @return the rolled value of the die.
     * @throws DieNotRolledException if the die is not rolled and the current value is 0.
     */
    public int getCurrentValue(){
        if(currentValue ==0){
            throw new DieNotRolledException("Die has not been rolled yet.");
        }
        int value = currentValue;
        currentValue = 0;
        return value;
    }

    /**
     * Rolls the die by randomly generating a number between the range.
     */
    public void roll(){
        currentValue = random.nextInt(numSides) + 1;
    }
}