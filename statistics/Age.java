/**
 * The Age class represents an age statistic and extends the Statistics class.
 */
public class Age extends Statistics {
    
    /**
     * Constructs a new age object with default values by calling the superclass constructor.
     */
    public Age() {
        super();
    }
    
    /**
     * Returns the name of the statistic as a string.
     *
     * @return the name of this statistic, which is "Age".
     */
    @Override
    public String getStatName() {
        return "Age";
    }

    /**
     * Marks the statistic as "dead" by setting its statsValue to -1.
     * This value indicates that the age statistic is no longer active.
     */
    public void die() { 
        statValue = -1;
    }
    
    /**
     * Checks if the statistic is marked as "dead."
     *
     * @return true if the statistic is equal to -1
     *         false otherwise.
     */
    public boolean isDead() {
        return statValue == -1;
    }    
}
