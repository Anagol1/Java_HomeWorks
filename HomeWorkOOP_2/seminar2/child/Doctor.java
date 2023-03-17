package seminar2.child;

import seminar2.parent.Diseaseable;
import seminar2.parent.Speakable;

public class Doctor implements Speakable, Diseaseable {

    @Override
    public void speak() {
        System.out.println("Здравствуйте, я ваш доктор! На что жалуетесь?)");
        System.out.println("С вас 3000 рублей");
    }

    @Override
    public void getIll() {
        System.out.println("На больничном");
    }
}
