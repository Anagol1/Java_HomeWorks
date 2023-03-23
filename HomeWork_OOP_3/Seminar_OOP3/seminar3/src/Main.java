package Seminar_OOP3.seminar3.src;

import Seminar_OOP3.seminar3.src.drugs.Component;
import Seminar_OOP3.seminar3.src.drugs.impl.CatDrugs;
import Seminar_OOP3.seminar3.src.drugs.impl.components.Azitron;
import Seminar_OOP3.seminar3.src.drugs.impl.components.Pinicilin;
import Seminar_OOP3.seminar3.src.drugs.impl.components.Water;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Component> componentsCat = List.of(new Azitron("azitron", "10", 4),
                new Water("Water", "15", 1));
        CatDrugs catDrug = new CatDrugs(componentsCat);
//        for (CatDrugs it = catDrug; it.hasNext();) {
//            System.out.println(it.next());
//        }
        for (Component component : catDrug) {
            System.out.println(component);
        }

        List<Component> componentCat1 = List.of(new Azitron("Azitron", "15", 5),
                new Pinicilin("Pinicilin", "10", 5)); //List.of создает немодифицируемый лист
        List<Component> componentCat2 = List.of(new Azitron("Azitron", "15", 5),
                new Pinicilin("Pinicilin", "50", 5));
        List<Component> componentCat3 = List.of(new Water("Water", "25", 2),
                new Pinicilin("Pinicilin", "10", 8));
        List<Component> componentCat4 = List.of(new Water("Water", "25", 100),
                new Pinicilin("Pinicilin", "11", 6));

        CatDrugs drug1 = new CatDrugs(componentsCat);
        CatDrugs drug2 = new CatDrugs(componentCat1);
        CatDrugs drug3 = new CatDrugs(componentCat2);
        CatDrugs drug4 = new CatDrugs(componentCat3);
        CatDrugs drug5 = new CatDrugs(componentCat4);

        List<CatDrugs> drugs = new ArrayList<>();
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug3);
        drugs.add(drug4);
        drugs.add(drug5);
        System.out.println(drugs);
        Collections.sort(drugs);
        System.out.println(drugs);

        Water water1 = new Water("SaltWater", "15", 25);
        Water water2 = new Water("SeaWater", "30", 50);
        Water water3 = new Water("DistWater", "30", 50);
        Water water4 = new Water("DistWater", "30", 50);

        Set<Component> result = new HashSet<>();

        result.add(water1);
        result.add(water2);
        result.add(water3);
        result.add(water4);

        System.out.println(result);

    }

}