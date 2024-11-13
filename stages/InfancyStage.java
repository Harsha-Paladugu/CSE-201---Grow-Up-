
public class InfancyStage {

    public static void playInfancyStage(Player player) {

        // start adoption random event
        Main.positiveStats = Control.setStatArray(1, 0, 0, -10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);
        
        Control.randomEventHandler(
                "The doctor has given your parents a form to give you up for adoption.", // initial message
                "Your parents put you up for adoption.\n\nYou were adopted by a new family.", // message if event happens
                Main.positiveStats, // stat changes if event happens
                "Your parents decided to raise you.", // message if event does not happen
                Main.negativeStats, // stat changes if event does not happen
                50, // probability of event happening
                player); // end adoption event
        

        // start vaccination random event
        Main.positiveStats = Control.setStatArray(1, 0, 0, 10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, -10, -10, 0);
        
        Control.randomEventHandler("It is time for your vaccinations, will your parents choose to vaccinate you?", 
                "Your parents chose to vaccinate you.", 
                Main.positiveStats, 
                "Your parents decided to not vaccinate you.", 
                Main.negativeStats, 
                50, 
                player); // end vaccination event      
    }
}
