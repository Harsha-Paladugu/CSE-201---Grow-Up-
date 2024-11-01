/**
* The athletics class represents the athletics stats the player has. 
* It extends the Statistics class
*/
public class Athletics extends Statistics {

    /**
    * Constructs a new athletics object using the superclass constructor.
    */
    
    public Athletics() {
        super();
    }

    /**
    * Returns the name of Athletics as a string
    *
    * @return the name of the statistics "Athletics"
    
    @Override
    public String getStatName() {
        return "Athletics";
    }
}
