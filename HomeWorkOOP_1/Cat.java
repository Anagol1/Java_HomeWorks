package HomeWork.HomeWorkOOP_1;

public class Cat extends Animal {  
    public Cat(String name, String color) {
        super(name, color, 4); 
    }

    public Cat(String name) {
        super(name); 
    }
    
    public void hunt() {
        wakeup();
        findFood();
        eat();
    }

    @Override  
    public void speak() {
        System.out.printf("%s сказал: Мяу!%n", getType());
    }

    @Override  
    public void fly() {
        System.out.println(getType() + " Кошки не летают");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " Кошки не умеют плавать");
    }
    
    private void wakeup() {
        System.out.printf(getName()+ " проснулся%n");
    }

    private void toplay() {
        String out = String.format("%s: поиграл", getType());
        System.out.println(out);    
    }

    private void findFood() {
        System.out.println(getName()+" ищет поесть");
    }

    private void eat() {
        System.out.println(getName()+" покушал");
    }

    public void gotosleep() {
        System.out.println(getName()+" уснул");
    }
}
