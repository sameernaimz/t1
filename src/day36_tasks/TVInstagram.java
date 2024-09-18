package day36_tasks;
/*
B) Create a class TV Instagram in your Practice_Programming project and inside the da36_tasks package
NOTE: Check the instance variables below and think if this class needs to inherit Device class


        Task:


- data/create instance variables/attributes:
brand, model, price, wireless



    - create method:
        toString(),
useDevice(): Override to print Using TV

 */
public class TVInstagram extends Device {

    public TVInstagram(String brand, String model, double price, boolean wireless) {
        super("TV", model, price, wireless);
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.wireless = wireless;
    }
    public String toString() {
        return "TV{" +
                "brand='" + super.toString() + '\'' +
                '}';
    }

    // Override useDevice method
    @Override
    public void useDevice() {
        System.out.println(" Using TV ");


    }
    }

