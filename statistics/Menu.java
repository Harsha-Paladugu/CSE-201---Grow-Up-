public class Menu {
    private Age age;
    private Money money;
    private Athletics athletics;
    private Education education;

    // Constructor to initialize all stats
    public Menu(Age age, Money money, Athletics athletics, Education education) {
        this.age = age;
        this.money = money;
        this.athletics = athletics;
        this.education = education;
    }

    // Show all stats
    public void showStats() {
        System.out.println();
        System.out.println("All Stats:");
        showAge();
        showMoney();
        showAthletics();
        showEducation();
        System.out.println();
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
}
