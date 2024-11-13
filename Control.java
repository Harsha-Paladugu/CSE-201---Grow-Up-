import java.util.Scanner;

public class Control {

    private static Scanner sc = new Scanner(System.in); // Keep Scanner open for reuse

    /**
     * Handles user response, supporting both "yes" and custom answers.
     */
    private static boolean getUserResponse(String question, String positiveResponse, boolean yesNoOnly, Player player) {
        while (true) {
            System.out.println("\n" + question + " Y/N/Menu: ");
            String answer = sc.next();

            if (yesNoOnly) { // For Prompt with "yes" or "no" answers
                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                    return true;
                } else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                    return false;
                } else if (answer.equalsIgnoreCase("menu") || answer.equalsIgnoreCase("m")) {
                    Menu.showStats(player);
                } else {
                    System.out.println("Input not valid, please try again.");
                }
            } else { // For custom answers
                if (answer.equalsIgnoreCase(positiveResponse.trim())) {
                    return true;
                } else if (answer.equalsIgnoreCase("menu") || answer.equalsIgnoreCase("m")) {
                    Menu.showStats(player);
                } else {
                    System.out.println("Incorrect answer");
                    return false;
                }
            }
        }
    }

    /**
     * Prompts the player with a question and returns true for "yes" or "y".
     */
    public static boolean Prompt(String question, Player player) {
        return getUserResponse(question, null, true, player);
    }

    /**
     * Prompts the player with a custom correct answer.
     */
    public static boolean promptCustomInput(String question, String correctAnswer, Player player) {
        return getUserResponse(question, correctAnswer, false, player);
    }

    /**
     * Prints text with a delay between each character.
     */
    public static void Print(String text) {
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(1); // Adjust as needed
            }
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("\n");
    }

    /**
     * Handles a random event with probability.
     */
    public static void randomEventHandler(String initialMessage, String positiveMessage, int[] positiveStats,
                                          String negativeMessage, int[] negativeStats, int probability, Player player) {
        Print(initialMessage);

        if (Event.eventOccuring(player, probability)) {
            Print(positiveMessage);
            player.changeAllStats(positiveStats);
        } else {
            Print(negativeMessage);
            player.changeAllStats(negativeStats);
        }
    }

    /**
     * Generalized event handler for choice and custom events.
     */
    private static boolean eventHandler(String initialMessage, String prompt, String correctAnswer, String positiveMessage,
                                        int[] positiveStats, String negativeMessage, int[] negativeStats, Player player, boolean yesNoOnly) {

        Print(initialMessage);
        boolean choice = yesNoOnly ? Prompt(prompt, player) : promptCustomInput(prompt, correctAnswer, player);

        if (choice) {
            Print(positiveMessage);
            player.changeAllStats(positiveStats);
        } else {
            Print(negativeMessage);
            player.changeAllStats(negativeStats);
        }

        return choice;
    }

    /**
     * Handles choice-based events with YES/NO responses.
     */
    public static boolean choiceEventHandler(String initialMessage, String prompt, String positiveMessage, int[] positiveStats,
                                             String negativeMessage, int[] negativeStats, Player player) {
        return eventHandler(initialMessage, prompt, "", positiveMessage, positiveStats, negativeMessage, negativeStats, player, true);
    }

    /**
     * Handles custom events with a specific correct answer.
     */
    public static boolean customEventHandler(String initialMessage, String prompt, String correctAnswer, String positiveMessage,
                                             int[] positiveStats, String negativeMessage, int[] negativeStats, Player player) {
        return eventHandler(initialMessage, prompt, correctAnswer, positiveMessage, positiveStats, negativeMessage, negativeStats, player, false);
    }

    /**
     * Sets stats in an array format for easy use across events.
     */
    public static int[] setStatArray(int age, int athletics, int education, int karma, int money) {
        return new int[] {age, athletics, education, karma, money};
    }
}
