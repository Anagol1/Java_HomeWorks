package seminar2;

import seminar2.child.*;
import seminar2.parent.Animal;
import seminar2.parent.Flyable;
import seminar2.parent.VeterinaryClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        clinic
                .addAnimal(new Cat("Барсик", "серый"))
                .addAnimal(new Duck("Дональд", "пёстрый", 2))
                .addAnimal(new Dog("Барбос", "белый"))
                .addAnimal(new HumanExtendsAnimal("Брэд", 2))
                .addAnimal(new Eagle("Без имени", 2));

        for (Animal animal : clinic.getANIMALS()) {
            animal.getIll();
        }

        System.out.println("Говорящие: " + clinic.getSpeakable());
        System.out.println("Летающие: " + clinic.getFlyable());
        System.out.println("Бегающие: " + clinic.getRunnuble());
        System.out.println("Весь список животных: " + clinic.getAllAnymals());
//        clinic.getSpeakable().forEach(Speakable::speak);

        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Duck("Серый", 2));
        flyables.add(new Eagle("Ворон", 2));
        for (Flyable f : flyables) {
            System.out.println(f.getFlightSpeed());
        }
    }
}
