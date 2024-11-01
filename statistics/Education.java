/**
 * The Education class represents an education statistic and extends the Statistics class.
 */
public class Education extends Statistics {

    /**
     * Constructs a new education object with default values by calling the superclass constructor.
     */
    public Education() {
        super();
    }

    /**
     * Returns the name of the statistic as a string.
     *
     * @return the name of this statistic, which is "Education".
     */
    
    @Override
    public String getStatName() {
        return "Education";
    }
    /**
     * Represents the action of dropping out of school.
     *
     * @param droppedOut boolean a boolean indicating whether the player has decided to drop out
     * @return droppedOut
     */
    
    public boolean dropOut(boolean droppedOut) {
        return droppedOut;
    }

    /**
    * Grades a test based on the value
    *
    * @param value representing the score
    * @return false current placeholder
    */
    public boolean gradeTest(int value) {
        return false;
    }
}
