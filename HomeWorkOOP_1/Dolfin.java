package HomeWork.HomeWorkOOP_1;

public class Dolfin extends Animal {
    public Dolfin(String name) {
        super(name);

    }

    @Override  
    public void speak() {
        String out = String.format("%s: разговаривает ультразвуком", getType());
        System.out.println(out);
    }

    public void fly() {
        System.out.println(getType() + " Прыгаю по волнам");
    }

    public void toGo() {
        swim();
    }
    
}
