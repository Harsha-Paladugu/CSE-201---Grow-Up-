/**
 * Represents a player with attributes like age, money, athletics, 
 * education, karma, and a menu to display them.
 */
public class Player {
    private Age age;            // Player's age
    private Money money;        // Player's money
    private Athletics athletics; // Player's athletic skill level
    private Education education; // Player's education level
    private Karma karma;        // Player's karma level
    private Menu menu;          // Menu to display player stats

    /**
     * Initializes a new player with default values for each attribute.
     */
    public Player() {
        this.age = new Age();
        this.money = new Money();
        this.athletics = new Athletics();
        this.education = new Education();
        this.karma = new Karma();
        this.menu = new Menu(age, money, athletics, education);
    }
    
    public Age getAge() {
        return age;   // Returns player's age
    }

    public Money getMoney() {
        return money; // Returns player's money
    }

    public Athletics getAthletics() {
        return athletics; // Returns player's athletics level
    }

    public Education getEducation() {
        return education; // Returns player's education level
    }

    public Karma getKarma() {
        return karma; // Returns player's karma level
    }

    public Menu getMenu() {
        return menu; // Returns player's menu
    }
}
