package HomeWork.HomeWorkOOP_1;

public class Swan extends Animal{
    public Swan(String name) {
        super(name);
    }
    public Swan(String name, String color) {
        super(name, color, 2);
    }
    @Override  
    public void speak() {
        System.out.printf("%s сказал: гагага!%n", getType());
    }

    
}
