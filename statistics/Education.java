
public class Education extends Statistics {
    
    public Education() {
        super();
    }
    
    @Override
    public String getStatName() {
        return "Education";
    }
    
    public boolean dropOut(boolean droppedOut) {
        return droppedOut;
    }
    
    public boolean gradeTest(int value) {
        return false;
    }
}
