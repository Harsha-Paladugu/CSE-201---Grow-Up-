public class Main {

    public static void main(String[] args) {
        
        // initialize new player when game starts
        Player player = new Player();
        Event event = new Event();
        Control control = new Control();
        int playerChoice = 0;
        
        // introduce game / instructions
        System.out.println("add intro and tutorial");

        // Starting Infancy
        playInfancyStage(player, event, control, playerChoice);
        
        // Starting Kindergarten
        playKindergartenStage(player, event, control, playerChoice);
    }
    
    private static void playInfancyStage(Player player, Event event, Control control, int playerChoice) {
        
        // start infancy stage
        System.out.println("Infancy Stage: \n\n");
        System.out.println("You have been born.\n");

        // start adoption event
        System.out.println("The doctor has given your parents a form to give you up for adoption.\n");
        
        if(event.eventOccuring(player, 50)) {
            System.out.println("\nYour parents put you up for adoption.\nYou were adopted by a new family.\n");
        } else {
            System.out.println("Your parents decided to raise you.\n");
        } // end adoption event
        

        // start vaccination event
        System.out.println("It is time for your vaccinations, will your parents choose to vaccinate you?\n");
        
        if(event.eventOccuring(player, 50)) {
            System.out.println("Your parents decided to not vaccinate you.\n");
            player.karma.decreaseStat(10);
        } else {
            System.out.println("Your parents chose to vaccinate you.\n");
            player.karma.increaseStat(10);;
        } // end vaccination event
        
        System.out.println("\nFinished with infancy. \n"); // end infancy stage
    }
    
    private static void playKindergartenStage(Player player, Event event, Control control, int playerChoice) {
        
        System.out.println("Starting Kindergarten");

        // Increase age from 0 to 5 when starting kindergarten
        player.age.increaseStat(5); 

        // start friendship event
        playerChoice = control.Prompt("Do you want to make a friend?", player);
        boolean hasFriend = false;
        
        if (playerChoice == 1) {
            player.karma.increaseStat(10);
            System.out.println("You made a friend!");
            hasFriend = true;
        } else {
            player.karma.decreaseStat(10);
            System.out.println("You kept to yourself.");
        } 
        player.age.increaseStat(1); // end friendship event
        
        // start lunch event if player made a friend
        if(hasFriend) {
            System.out.println("It's lunch time, you sit with your friend and he asks for your pretzels.\n");
            playerChoice = control.Prompt("Will you share your pretzels?\n", player);
            
            if(playerChoice == 1) {
                System.out.println("You gave your friend some of your pretzels.\n");
                player.karma.increaseStat(15);
            } else {
                System.out.println("You did not give your friend pretzels, he is now upset. :(\n");
                player.karma.decreaseStat(15);
            }
        }
        player.age.increaseStat(1); // end lunch event
        
        // start fight event
        System.out.println("At recess, a kid comes up to you and steals your ball.\n");
        if(event.eventOccuring(player, 50)) {
            System.out.println("You punched the kid in the face to get your ball back.\n");
            player.karma.decreaseStat(20);
        } else {
            System.out.println("You walked away to avoid a fight.\n");
            player.karma.increaseStat(20);
        }
        player.age.increaseStat(1); // end fight event
    }
}
