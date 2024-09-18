/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * DieNotRolledException class
 * Name: Amos Li
 * Last Updated: 9/17/2024
 */

package amosli;

/**
 *This exception is throw when an attempt is made to use a die that have not been rolled
 *This class extends @NumberFormatException to indicate this exception is a number format issue.
 */
public class DieNotRolledException extends RuntimeException {

    /**
     * Constructs a new DieNotRolledException class with the detailed message.
     * @param message The message to tell people the die is not rolled
     */
    public DieNotRolledException(String message) {
        super(message);
    }

    /**
     * Gets the detailed message.
     * @return The detailed string message.
     */
    public String getMessage(){
        return super.getMessage();
    }
}
