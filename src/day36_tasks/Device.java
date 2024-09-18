package day36_tasks;
//Tasks 1 - Create multiple classes
//
//    A) Create a Device called App in your Practice_Programming project and inside the da36_tasks package
//
//
//        Task:
//
//- data/create instance variables/attributes:
//brand, model, price, wireless
//
//
//    - create method:
//        toString()
//useDevice()
public class Device {
    String brand;
    String model;
    double price;
    boolean wireless;


    public Device(String brand, String model, double price, boolean wireless) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "DEVICE{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
        public void useDevice() {
            System.out.println("I am using Device");
    }
}

