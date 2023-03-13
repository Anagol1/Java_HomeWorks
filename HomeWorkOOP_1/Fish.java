package HomeWork.HomeWorkOOP_1;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override  
    public void speak() {
        System.out.println(getType() + " Я не умею говорить!");
    }

    @Override  
    public void toGo() {
        swim();
    }

    @Override  
    public void fly() {
        System.out.println(getType() + " Я - не летающая рыбка");
    }
}
