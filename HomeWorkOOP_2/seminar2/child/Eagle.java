package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Diseaseable;
import seminar2.parent.Flyable;

public class Eagle extends Animal implements Flyable, Diseaseable {


//    public Eagle(String name {
//        super();
//
//        legsCount = 2;
//    }

    private final String name;
    private final int legsCount;
    public Eagle(String name, int legsCount) {
        super("", legsCount);
        this.name = name;
        this.legsCount = legsCount;
    }
//
//    public Eagle() {
//
//    }

    @Override
    public void speak() {
        System.out.printf("%s молчит!%n", getType());
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 100;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }
}
