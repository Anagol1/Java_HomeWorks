

package HomeWork.Homework6;

public class Notebook {
    private String model;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    
    public void setModel(String model) {
        this.model = model;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public int getRam() {
        return ram;
    }
    public String getOs() {
        return os;
    }
    public int getHdd() {
        return hdd;
    }
    public String getColor() {
        return color;
    }

    public void getInfo() {
        System.out.println(this.model + ":\n\tЦвет: " + this.color + "\n\tОЗУ: " + this.ram + "\n\tОбъем HD: " + this.hdd + "\n\tОперационная система: " + this.os + "\n");
    }

   
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Модель: %s Цвет: %s ОЗУ: %d Объем HD: %d ОС: %s", this.model, this.color, this.ram, this.hdd, this.os);
    } 

    public Notebook(String model, String color, int ram, int hdd, String os) {
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }
    public Notebook() {
    }
}
