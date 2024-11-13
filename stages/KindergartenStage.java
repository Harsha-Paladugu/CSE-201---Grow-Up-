public class KindergartenStage {
    
    public static void playKindergartenStage(Player player) {
            
        Control.Print("Starting Kindergarten");
    
        // Start friendship event
        Main.positiveStats = Control.setStatArray(1,0,0,10,0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0); // amount to change age, athletics, education, karma, money.
        
        Main.playerChoice = Control.choiceEventHandler( // collect playerChoice for lunch event
                "It's the first day of kindergarten, you see many people in your class.", // Initial message
                "Do you want to make a friend?", // Prompt Player Yes or No
                "You made a friend!", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You kept to yourself.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End friendship event
    
        // Start lunch event
        Main.positiveStats = Control.setStatArray(1, 0, 0, 20, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0);
        
        if(Main.playerChoice == true) {
            
            Control.choiceEventHandler(
                    "You are eating lunch with your friend, he asks to try your pretzels.",
                    "Do you want to give him some of your pretzels?",
                    "You gave your friend some of your pretzels.",
                    Main.positiveStats,
                    "You did not give your friend any pretzels.",
                    Main.negativeStats,
                    player);
        } else {
            player.age.changeStat(Main.positiveStats[0]);
        } // End lunch event
        
        // Start random fight event
        Main.positiveStats = Control.setStatArray(1, 0, 0, -10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 10, 0);
        
        Control.randomEventHandler(
                "During recess, a kid bumps into you.", // Initial Message
                "You stood up for yourself and got into a small fight.", // Message if event happens
                Main.positiveStats, // Stat changes if event happens
                "You let it go and avoided any trouble.", // Message if event does not happen
                Main.negativeStats, // Stat changes if event does not happen
                0, // probability
                player); // End random fight event 
        
        // Start sports event
        Main.positiveStats = Control.setStatArray(1, 25, 0, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
        
        Control.choiceEventHandler(
                "The school is looking for students to join the football team.", // Initial message
                "Do you want to sign up for football?", // Prompt for Yes/No choice
                "You joined the football team! Your athletic skills improved.", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You decided not to join the football team.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End sports event
        
        // Start chores event
        Main.positiveStats = Control.setStatArray(1, 0, 0, 10, 50);
        Main.negativeStats = Control.setStatArray(1, 0, 0, -5, 0);

        Main.playerChoice = Control.choiceEventHandler(
                "Your parents ask if you can help with chores around the house.", // Initial message
                "Do you want to help with the chores?", // Prompt Yes or No
                "You helped with the chores and earned some allowance!", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You chose not to help with the chores.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End chores event
        
        // Start pet event
        Main.positiveStats = Control.setStatArray(1, 0, 0, 15, -30); // Increase karma and decrease money if they get a pet
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0); // No change if they choose not to

        if (player.money.getStatValue() > 30) { // Run event if player has enough money to adopt a pet
            
            Control.choiceEventHandler(
                "You have the opportunity to adopt a pet.", // Initial message
                "Do you want to get a pet?", // Prompt for Yes or No
                "You adopted a pet! It brings you joy but comes with expenses.", // Message if Yes
                Main.positiveStats, // Stat changes if Yes
                "You decided not to get a pet.", // Message if No
                Main.negativeStats, // Stat changes if No
                player); // End pet event
            
        // Start pop quiz random event
        Main.positiveStats = Control.setStatArray(1, 0, 20, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, -5, 0, 0);
        
        if(Event.eventOccuring(player, 100)) {
            
            Control.customEventHandler(
                "Your teacher has given a pop quiz.",
                "What is 2 + 3?",
                "5",
                "You aced the quiz.",
                Main.positiveStats,
                "You failed the quiz.", 
                Main.negativeStats, 
                player);
        } // end pop quiz random event
        
        } 
    }
}
