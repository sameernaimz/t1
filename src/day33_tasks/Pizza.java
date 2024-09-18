package day33_tasks;

public class Pizza {
    public String size;
    public int numberOfToppings;

    public Pizza(String size, int toppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") ||
                size.equalsIgnoreCase("Medium") ||
                size.equalsIgnoreCase("Large")) {
            this.size = size;
        } else {
            System.out.println("ITEM MUST BE SMALL, MEDIUM, OR LARGE");
        }
    }


    // Getter for size
    public String getSize() {
        return size;
    }

    // Setter for number of toppings with condition
    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings <= 0) {
            this.numberOfToppings = numberOfToppings;
        } else {
            System.out.println("Number of toppings must be a positive number.");
        }
    }

    // Getter for number of toppings
    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public double calculatePrice() {
        double basePrice = 0;
        if (size.equalsIgnoreCase("small")) {
            basePrice = 4;
        } else if (size.equalsIgnoreCase("medium")) {
            basePrice = 6;
        } else if (size.equalsIgnoreCase("large")) {
            basePrice = 8;
        }
        return basePrice + (numberOfToppings * 0.75);


    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings +
                ", cost=" + calculatePrice();

    }
}