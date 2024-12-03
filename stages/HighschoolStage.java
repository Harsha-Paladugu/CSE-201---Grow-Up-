public class HighschoolStage {
    
    public static void playHighschoolStage(Player player){
        
        Control.Print("Starting Highschool");
        
        
        boolean playingSports = false;
        boolean hasJob = false;
        
        
        
        // Start sports event
        if(player.athletics.getStatValue() >= 5) {
        Main.positiveStats = Control.setStatArray(1, 25, 0, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
        
        Control.choiceEventHandler(
                "Your friends are all signing up for the school football team.", // Initial message
                "Do you want to try out for highschool football?", // Prompt for Yes/No choice
                "You joined the football team! Your athletic skills improved.", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You decided not to join the football team.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End sports event
        playingSports = true;
        }
        else {
            Main.positiveStats = Control.setStatArray(1, 0, 0, 0, 0);
            Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
            
            Control.choiceEventHandler(
                    "Your friends are all signing up for the school football team.", // Initial message
                    "Do you want to try out for highschool football?", // Prompt for Yes/No choice
                    "You tried out for the football team but you failed!", // Message if Yes
                    Main.positiveStats, // Stat changes if Yes
                    "You decided not to join the football team.", // Message if No
                    Main.negativeStats, // Stat changes if No
                    player); // End sports event
        }
        
        
        Main.positiveStats = Control.setStatArray(1, 0, 0, -10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 10, 0);
        
        Main.playerChoice = Control.choiceEventHandler(
                "Your friends invited you to sneak out to a party.", // Initial message
                "Do you want to go to the party?", // Prompt for Yes/No choice
                "You decided to go to the party.", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You decided not to go to the party.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End sports event
        
        if(Main.playerChoice == true) {
            Main.positiveStats = Control.setStatArray(1, 25, 0, 0, 0);
            Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
            
            Main.playerChoice = Control.choiceEventHandler(
                    "You are offered alcohol at the party.", // Initial message
                    "Do you want to drink?", // Prompt for Yes/No choice
                    "You drank at the party!", // Message if Yes
                    Main.positiveStats, // Stat changes if Yes
                    "You decided not to drink at the party.", // Message if No
                    Main.negativeStats, // Stat changes if No
                    player); // End sports event
        } else {
            player.age.changeStat(Main.positiveStats[0]);
        } // End lunch event
        
        
        
        Main.positiveStats = Control.setStatArray(1, 0, 0, -10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 10, 0);
        Control.randomEventHandler(
                "You passed by your crush in the hallway and decided to finally ask them out.", // Initial Message
                "They accepted and became your significant other!", // Message if event happens
                Main.positiveStats, // Stat changes if event happens
                "You got rejected. :( ", // Message if event does not happen
                Main.negativeStats, // Stat changes if event does not happen
                0, // probability
                player); // End random fight event 
        
        
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, 2000);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
        
        Main.playerChoice =Control.choiceEventHandler(
                "You need money to buy things!", // Initial message
                "Do you want to get a job?", // Prompt for Yes/No choice
                "You got a job at a local pizza place!", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You decided not to get a job.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End sports event
        if(Main.playerChoice == true) {
            hasJob = true;
        }
        
        
        Main.positiveStats = Control.setStatArray(1, 0, 25, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
        
        Control.choiceEventHandler(
                "There is a big test coming up... but there is also another party tonight.", // Initial message
                "Do you want to study?", // Prompt for Yes/No choice
                "You studied hard!", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You went to the party instead.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End sports event
        
        
        Main.positiveStats = Control.setStatArray(1, 0, 0, 10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0);
        
        Main.playerChoice = Control.choiceEventHandler(
                "Your school is asking for volunteers for the local soup kitchen.", // Initial message
                "Do you want to volunteer?", // Prompt for Yes/No choice
                "You are going to help so many people!", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "Wow...", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End sports event
        
        if(Main.playerChoice == true) {
            Main.positiveStats = Control.setStatArray(1, 0, 0, 10, 0);
            Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0);
            Control.randomEventHandler(
                    "You have to dish out meals to the homeless.", // Initial Message
                    "You left many people satisfied.", // Message if event happens
                    Main.positiveStats, // Stat changes if event happens
                    "You spilled boiling soup on a homeless man! ", // Message if event does not happen
                    Main.negativeStats, // Stat changes if event does not happen
                    0, // probability
                    player); // End random fight event 
        }
        
        if(playingSports) {
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, 0);
        Main.negativeStats = Control.setStatArray(1, -5000, 0, 0, 0);
        Control.randomEventHandler(
                "You took a hard hit during a football game.", // Initial Message
                "It only left a scratch though.", // Message if event happens
                Main.positiveStats, // Stat changes if event happens
                "You broke your femur! You can never play sports again. :( ", // Message if event does not happen
                Main.negativeStats, // Stat changes if event does not happen
                0, // probability
                player); // End random fight event 
        }
        
        
        Main.positiveStats = Control.setStatArray(1, 0, 20, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, -5, 0, 0);
        
        if(Event.eventOccuring(player, 100)) {
            
            Control.customEventHandler(
                "Your teacher has given a pop quiz.",
                "What is the capital of Ohio? (Hint: It starts with a capital C)",
                "Columbus",
                "You aced the quiz.",
                Main.positiveStats,
                "You failed the quiz.", 
                Main.negativeStats, 
                player);
        } // end pop quiz random event
        
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, -3000);
        
        Control.choiceEventHandler(
                "You are very tired of walking everywhere", // Initial message
                "Do you want to buy your first car for $3000?", // Prompt for Yes/No choice
                "Vroom!", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You still have to walk.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End sports event
        
     
        Main.positiveStats = Control.setStatArray(1, 0, 20, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
        
        Control.choiceEventHandler(
                "There is a really really big test coming up.", // Initial message
                "Do you want to study?", // Prompt for Yes/No choice
                "You studied hard!", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You played video games instead.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End sports event
        
        if(hasJob == true) {
            Main.positiveStats = Control.setStatArray(1, 0, 0, 10, 0);
            Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0);
            Control.randomEventHandler(
                    "You burnt a pizza at work.", // Initial Message
                    "You decided to make a new one.", // Message if event happens
                    Main.positiveStats, // Stat changes if event happens
                    "You gave it to the customer anyway. ", // Message if event does not happen
                    Main.negativeStats, // Stat changes if event does not happen
                    0, // probability
                    player); // End random fight event 
        }
        
        
        
    }
    
}
