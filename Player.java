public class Player {
    private Age age;
    private Money money;
    private Athletics athletics;
    private Education education;
    private Karma karma;
    private Menu menu;

    public Player() {
        this.age = new Age();
        this.money = new Money();
        this.athletics = new Athletics();
        this.education = new Education();
        this.karma = new Karma();
        this.menu = new Menu(age, money, athletics, education);
    }
    
    // sample of methods being used
    /*
    public static void main(String[] args) {
        Player p1 = new Player();
        
        p1.menu.showStats();
        
        p1.age.ageUp(5);
        p1.money.moneyUp(100);
        p1.karma.karmaUp(20);
        p1.athletics.athleticsUp(10);
        
        p1.menu.showStats();
    } */
}