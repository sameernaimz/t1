package day33_tasks;

public class Computer {

    double price;
    String brand;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;
    public Computer (double price, String brand ) {
        this.price = price;
        this.brand = brand;
    }

    public Computer (double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;

    }

    static {
        hasScreen = true;
        hasBattery = false;
        hasMemory = true;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\''
                ;
    }
}
