package HomeWork.HomeWorkOOP_1;

public class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color, 4); //super значит "вызови пжлст конструктор-родитель"
    }

    public Dog(String name) {
        this(name,null);
    }
    @Override  //переопределение метода - полиформизм - назначение особого поведения
    public void speak() {
        System.out.println("Гав");
    }
    
    @Override  
    public void fly() {
        System.out.println(getType() + " Собаки не летают");
    }

    
}
