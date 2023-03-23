package Seminar_OOP3.seminar3.src.drugs.impl;

import Seminar_OOP3.seminar3.src.drugs.Component;
import Seminar_OOP3.seminar3.src.drugs.impl.components.Azitron;
import Seminar_OOP3.seminar3.src.drugs.impl.components.Pinicilin;


import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> { // Iterator делает обьект итерируемым (позволяет пробегать по нему, как по списку)

    private List<Component> components;
    int index;

    public Drug(List<Component> component) {
        this.components = component;
        this.index = 0;
    }

    @Override
    public Iterator<Component> iterator() {
/**
 * Анонимный класс, у него описываются только методы, не требует названия, описания
 * строки 24-38
 */

        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                //        if (index < components.size())
                //            return true;
                //        else return false;
                return index < components.size(); //укороченная запись
            }

            /**
             * @Override next : Бежим по листу Components, получаем компонент с индексом 0, и увеличиваем индекс на 1.
             * И так, пока hasNext = true
             *
             * @return
             */
            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    public int getDrugPower() {
        int power = 0;
        for (Component component:
             components) {
            power += component.getPower();
        }
        return power;
    }

    public int getDrugWeight() {
        int weight = 0;

        for (Component component:
                components) {
            weight += component.getWeight();
        }
        return weight;
    }

    @Override
    public int compareTo(Drug o) {
        int power = getDrugPower();
        int weight = getDrugWeight();
        if (power > o.getDrugPower())
            return 1;
        else if (power < o.getDrugPower())
            return -1;
        else if (weight > o.getDrugWeight())
            return 1;
        else if (weight < o.getDrugWeight())
            return -1;
        else return 0;

//        return Integer.compare(power, o.getDrugPower()); //укороченная запись


    }

    @Override
    public String toString() {
        return String.format("%s {components: %s, power: %s, weight: %s}%n", this.getClass().getSimpleName(), components, getDrugPower(), getDrugWeight());
    };
}






