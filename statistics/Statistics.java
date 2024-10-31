/**
 * Represents a base class for tracking various player statistics 
 * throughout the game.
 */
public class Statistics {

    /**
     * Holds the player's statistic value. Initially set to 0.
     */
    protected int stat;

    /**
     * Initializes the statistic to zero.
     */
    public Statistics() {
        this.stat = 0;
    }

    /**
     * Increases the statistic by a specified value.
     * @param value the amount to add to the statistic.
     */
    public void statUp(int value) {
        stat += value;
    }

    /**
     * Decreases the statistic by a specified value.
     * @param value the amount to subtract from the statistic.
     */
    public void statDown(int value) {
        stat -= value;
    }

    /**
     * Retrieves the current statistic value.
     * @return the current value of the statistic.
     */
    public int getStat() {
        return stat;
    }
}
