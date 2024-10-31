public class Main {

    public static void main(String[] args) {
        
        // initialize new player when game starts
        Player player = new Player();
        Event event = new Event();
        Control control = new Control();
        
        // introduce game / instructions
        System.out.println("add intro and tutorial");

        // Starting Infancy
        playInfancyStage(player, event);
        
        // Starting Kindergarten
        playKindergartenStage(player, control);
    }
    
    private static void playInfancyStage(Player player, Event event) {
        
        System.out.println("Infancy Stage: \n");

        // Random event for adoption
        event.randomEvent(0, player.karma.getStatValue());
        System.out.println("fill in later");

        // Random event for vaccination
        event.randomEvent(0, player.karma.getStatValue());
        System.out.println("fill in later");
        
        // end Infancy
        System.out.println("\nFinished with infancy. \n");
    }
    
    private static void playKindergartenStage(Player player, Control control) {
        
        System.out.println("Starting Kindergarten");

        // Increase age from 0 to 5 when starting kindergarten
        player.age.increaseStat(5); 

        // Prompt player to make a choice about friendship
        int playerChoice = control.Prompt("Do you want to make a friend?", player);

        if (playerChoice == 1) {
            player.karma.increaseStat(10);
            System.out.println("You made a friend!");
        } else {
            player.karma.decreaseStat(10);
            System.out.println("You kept to yourself.");
        }
    }
}
