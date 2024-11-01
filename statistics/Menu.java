import java.util.List;

/**
* This class displays all of the statistics
*/

public class Menu {
    
    private List<Statistics> statistics;

    /**
    * constructs a new menu object with the stastics
    */
    
    public Menu(List<Statistics> statistics) {
        this.statistics = statistics;
    }

    /**
    * Displays all the statistics in this list with the statistic name and value
    */
    
    public void showStats() {
        System.out.println("\nAll Stats:");
        for (Statistics stat : statistics) {
            System.out.println(stat.getStatName() + ": " + stat.getStatValue());
        }
        System.out.println();
    }
}
