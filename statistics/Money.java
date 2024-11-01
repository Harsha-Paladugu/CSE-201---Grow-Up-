/**
* Class: Money
* @author Harsha 
* @version 1.0
* Course : CSE201
* Written: October 30, 2024
*
* Purpose: This class keeps track of the player's money
*/
public class Money extends Statistics{

    /**
     * Initializes a new instance of the Money class with a default stat value of 0.
     */
    public Money() {
        super();
    }

    /**
     * Returns the name of the statistic, which in this case is "Money".
     *
     * @return the name of the statistic, "Money"
     */
    @Override
    public String getStatName() {
        return "Money";
    }
    
    
}
