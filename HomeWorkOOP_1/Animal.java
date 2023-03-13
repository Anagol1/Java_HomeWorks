package HomeWork.HomeWorkOOP_1; //

/**
 * Создаем абстрактный класс
 */
public class Animal {

    private String name;

    private String color;

    private int pawsCount;


    public String getType() {
        return this.getClass().getSimpleName(); 
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public int getPawsCount() {
        return pawsCount;
    }
    
    public void getPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }


    public Animal(String name, String color, int pawsCount){ 
        this.name = name; 
        this.color = color;
        this.pawsCount = pawsCount;
    }

    

    public void speak() {
        System.out.println("PPPPP");
    }

    public void fly() {
        System.out.println(getType() + " Полетели!");
    }

    public void toGo() {
        System.out.println(getType() + " Я иду");
    }

    public void swim() {
        System.out.println(getType() + " Плаваю");
    }

    public Animal(String name) {
        this(name, null,0);
    }

    @Override
    public String toString() {
        return String.format("Имя: %s\nЦвет: %s", this.name, this.color);
        
    }

   
}

