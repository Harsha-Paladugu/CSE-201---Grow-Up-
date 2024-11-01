/**
 * The Karma class represents a karma statistic and extends the Statistics class.
 */

public class Karma extends Statistics{

    /**
     * Constructs a new karma object with default values by calling the superclass constructor.
     */
        
        public Karma() {
            super();
        }
    /**
     * Returns the name of the statistic as a string.
     *
     * @return the name of this statistic, which is "Karma".
     */
        
        @Override
        public String getStatName() {
            return "Karma";
        }
}
