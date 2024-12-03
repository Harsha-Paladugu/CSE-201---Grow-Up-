public class InfancyStage {

    public static void playInfancyStage(Player player) {

        // Start adoption random event
        Main.positiveStats = Control.setStatArray(1, 0, 0, -10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);

        Control.randomEventHandler(
                "A difficult decision arises. The doctor suggests your parents consider giving you up for adoption. What path will they choose?", // initial message
                "Your parents made the tough decision to give you up for adoption. You were taken in by a new family, starting a different chapter in your life.", // message if event happens
                Main.positiveStats, // stat changes if event happens
                "After some deliberation, your parents decided to keep you and raise you themselves, taking on the challenges ahead.", // message if event does not happen
                Main.negativeStats, // stat changes if event does not happen
                50, // probability of event happening
                player); // End adoption event

        // Start vaccination random event
        Main.positiveStats = Control.setStatArray(1, 0, 0, 10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, -10, -10, 0);

        Control.randomEventHandler(
                "It’s time for an important health decision: vaccinations. Will your parents go through with it or opt out?", // initial message
                "Your parents decided to vaccinate you, giving you an early advantage in staying healthy.", // message if event happens
                Main.positiveStats, // stat changes if event happens
                "Your parents decided against vaccinations, leaving you more vulnerable to potential illnesses.", // message if event does not happen
                Main.negativeStats, // stat changes if event does not happen
                50, // probability of event happening
                player); // End vaccination event
    }
}