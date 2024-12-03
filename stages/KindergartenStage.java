public class KindergartenStage {

    public static void playKindergartenStage(Player player) {

        Control.Print("Welcome to Kindergarten! It's time to make some big choices.");

        // Start friendship event
        Main.positiveStats = Control.setStatArray(1, 0, 0, 10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0);

        Main.playerChoice = Control.choiceEventHandler(
                "It's your first day of kindergarten, and the classroom is full of new faces.",
                "Do you want to introduce yourself and make a friend?",
                "You made a new friend! It's a great start to your school experience.",
                Main.positiveStats,
                "You decided to keep to yourself for now.",
                Main.negativeStats,
                player);

        // Start lunch event
        Main.positiveStats = Control.setStatArray(1, 0, 0, 20, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, -10, 0);

        if (Main.playerChoice) {
            Control.choiceEventHandler(
                    "During lunch, your new friend asks for some of your pretzels.",
                    "Do you want to share your pretzels?",
                    "You shared your pretzels, and your friendship grew stronger.",
                    Main.positiveStats,
                    "You chose not to share. Your friend seemed a bit disappointed.",
                    Main.negativeStats,
                    player);
        } else {
            player.age.changeStat(Main.positiveStats[0]);
        }

        // Start random fight event
        Main.positiveStats = Control.setStatArray(1, 0, 0, -10, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 10, 0);

        Control.randomEventHandler(
                "At recess, a kid bumps into you while playing.",
                "You decided to stand up for yourself, and it turned into a small fight.",
                Main.positiveStats,
                "You let it slide, avoiding any trouble.",
                Main.negativeStats,
                50,
                player);

        // Start sports event
        Main.positiveStats = Control.setStatArray(1, 25, 0, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);

        Control.choiceEventHandler(
                "The school is forming a football team and is looking for players.",
                "Do you want to join the football team?",
                "You joined the football team! Your athletic skills are on the rise.",
                Main.positiveStats,
                "You decided not to join. Football just isn’t your thing.",
                Main.negativeStats,
                player);

        // Start chores event
        Main.positiveStats = Control.setStatArray(1, 0, 0, 10, 50);
        Main.negativeStats = Control.setStatArray(1, 0, 0, -5, 0);

        Main.playerChoice = Control.choiceEventHandler(
                "Your parents ask if you can help with some chores at home.",
                "Do you want to help with the chores?",
                "You helped out and earned some allowance money!",
                Main.positiveStats,
                "You chose not to help. Your parents weren’t thrilled.",
                Main.negativeStats,
                player);

        // Start pet event
        Main.positiveStats = Control.setStatArray(1, 0, 0, 15, -30);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);

        if (player.money.getStatValue() > 30) {
            Control.choiceEventHandler(
                    "You have enough money to adopt a pet. A furry friend could be yours!",
                    "Do you want to adopt a pet?",
                    "You adopted a pet! It’s a joy to have, but it’s not cheap.",
                    Main.positiveStats,
                    "You decided not to adopt a pet for now.",
                    Main.negativeStats,
                    player);
        }

        // Start pop quiz random event
        Main.positiveStats = Control.setStatArray(1, 0, 20, 0, 0);
        Main.negativeStats = Control.setStatArray(1, 0, -5, 0, 0);

        if (Event.eventOccuring(player, 100)) {
            Control.customEventHandler(
                    "Your teacher announces a surprise pop quiz.",
                    "What is 2 + 3?",
                    "5",
                    "You nailed it and impressed your teacher!",
                    Main.positiveStats,
                    "You missed the answer. Better luck next time.",
                    Main.negativeStats,
                    player);
        }

        // Start divorce random event
        Main.positiveStats = Control.setStatArray(1, 0, 0, -5, 0);
        Main.negativeStats = Control.setStatArray(1, 0, 0, 0, 0);

        Control.randomEventHandler(
                "",
                "Your parents decided to get a divorce. Life feels different now.",
                Main.positiveStats,
                "",
                Main.negativeStats,
                50,
                player);

        // Start injury random event
        Control.Print("You're walking down the street when a car suddenly speeds toward you.");
        if (Event.eventOccuring(player, 100)) {
            Control.Print("The car hit you, breaking your leg.");
            player.athletics.resetStat();
        } else {
            Control.Print("The car screeched to a stop just in time.");
        }

        // Start disease and death random event
        Main.positiveStats = Control.setStatArray(-100, 0, 0, 0, 0);
        Main.negativeStats = Control.setStatArray(-100, 0, 0, 0, 0);

        Control.randomEventHandler(
                "You start feeling sick...",
                "The illness was serious, and you didn’t survive.",
                Main.positiveStats,
                "You made a full recovery and felt fine afterward.",
                Main.negativeStats,
                1,
                player);

        // Start work event
        Main.positiveStats = Control.setStatArray(1, 5, 0, 5, 30);
        Main.negativeStats = Control.setStatArray(1, 0, 0, -5, 0);

        Main.playerChoice = Control.choiceEventHandler(
                "You have an opportunity to deliver newspapers and earn some extra cash.",
                "Do you want to take the job?",
                "You took the job and worked hard, earning some money.",
                Main.positiveStats,
                "You chose not to work and spent your time relaxing instead.",
                Main.negativeStats,
                player);
    }
}