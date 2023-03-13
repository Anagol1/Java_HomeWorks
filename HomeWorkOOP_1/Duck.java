package HomeWork.HomeWorkOOP_1;

public class Duck extends Animal{
    public Duck(String name, String color) {
        super(name, color, 2); 
    }

    @Override  
    public void speak() {
        System.out.println(getType() + " Кря-кря");
    }
    
    
    
}
