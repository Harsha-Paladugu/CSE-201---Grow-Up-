import java.util.Scanner;

public class Control {
    
    private final Scanner sc = new Scanner(System.in);  // Keep Scanner open for reuse

    /**
     * Prompts the player with a question and returns an integer based on the response.
     * @param question the question to be asked.
     * @param player the player object for accessing the menu if requested.
     * @return 1 if the player responds with "yes" or "y", 0 if "no" or "n".
     */
    public int Prompt(String question, Player player) {
        
        while (true) {
            // Ask question and collect input
            System.out.println(question + " Y/N/Menu: ");
            String answer = sc.next();
            
            // If "yes," return 1
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                return 1;
            } 
            // If "no," return 0
            else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                return 0;
            }
            // If "menu," show stats menu
            else if (answer.equalsIgnoreCase("menu") || answer.equalsIgnoreCase("m")) {
                player.menu.showStats();
            }
            // For invalid input, prompt again
            else {
                System.out.println("Input not valid, please try again.");
            }
        }
    }
}
