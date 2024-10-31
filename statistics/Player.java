import java.util.ArrayList;
import java.util.List;

public class Player {

    protected Age age;
    protected Money money;
    protected Athletics athletics;
    protected Education education;
    protected Karma karma;
    protected Menu menu;

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