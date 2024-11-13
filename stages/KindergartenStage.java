public class KindergartenStage {
    
    public static void playKindergartenStage(Player player) {
        
        int[] positiveStats = new int[5];
        int[] negativeStats = new int[5];
            
        System.out.println("Starting Kindergarten");
    
        // Increase age from 0 to 5 when starting kindergarten
        player.age.changeStat(5); 
    
        // Start friendship event
        positiveStats = Control.setStatArray(1,0,0,10,0);
        negativeStats = Control.setStatArray(1, 0, 0, -10, 0); // amount to change age, athletics, education, karma, money.
        
        Control.CHOICE playerChoice = Control.choiceEventHandler( // collect playerChoice for lunch event
                "It's the first day of kindergarten, you see many people in your class.", // Initial message
                "Do you want to make a friend?", // Prompt Player Yes or No
                "You made a friend!", // Message if Yes
                positiveStats, // Stat changes if Yes
                "You kept to yourself.", // Message if No
                negativeStats, // Stat changes if No
                player); // End friendship event
    
        // Start lunch event
        positiveStats = Control.setStatArray(1, 0, 0, 20, 0);
        negativeStats = Control.setStatArray(1, 0, 0, -10, 0);
        
        if(playerChoice == Control.CHOICE.YES) {
            
            Control.choiceEventHandler(
                    "You are eating lunch with your friend, he asks to try your pretzels.",
                    "Do you want to give him some of your pretzels?",
                    "You gave your friend some of your pretzels.",
                    positiveStats,
                    "You did not give your friend any pretzels.",
                    negativeStats,
                    player);
        } else {
            player.age.changeStat(positiveStats[0]);
        } // End lunch event
    }
}
