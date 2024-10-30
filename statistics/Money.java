public class Money extends Statistics{
    
    public Money() {
        super();
    }
    
    public void moneyDown(int value) {
        statDown(value); 
    }
    
    public void moneyUp(int value) {
        statUp(value);
    }
    
    public int getMoney() {
        return getStat();
    }
}
