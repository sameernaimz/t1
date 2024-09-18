package day30_b_custom_classes;

public class App {
    //INSTANCE VARIABLES / DATA MEMBERS
    //These are not in a method. They directly in the Class level
    //NOTE: if variables are declared in Methods, they are LOCAL VARIABLES
    String name;
    double version;
    boolean isFree;

    //this is method is INSTANCE METHOD - does not have "static: keyword

    public void run() {
        System.out.println(name + "is running.");
    }
    public void update () {
        System.out.println(name+ "is updating.");
        version += 1.1;
    }
}
