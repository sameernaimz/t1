package day36_tasks;

public class Phone extends Device {

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }

    public Phone(String brand, String model, double price, boolean wireless) {
        super(brand, model, price, wireless);
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.wireless = wireless;
    }
        @Override
        public void useDevice() {
            System.out.println("Using Phone");
        }

    }


