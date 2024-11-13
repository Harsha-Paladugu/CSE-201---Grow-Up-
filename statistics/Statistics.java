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
     * Change the stat value by the specified amount.
     *
     * @param value the amount to change the stat value by
     */
    public void changeStat(int value) {
        statValue += value;
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
