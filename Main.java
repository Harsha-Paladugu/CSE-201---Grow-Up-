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
        
        // Starting Highschool
        playHighschoolStage(player, event, control, playerChoice);
        
        // Starting Young Adult Stage
        playYoungAdultStage(player, event, control, playerChoice);
        
        // Starting Adult Stage
        playAdultStage(player, event, control, playerChoice);
        
        // Starting Retirement Stage
        playRetirementStage(player, event, control, playerChoice);
        
        // Starting Afterlife
        playAfterlifeStage(player, event, control, playerChoice);
    }
    
    private static void playInfancyStage(Player player, Event event, Control control, int playerChoice) {
        
        // start infancy stage
        System.out.println("Infancy Stage: \n\n");
        System.out.println("You have been born.\n");

        // start adoption random event
        System.out.println("The doctor has given your parents a form to give you up for adoption.\n");
        
        if(event.eventOccuring(player, 50)) {
            System.out.println("\nYour parents put you up for adoption.\n\nYou were adopted by a new family.\n");
        } else {
            System.out.println("Your parents decided to raise you.\n");
        } // end adoption event
        

        // start vaccination random event
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
            System.out.println("You made a friend!\n");
            hasFriend = true;
        } else {
            player.karma.decreaseStat(10);
            System.out.println("You kept to yourself.\n");
        } 
        player.age.increaseStat(1); // end friendship event
        
        // start lunch event if player made a friend
        if(hasFriend) {
            System.out.println("It's lunch time, you sit with your friend and he asks for your pretzels.\n");
            playerChoice = control.Prompt("Will you share your pretzels?", player);
            
            if(playerChoice == 1) {
                System.out.println("You gave your friend some of your pretzels.\n");
                player.karma.increaseStat(15);
            } else {
                System.out.println("You did not give your friend pretzels, he is now upset. :(\n");
                player.karma.decreaseStat(15);
            }
        }
        player.age.increaseStat(3); // end lunch event
        
        // start fight random event
        System.out.println("\nAt recess, a kid comes up to you and steals your ball.\n");
        
        if(event.eventOccuring(player, 50)) {
            System.out.println("You punched the kid in the face to get your ball back.\n");
            player.karma.decreaseStat(20);
        } else {
            System.out.println("You walked away to avoid a fight.\n");
            player.karma.increaseStat(20);
        }
        player.age.increaseStat(3); // end fight event
        
        // start sports event
        System.out.println("Football season is starting.\n");
        playerChoice = control.Prompt("Do you want to sign up for football?", player);
        
        if(playerChoice == 1) {
            System.out.println("You signed up for football.\n");
            player.athletics.increaseStat(50);
        } else {
            System.out.println("You did not sign up for football.\n");
        }
         player.age.increaseStat(1); // end sports event
         
        // start chores event
         System.out.println("Your mom gave you some chores to do.");
         playerChoice = control.Prompt("Do you want to do your chores?", player);
         
         if(playerChoice == 1) {
             System.out.println("You did your chores.\n");
             player.karma.increaseStat(10);
             player.money.increaseStat(20);
         } else {
             System.out.println("You did not do any chores.\n");
             player.karma.decreaseStat(10);
         }
         player.age.increaseStat(1); // end chores event
    }
    
    private static void playHighschoolStage(Player player, Event event, Control control, int playerChoice){
        
    }
    
    private static void playYoungAdultStage(Player player, Event event, Control control, int playerChoice) {
        
    }
    
    private static void playAdultStage(Player player, Event event, Control control, int playerChoice) {
        
    }
    
    private static void playRetirementStage(Player player, Event event, Control control, int playerChoice) {
        
    }
    
    private static void playAfterlifeStage(Player player, Event event, Control control, int playerChoice) {
        
    }
        
        
}
