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

    protected Statistics[] statList = new Statistics[5]; // 0 Age, 1 Athletics, 2 Education, 3 Karma, 4 Money

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

        this.statList[0] = this.age;
        this.statList[1] = this.athletics;
        this.statList[2] = this.education;
        this.statList[3] = this.karma;
        this.statList[4] = this.money;
    }
    
    public void changeAllStats(int[] statUpdate) {
        
        for(int i = 0; i < 5; i++) {
            this.statList[i].changeStat(statUpdate[i]);
        }
    }
}
