public class Menu {
    private Age age;
    private Money money;
    private Athletics athletics;
    private Education education;
    private Karma karma;

    // Constructor to initialize all stats
    public Menu(Age age, Money money, Athletics athletics, Education education, Karma karma) {
        this.age = age;
        this.money = money;
        this.athletics = athletics;
        this.education = education;
        this.karma = karma;
    }

    // Show all stats
    public void showStats() {
        System.out.println("All Stats:");
        showAge();
        showMoney();
        showAthletics();
        showEducation();
        showKarma();
    }

    // Show age
    public void showAge() {
        System.out.println("Age: " + age.getAge());
    }

    // Show money
    public void showMoney() {
        System.out.println("Money: " + money.getMoney());
    }

    // Show athletics
    public void showAthletics() {
        System.out.println("Athletics: " + athletics.getAthletics());
    }

    // Show education
    public void showEducation() {
        System.out.println("Education: " + education.getEducation());
    }

    // Show karma
    public void showKarma() {
        System.out.println("Karma: " + karma.getKarma());
    }
}
