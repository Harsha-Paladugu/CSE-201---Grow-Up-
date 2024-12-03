public class HighschoolStage {
    
    public static void playHighschoolStage(Player player){
        
        Control.Print("Starting Highschool");
        
        boolean playingSports = false;
        boolean hasJob = false;
        
        //Determine if the player can get on the football team
        if(player.athletics.getStatValue() >= 5) {
            Main.positiveStats = Control.setStatArray(1, 25, 0, 0, 0);
            Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
            
            Control.choiceEventHandler(
                "Your friends are all signing up for the school football team.", // Prompt about joining football
                "Do you want to try out for highschool football?", // Choice to try out
                "You joined the football team! Your athletic skills improved.", // Success message
                Main.positiveStats, // Stat changes for success
                "You decided not to join the football team.", // Decline message
                Main.negativeStats, // Stat changes for decline
                player);
            playingSports = true;
        } else {
            Main.positiveStats = Control.setStatArray(1, 0, 0, 0, 0);
            Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
            
            Control.choiceEventHandler(
                "Your friends are all signing up for the school football team.", // Prompt about joining football
                "Do you want to try out for highschool football?", // Choice to try out
                "You tried out for the football team but you failed!", // Failure message
                Main.positiveStats, // Stat changes for trying
                "You decided not to join the football team.", // Decline message
                Main.negativeStats, // Stat changes for decline
                player);
        }
        
        //Party invitation event
        Main.positiveStats = Control.setStatArray(1, 0, 0, -10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 10, 0);
        
        Main.playerChoice = Control.choiceEventHandler(
                "Your friends invited you to sneak out to a party.", // Prompt about attending a party
                "Do you want to go to the party?",
                "You decided to go to the party.", // Message if attending
                Main.positiveStats, // Stat changes for attending
                "You decided not to go to the party.", // Message if declining
                Main.negativeStats, // Stat changes for declining
                player);

        //Offer at the party
        if(Main.playerChoice) {
            Main.positiveStats = Control.setStatArray(1, 25, 0, 0, 0);
            Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
            
            Main.playerChoice = Control.choiceEventHandler(
                "You are offered alcohol at the party.", // Prompt about drinking
                "Do you want to drink?", // Yes/No choice
                "You drank at the party!", // Message for drinking
                Main.positiveStats, // Stat changes for drinking
                "You decided not to drink at the party.", // Message for declining
                Main.negativeStats, // Stat changes for declining
                player);
        } else {
            player.age.changeStat(Main.positiveStats[0]);
        }
        
        // Asking out a crush
        Main.positiveStats = Control.setStatArray(1, 0, 0, -10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 10, 0);
        Control.randomEventHandler(
                "You passed by your crush in the hallway and decided to finally ask them out.", //Asking out message 
                "They accepted and became your significant other!", // Success message
                Main.positiveStats, // Stat changes for success
                "You got rejected. :( ", // Failure message
                Main.negativeStats, // Stat changes for failure
                0, // Event probability
                player);
        
        // Decision to get a job
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, 2000);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
        
        Main.playerChoice = Control.choiceEventHandler(
                "You need money to buy things!", // Prompt about getting a job
                "Do you want to get a job?", // Yes/No choice
                "You got a job at a local pizza place!", // Message if accepting
                Main.positiveStats, // Stat changes for accepting
                "You decided not to get a job.", // Message if declining
                Main.negativeStats, // Stat changes for declining
                player);
        
        if(Main.playerChoice) {
            hasJob = true;
        }
        
        // Study vs party decision
        Main.positiveStats = Control.setStatArray(1, 0, 25, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
        
        Control.choiceEventHandler(
                "There is a big test coming up... but there is also another party tonight.", // Prompt about studying
                "Do you want to study?",
                "You studied hard!", // Message if studying
                Main.positiveStats, // Stat changes for studying
                "You went to the party instead.", // Message if partying
                Main.negativeStats, // Stat changes for partying
                player);
        
        // Volunteering opportunity
        Main.positiveStats = Control.setStatArray(1, 0, 0, 10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0);
        
        Main.playerChoice = Control.choiceEventHandler(
                "Your school is asking for volunteers for the local soup kitchen.", // Prompt about volunteering
                "Do you want to volunteer?", 
                "You are going to help so many people!", // Message for volunteering
                Main.positiveStats, // Stat changes for volunteering
                "Wow...", // Message for declining
                Main.negativeStats, // Stat changes for declining
                player);

        // Soup kitchen random event
        if(Main.playerChoice) {
            Main.positiveStats = Control.setStatArray(1, 0, 0, 10, 0);
            Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0);
            Control.randomEventHandler(
                "You have to dish out meals to the homeless.", 
                "You left many people satisfied.", // Success message
                Main.positiveStats, // Stat changes for success
                "You spilled boiling soup on a homeless man!", // Failure message
                Main.negativeStats, // Stat changes for failure
                0, // Event probability
                player);
        }

        // Random football injury event if playing sports
        if(playingSports) {
            Main.positiveStats = Control.setStatArray(1, 0, 0, 0, 0);
            Main.negativeStats = Control.setStatArray(1, -5000, 0, 0, 0);
            Control.randomEventHandler(
                "You took a hard hit during a football game.", 
                "It only left a scratch though.", // Success message
                Main.positiveStats, // Stat changes for success
                "You broke your femur! You can never play sports again. :( ", // Failure message
                Main.negativeStats, // Stat changes for failure
                0, // Event probability
                player);
        }

        // Pop quiz random event
        if(Event.eventOccuring(player, 100)) {
            Main.positiveStats = Control.setStatArray(1, 0, 20, 0, 0);
            Main.negativeStats = Control.setStatArray(1, 0, -5, 0, 0);
            
            Control.customEventHandler(
                "Your teacher has given a pop quiz.", 
                "What is the capital of Ohio? (Hint: It starts with a capital C)", // Quiz question
                "Columbus", // Correct answer
                "You aced the quiz.", // Success message
                Main.positiveStats, // Stat changes for success
                "You failed the quiz.", // Failure message
                Main.negativeStats, // Stat changes for failure
                player);
        }
        
        //Car purchase decision
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, -3000);
        
        Control.choiceEventHandler(
                "You are very tired of walking everywhere", // Prompt about buying a car
                "Do you want to buy your first car for $3000?", 
                "Vroom!", // Message for buying
                Main.positiveStats, // Stat changes for buying
                "You still have to walk.", // Message for declining
                Main.negativeStats, // Stat changes for declining
                player);
        
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
        
        Main.playerChoice = Control.choiceEventHandler(
                "College applications are due soon.", // Initial message
                "Do you want to apply?", 
                "You applied to college", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You did not apply to college.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End sports event
     
    
        
        
        Main.positiveStats = Control.setStatArray(1, 0, 20, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
        
        Control.choiceEventHandler(
                "There is a really really big test coming up.", // Initial message
                "Do you want to study?",
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
