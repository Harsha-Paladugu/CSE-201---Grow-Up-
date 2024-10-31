import java.util.List;

public class Menu {
    private List<Statistics> statistics;

    // Constructor to initialize all statistics
    public Menu(List<Statistics> statistics) {
        this.statistics = statistics;
    }

    // Show all statistics
    public void showStats() {
        System.out.println("\nAll Stats:");
        for (Statistics stat : statistics) {
            System.out.println(stat.getStatName() + ": " + stat.getStatValue());
        }
        System.out.println();
    }
}