/**
 * The Menu class displays the player's various statistics, including age, money, 
 * athletics, and education.
 */
public class Menu {
    private Age age;
    private Money money;
    private Athletics athletics;
    private Education education;

    /**
     * Constructor to initialize all stats for the player.
     * 
     * @param age the Age object representing the player's age
     * @param money the Money object representing the player's money
     * @param athletics the Athletics object representing the player's athletic skill level
     * @param education the Education object representing the player's education level
     */
    public Menu(Age age, Money money, Athletics athletics, Education education) {
        this.age = age;
        this.money = money;
        this.athletics = athletics;
        this.education = education;
    }

    /**
     * Displays all of the player's statistics.
     */
    public void showStats() {
        System.out.println("\nAll Stats:");
        showAge();
        showMoney();
        showAthletics();
        showEducation();
        System.out.println();
    }

    /**
     * Displays the player's age.
     */
    private void showAge() {
        System.out.println("Age: " + age.getAge());
    }

    /**
     * Displays the player's money.
     */
    private void showMoney() {
        System.out.println("Money: " + money.getMoney());
    }

    /**
     * Displays the player's athletics level.
     */
    private void showAthletics() {
        System.out.println("Athletics: " + athletics.getAthletics());
    }

    /**
     * Displays the player's education level.
     */
    private void showEducation() {
        System.out.println("Education: " + education.getEducation());
    }
}
