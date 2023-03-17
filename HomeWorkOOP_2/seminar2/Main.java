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
                .addAnimal(new Cat("������", "�����"))
                .addAnimal(new Duck("�������", "������", 2))
                .addAnimal(new Dog("������", "�����"))
                .addAnimal(new HumanExtendsAnimal("����", 2))
                .addAnimal(new Eagle("��� �����", 2));

        for (Animal animal : clinic.getANIMALS()) {
            animal.getIll();
        }

        System.out.println("���������: " + clinic.getSpeakable());
        System.out.println("��������: " + clinic.getFlyable());
        System.out.println("��������: " + clinic.getRunnuble());
        System.out.println("���� ������ ��������: " + clinic.getAllAnymals());
//        clinic.getSpeakable().forEach(Speakable::speak);

        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Duck("�����", 2));
        flyables.add(new Eagle("�����", 2));
        for (Flyable f : flyables) {
            System.out.println(f.getFlightSpeed());
        }
    }
}
