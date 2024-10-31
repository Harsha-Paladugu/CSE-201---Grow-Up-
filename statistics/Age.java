public class Age extends Statistics{
    
    public Age() {
        super();
    }
    
    public void ageUp(int value) { 
        statUp(value);  
    }
    
    public int getAge() { 
        return getStat();
    }
    
    public void die() { 
        stat = -1;
    }
    
    public boolean isDead() {
        
        if(stat == -1) {
            return true;
        } else {
            return false;
        }
    }      
}
