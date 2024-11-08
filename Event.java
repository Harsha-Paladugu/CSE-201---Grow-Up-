import java.util.Random;

/**
 * The Event class checks if a random event should happen based on a probability
 * and the player's karma level.
 */
public class Event {

    private static Random random = new Random();

    /**
     * Checks if an event should happen based on the given probability.
     * If the player's karma is below 0, the event will not happen.
     * If karma is 0 or more, the event has a chance to happen based on the probability.
     *
     * @param player The player whose karma affects the event.
     * @param probability The chance (0-100) that the event happens if karma is high enough.
     * @return true if the event happens, false if it does not.
     */
    public boolean eventOccuring(Player player, int probability) {
        
        // Check if karma is too low for the event to happen
        if (isKarmaLow(player)) {
            return false;
        }

        // Generate a random number between 0 and 99
        int randomValue = random.nextInt(100);
        
        // Return true if randomValue is less than the probability, indicating the event happens
        return randomValue < probability;
    }
    
    /**
     * Checks if the player's karma is below the level needed for the event to happen.
     *
     * @param player The player whose karma is checked.
     * @return true if the player's karma is below 20, otherwise false.
     */
    public boolean isKarmaLow(Player player) {
        return player.karma.getStatValue() < 0;
    }
}
