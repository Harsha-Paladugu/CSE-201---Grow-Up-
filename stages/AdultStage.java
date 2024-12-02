
public class AdultStage {
    public static void playAdultStage(Player player) {
        Control.Print("Starting Adult Stage");

        // Choice to get a job
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, 5000); // Increase money
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0); // No stat change if declined

        Main.playerChoice = Control.choiceEventHandler(
                "You have an opportunity to get an office job.", 
                "Do you want to take the job?", 
                "You accepted the job and started earning a stable income!", 
                Main.positiveStats, 
                "You decided not to take the job.", 
                Main.negativeStats, 
                player);

        // Choice to go back to college
        Main.positiveStats = Control.setStatArray(-4, 0, 50, 0, -2000); // Decrease age, increase education, decrease money
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0); // No change if declined

        Main.playerChoice = Control.choiceEventHandler(
                "You have the chance to go back to college.", 
                "Do you want to go back to college?", 
                "You went back to college and became a doctor!", 
                Main.positiveStats, 
                "You decided not to go back to college.", 
                Main.negativeStats, 
                player);

        if (Main.playerChoice) {
            player.karma.changeStat(20); // Increase karma for becoming a doctor
        }

        // Start a family
        Main.positiveStats = Control.setStatArray(1, 0, 0, 30, -3000); // Increase karma, decrease money
        Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0); // Decrease karma if declined

        Control.choiceEventHandler(
                "You are thinking of starting a family.", 
                "Do you want to start a family?", 
                "You started a family and gained happiness!", 
                Main.positiveStats, 
                "You decided to remain single.", 
                Main.negativeStats, 
                player);

        // Invest money
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, -1000); // Decrease money
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0); // No change if declined

        Control.choiceEventHandler(
                "You are considering investing your money.", 
                "Do you want to invest?", 
                "You made a wise decision and invested your money.", 
                Main.positiveStats, 
                "You chose not to invest.", 
                Main.negativeStats, 
                player);

        // Spend all money
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, -player.money.getStatValue()); // Set money to 0
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0); // No change if declined

        Control.choiceEventHandler(
                "You have the urge to spend all your money.", 
                "Do you want to spend it all?", 
                "You spent all your money!", 
                Main.positiveStats, 
                "You decided to save your money.", 
                Main.negativeStats, 
                player);

        // Gamble money
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, player.money.getStatValue() * 10); // Multiply money by 10
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, -player.money.getStatValue()); // Lose all money

        if (Event.eventOccuring(player, 50)) { // 50% chance to win
            Control.choiceEventHandler(
                    "You feel lucky and decide to gamble.", 
                    "Do you want to gamble your money?", 
                    "You won big! Your money multiplied tenfold!", 
                    Main.positiveStats, 
                    "You lost everything in a bad gamble.", 
                    Main.negativeStats, 
                    player);
        }

        // Medical care
        Main.positiveStats = Control.setStatArray(1, 0, 0, 0, -500); // Decrease money
        Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0); // Decrease karma if not cared for

        Control.choiceEventHandler(
                "You are feeling unwell and may need medical care.", 
                "Do you want to seek medical care?", 
                "You received care and are feeling better.", 
                Main.positiveStats, 
                "You avoided medical care, risking your health.", 
                Main.negativeStats, 
                player);

        // Vacation with family
        Main.positiveStats = Control.setStatArray(1, 0, 0, 20, -1000); // Increase karma, decrease money
        Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0); // Decrease karma if declined

        Control.choiceEventHandler(
                "Your family suggests going on a vacation.", 
                "Do you want to go on vacation with them?", 
                "You went on a vacation and made unforgettable memories.", 
                Main.positiveStats, 
                "You decided to skip the vacation.", 
                Main.negativeStats, 
                player);

        Control.Print("End of Adult Stage");
    }
}
