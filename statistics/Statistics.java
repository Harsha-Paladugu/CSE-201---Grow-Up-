public abstract class Statistics {
    
    protected int stat;
    
    public Statistics() {
        this.stat = 0;
    }
    
    public void statUp(int value) {
        stat += value;
    }
    
    public void statDown(int value) {
        stat -= value;
    }
    
    public int getStat() {
        return stat;
    }

}
