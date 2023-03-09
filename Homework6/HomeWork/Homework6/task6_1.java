package HomeWork.Homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class task6_1 {
    public static void main(String[] args) {
        
        ArrayList<Notebook> Notebooks = new ArrayList<>();
        Notebook asus = new Notebook("ASUS x515", "Grey", 8, 512, "Win10");
        Notebook macbookAir = new Notebook("Apple MacBook Air 13", "Silver", 8, 256, "MacOS");
        Notebook Huawei = new Notebook("Huawei Matebook D15", "Black", 8, 256, "Win11");
        Notebook hpLaptop = new Notebook("HP 255 g9 5Y3X5EA", "Grey", 16, 512, "Win10");
        Notebook macbookPro = new Notebook("Apple MacBook Pro", "Black", 16, 512, "MacOS");
        Notebook aser = new Notebook("Aser Nitro 5", "Black", 8, 256, "Win10");    
        
        Notebooks.add(hpLaptop);
        Notebooks.add(asus);
        Notebooks.add(macbookAir);
        Notebooks.add(Huawei);
        Notebooks.add(macbookPro);
        Notebooks.add(aser);         
        
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Приветствуем в нашем магазине! Выберите критерий для выбора ноутбука ");
        System.out.println();
        for (var item : getSortingMap().entrySet()) {  
            System.out.println(item.getKey() + " - " + item.getValue());
        }

        System.out.print("Ваш выбор: ");
        int choise = sc.nextInt();
        var modelAndColor = Map.of(hpLaptop.getModel(), hpLaptop.getColor(), asus.getModel(), asus.getColor(), macbookAir.getModel(), macbookAir.getColor(), Huawei.getModel(), Huawei.getColor(), macbookPro.getModel(), macbookPro.getColor()); 
        var modelAndRam = Map.of(hpLaptop.getModel(), hpLaptop.getRam(), asus.getModel(), asus.getRam(), macbookAir.getModel(), macbookAir.getRam(), Huawei.getModel(), Huawei.getRam(), macbookPro.getModel(), macbookPro.getRam()); 
        var modelAndHdd = Map.of(hpLaptop.getModel(), hpLaptop.getHdd(), asus.getModel(), asus.getHdd(), macbookAir.getModel(), macbookAir.getHdd(), Huawei.getModel(), Huawei.getHdd(), macbookPro.getModel(), macbookPro.getHdd()); 
        var modelAndOs = Map.of(hpLaptop.getModel(), hpLaptop.getOs(), asus.getModel(), asus.getOs(), macbookAir.getModel(), macbookAir.getOs(), Huawei.getModel(), Huawei.getOs(), macbookPro.getModel(), macbookPro.getOs()); 
        
        
        if (choise == 4){
            
            System.out.print("Введите цвет (Grey, Silver, Black): ");
            sc.nextLine();

            String color = sc.nextLine();
            for (var item : modelAndColor.entrySet()) {  
                if (item.getValue().equals(color)){
                    System.out.println(item.getKey() + " - " + item.getValue()); 
                }
            }
        }

        if (choise == 1){
            System.out.print("Введите ОЗУ (8 или 16): ");            
            sc.nextLine();
            int Ram = sc.nextInt();
            for (var item : modelAndRam.entrySet()) {  
                if (item.getValue().equals(Ram)){
                    System.out.println(item.getKey() + " - " + item.getValue()); 
                }
            }
        }

        if (choise == 2){
            System.out.print("Введите объем ЖД (256 или 512): ");            
            sc.nextLine();
            int hd = sc.nextInt();
            
            for (var item : modelAndHdd.entrySet()) {  
                if (item.getValue().equals(hd)){
                    System.out.println(item.getKey() + " - " + item.getValue()); 
                }
            }
        }

        if (choise == 3){
            System.out.print("Введите операционную систему (Win10, Win11, MacOS): ");            
            sc.nextLine();
            String os = sc.nextLine();
            for (var item : modelAndOs.entrySet()) {  
                if (item.getValue().equals(os)){
                    System.out.println(item.getKey() + " - " + item.getValue()); 
                }
            }
        }
    }

    public static HashMap<Integer, String> getSortingMap() {
        HashMap<Integer, String> filter = new HashMap<>();
        filter.put(1, "ОЗУ");
        filter.put(2, "Объем ЖД");
        filter.put(3, "Операционная система");
        filter.put(4, "Цвет");
        
        return filter;
    }    
}



