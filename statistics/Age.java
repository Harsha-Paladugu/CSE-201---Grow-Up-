
public class Age extends Statistics{
    
    public Age() {
        super();
    }
    
    @Override
    public String getStatName() {
        return "Age";
    }

    
    public void die() { 
        statValue = -1;
    }
    
    public boolean isDead() {
        
        if(statValue == -1) {
            return true;
        } else {
            return false;
        }
    }    
}
