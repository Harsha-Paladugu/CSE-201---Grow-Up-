/**
* Class: Statistics
* @author Harsha
* @version 1.0
* Course : CSE201
* Written: October 30th, 2024
*
* Purpose: – This is an abstract class that outlines what methods each child class should have
*/
public abstract class Statistics {

    /**
     * The current value of the statistic.
     */
    protected int statValue;

    /**
     * Initializes a new instance of the Statistics class with a default stat value of 0.
     */
    public Statistics() {
        this.statValue = 0;
    }

    /**
     * Increases the stat value by the specified amount.
     *
     * @param value the amount to increase the stat value by
     */
    public void increaseStat(int value) {
        statValue += value;
    }

    /**
     * Decreases the stat value by the specified amount.
     *
     * @param value the amount to decrease the stat value by
     */
    public void decreaseStat(int value) {
        statValue -= value;
    }

    /**
     * Returns the current value of the statistic.
     *
     * @return the current stat value
     */
    public int getStatValue() {
        return statValue;
    }

    /**
     * Resets the stat value to 0.
     */
    public void resetStat() {
        this.statValue = 0;
    }

    /**
     * Returns the name of the statistic.
     * This method must be implemented by subclasses to provide a unique name for each statistic type.
     *
     * @return the name of the statistic
     */
    public abstract String getStatName();
}
