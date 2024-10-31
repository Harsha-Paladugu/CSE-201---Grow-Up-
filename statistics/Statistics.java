public abstract class Statistics {
    
    protected int statValue;
    
    public Statistics() {
        this.statValue = 0;
    }
    
    public void increaseStat(int value) {
        statValue += value;
    }
    
    public void decreaseStat(int value) {
        statValue -= value;
    }
    
    public int getStatValue() {
        return statValue;
    }
    
    public void resetStat() {
        this.statValue = 0;
    }
    
    public abstract String getStatName();
}
