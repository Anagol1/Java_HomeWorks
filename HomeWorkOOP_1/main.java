package HomeWork.HomeWorkOOP_1;

import java.util.ArrayList;
import java.util.List;

public class main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Animal animal = new Animal(null, null,1);
        
       
        Cat cat1 = new Cat("Вася", "white");
        Animal fish1 = new Fish("Немо");
       

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Бобик"));
        animals.add(new Duck("Дональд", "серый"));
        animals.add(cat1);
        animals.add(new Dolfin("Вилли"));
        animals.add(fish1);
        animals.add(new Swan("БелыйЛебедь", "белый"));

       
        // animals.forEach(Animal::speak); 
        System.out.println();
        animals.forEach(a -> a.fly());
        System.out.println();
        animals.forEach(a -> a.swim());
        System.out.println();
        animals.forEach(a -> a.toGo());  


    }
    
}
