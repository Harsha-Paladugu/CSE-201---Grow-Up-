public class KindergartenStage {
    
public static void playKindergartenStage(Player player) {
    
    int[] positiveStats = new int[5];
    int[] negativeStats = new int[5];
        
    System.out.println("Starting Kindergarten");

    // Increase age from 0 to 5 when starting kindergarten
    player.age.changeStat(5); 

    // start friendship event
    positiveStats = Control.setStatArray(1,0,0,10,0);
    negativeStats = Control.setStatArray(1, 0, 0, -10, 0);
    Control.choiceEventHandler(
            "It's the first day of kindergarten, you see many people in your class.", // Initial message
            "Do you want to make a friend?", // Prompt Player Yes or No
            "You made a friend!", // Message if Yes
            positiveStats, // Stat changes if Yes
            "You kept to yourself.", // Message if No
            negativeStats, // Stat changes if No
            player);
    } // end friendship event

}
