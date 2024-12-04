/**
 * This class plays the retirement stage of Grow Up!
 * 
 * @author Parker Sherman
 */
public class RetirementStage {
    public static void playRetirementStage(Player player){
        // Determine the player's retirement status
        player.age.changeStat(30);
        boolean isRetired = false;
        
        Control.Print("Starting Retirement");
        
        // Determines if the player is able to retire or not
        if (player.money.getStatValue() > 500) {
            isRetired = true;
            
            Control.Print("You were able to retire.");
        } else {
            Control.Print("You were unable to retire.");
        }
        
        // Two different events for if the player is retired or not
        if (isRetired) {
            // Senior center event
            Main.positiveStats = Control.setStatArray(1, 0, 0, -20, 50); // amount to change age, athletics, education, karma, money.
            Main.negativeStats = Control.setStatArray(1, 0, 0, 10, 0);
            
            Main.playerChoice = Control.choiceEventHandler(
                    "Your bingo rival, Ethel, has been winning too much", 
                    "Do you cheat to win?", 
                    "Serves her right! And you took home the $50 pot!",
                    Main.positiveStats, 
                    "You may hate Ethel, but you are no cheater!", 
                    Main.negativeStats, 
                    player);
        } else {
            // Coworker event
            Main.positiveStats = Control.setStatArray(1, 0, 0, 20, -10); // amount to change age, athletics, education, karma, money.
            Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0);
            
            Main.playerChoice = Control.choiceEventHandler(
                    "Your nasty coworker, Ethel, has \"forgotten\" her wallet", 
                    "Do you pay for her lunch?", 
                    "She may be evil, but nobody deserves to go hungry", 
                    Main.positiveStats, 
                    "Your hate for Ethel is too strong. You \"forgot\" your wallet too", 
                    Main.negativeStats, 
                    player);
        }
        
        // Start the event to write a will
        Main.positiveStats = Control.setStatArray(1, 0, 10, 10, -10); // amount to change age, athletics, education, karma, money.
        Main.negativeStats = Control.setStatArray(1, 0, -10, -10, 0);
        
        Main.playerChoice = Control.choiceEventHandler(
                "You've started to become aware of your old age", 
                "Do you wish to write a will?", 
                "You're at peace with who your belongings will go to.", 
                Main.positiveStats, 
                "The govenment will handle your estate", 
                Main.negativeStats, 
                player);
        
        // Starting the Health Event
        Main.positiveStats = Control.setStatArray(1, 5, 0, 10, -20); // amount to change age, athletics, education, karma, money.
        Main.negativeStats = Control.setStatArray(1, 0, -10, -10, 0);
        
        Main.playerChoice = Control.choiceEventHandler( // Collect player choice
                "You're feeling slightly lethargic and light headed", // Initial message of the event
                "Do you go to the doctor?", // Prompt for the user to answer
                "Always better to be safe than sorry!", // Message if yes
                Main.positiveStats, // Stat Change if yes
                "Eh, it's probably nothing.", // Message if No
                Main.negativeStats, // Stat change if No
                player);
        
        
        // If the player has less than 50 karma, there is a a 75% chance they
        // die of heart failure and move on to afterlife
        if (Event.eventOccuring(player, 75) && player.karma.getStatValue() < 50) {
            Control.Print("You died of heart failure at the age of " + player.age.getStatValue());
            return;
        }
        
        // Starting Pickleball event
        Main.positiveStats = Control.setStatArray(1, 10, 0, 20, 0); // amount to change age, athletics, education, karma, money.
        Main.negativeStats = Control.setStatArray(1, -10, 0, -20, 0);
        
        Main.playerChoice = Control.choiceEventHandler(
                "Your grandchild has asked you to play in a Pickleball fundraiser with them", 
                "Do you gear up to play?", 
                "You had a great time, and made memories to last", 
                Main.positiveStats, 
                "Bah! You're too old for that any of that!", 
                Main.negativeStats, 
                player);
        
        
     // Start of the possible charity event
        // can only start if player has a certain amount of money
        if (player.money.getStatValue() >= 50) {
            Main.positiveStats = Control.setStatArray(1, 0, 0, 30, 50); // amount to change age, athletics, education, karma, money.
            Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0);
            
            Main.playerChoice = Control.choiceEventHandler(
                    "You've come across a beggar on the street", 
                    "Do you give them money?", 
                    "They are very thankful!", 
                    Main.positiveStats, 
                    "They stare at you with a forlorn look", 
                    Main.negativeStats, 
                    player);
        }
        
        // Final death should the player make it to old age
        Control.Print("Your age is catching up to you, your time may be near.");
        if (player.karma.getStatValue() >= 100) { // Good Karma Death
            Control.Print("You pass away at the age of " + player.age.getStatValue() 
            + " surrounded by loved ones and close friends.");
        } else if (player.karma.getStatValue() >= 50) { // Medium Karma death
            Control.Print("You pass away at the age of " + player.age.getStatValue()
            + " surrounded by your family");
        } else { // Worst Karma Death
            Control.Print("You died at the age of " + player.age.getStatValue()
            + " in a cold, sterile hospital room. You were surrounded by the silent air.");
        }
    }
}

