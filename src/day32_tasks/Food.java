package day32_tasks;

public class Food {
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food(String name) {

    }
    public Food(String name, int quantity) {

    }
    public Food(String name, int quantity, double unitPrice) {


    }
    public void calculatePrice () {
        totalPrice = unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

