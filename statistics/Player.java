/**
* Class: Player
* @author Harsha 
* @version 1.0
* Course : CSE201
* Written: October 30, 2024
*
* Purpose: This class keeps track of all of the statistics that a player 
*/
import java.util.ArrayList;
import java.util.List;

public class Player {

    /**
     * Represents the age of the player.
     */
    protected Age age;

    /**
     * Represents the player's money or financial status.
     */
    protected Money money;

    /**
     * Represents the player's athletic ability or fitness level.
     */
    protected Athletics athletics;

     /**
     * Represents the player's educational achievements or knowledge level.
     */
    protected Education education;

    /**
     * Represents the player's karma or moral standing.
     */
    protected Karma karma;

    /**
     * A menu that displays and manages the player's statistics.
     */
    protected Menu menu;

    /**
     * Initializes a new instance of the Player class with default statistics for age, money, athletics,
     * education, and karma. Also sets up a menu to manage these statistics.
     */
    public Player() {
        this.age = new Age();
        this.money = new Money();
        this.athletics = new Athletics();
        this.education = new Education();
        this.karma = new Karma();

        List<Statistics> statList = new ArrayList<>();
        statList.add(age);
        statList.add(money);
        statList.add(athletics);
        statList.add(education);
        statList.add(karma);

        this.menu = new Menu(statList);
    }
}
