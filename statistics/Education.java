
public class Education extends Statistics {
    
    public Education() {
        super();
    }
    
    public void educationUp(int value) {
        statUp(value);
    }
    
    public int getEducation() {
        return getStat();
    }
    
    public void educationDown(int value) {
        statDown(value);
    }
    
    public boolean dropOut(boolean droppedOut) {
        return droppedOut;
    }
    
    public boolean gradeTest(int value) {
        return false;
    }
}
