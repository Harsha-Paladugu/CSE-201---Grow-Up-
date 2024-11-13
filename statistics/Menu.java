/**
 * This class displays all of the statistics
 */
public class Menu {

    /**
     * Displays all the statistics in this array with the statistic name and value
     */
    public static void showStats(Player player) {
        
        System.out.println("\nAll Stats:");
        
        for (Statistics stat : player.statList) {
            
            System.out.println(stat.getStatName() + ": " + stat.getStatValue());
        }
        System.out.println();
    }
}