import java.util.Scanner;

public class Control {
    
    public static enum CHOICE{YES, NO};
    private static Scanner sc = new Scanner(System.in); // Keep Scanner open for reuse

    /**
     * Prompts the player with a question and returns YES or NO based on response
     * @param question the question to be asked.
     * @param player the player object for accessing the menu if requested.
     * @return YES if the player responds with "yes" or "y", NO if "no" or "n".
     */
    public static CHOICE Prompt(String question, Player player) {
        
        while (true) {
            
            // Ask question and collect input
            System.out.println("\n" + question + " Y/N/Menu: ");
            String answer = sc.next();
            
            // If "yes," return YES
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                
                return CHOICE.YES;
            } 
            // If "no," return NO
            else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                
                return CHOICE.NO;
            }
            // If "menu," show stats menu
            else if (answer.equalsIgnoreCase("menu") || answer.equalsIgnoreCase("m")) {
                
                Menu.showStats(player);
            }
            // For invalid input, prompt again
            else {
                
                System.out.println("Input not valid, please try again.");
            }
        }
    }
    
    public static void Print(String text) {
        
        for (int i = 0; i < text.length(); i++) {
            
            System.out.print(text.charAt(i));

            try {
                
                Thread.sleep(20); // Delay in milliseconds (adjust as needed)
            } catch (InterruptedException ex) {
                
                Thread.currentThread().interrupt();
            }
        }

        try{
            
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            
            Thread.currentThread().interrupt();
        }
        System.out.println(); 
        System.out.println();
    }
    
    public static void randomEventHandler(String initialMessage, String positiveMessage, int[] positiveStats, 
            String negativeMessage, int[] negativeStats, int probability, Player player) {
        
        Print(initialMessage);
        
        if(Event.eventOccuring(player, probability)) {
            
            Print(positiveMessage);
            player.changeAllStats(positiveStats);
        } else {
            
            Print(negativeMessage);
            player.changeAllStats(negativeStats);
        }
    }
    
    public static CHOICE choiceEventHandler(String initialMessage, String prompt, String positiveMessage, int[] positiveStats, 
            String negativeMessage, int[] negativeStats, Player player) {
        
        Print(initialMessage);
        CHOICE playerChoice = Prompt(prompt, player);
        
        if(playerChoice == CHOICE.YES) {
            
            Print(positiveMessage);
            player.changeAllStats(positiveStats);
        } else {
            
            Print(negativeMessage);
            player.changeAllStats(negativeStats);
        } 
        
        return playerChoice;
    }

    public static int[] setStatArray(int age, int athletics, int education, int karma, int money) {
        
        return new int[] {age, athletics, education, karma, money};
    }
}
