package day30_b_custom_classes;

public class Item {

    //INSTANCE VARIABLE
    String name;
    double price;

    // SPECIAL METHOD
    // HELPS TO PRINT / GET INTO DOE OBJECT DIRECTLY

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
