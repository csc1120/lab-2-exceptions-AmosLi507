/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * DieNotRolledException class
 * Name: Amos Li
 * Last Updated: 9/12/2024
 */
package username;

/**
 *This exception is throw when an attempt is made to use a die that have not been rolled
 *This class extends @NumberFormatException to indicate this exception is a number format issue.
 */
public class DieNotRolledException extends RuntimeException {
    /**
     * The DieNotRolledException is a custom exception that is thrown when
     * the die is not rolled
     * @param message The message to tell people the die is not rolled
     */
    public DieNotRolledException(String message) {
        super(message);
    }
    public String getMessage(){
        return super.getMessage();
    }
}
