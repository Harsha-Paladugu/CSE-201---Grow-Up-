public class Athletics extends Statistics{
    
    public Athletics() {
        super();
    }
    
    public void athleticsUp(int value) {     
        statUp(value);
    }
    
    public int getAthletics() {
       return getStat();
    }
    
    public void loseAllAthletics() {
        stat = 0;  
    }
    
    public void athleticsDown(int value) {
        statDown(value);  
    }
}
