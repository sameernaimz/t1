package diana_tasks;

public class UseAvengers {
    public static void main(String[] args) {

        Avengers avenger = new Avengers("Spiderman","Web");
        System.out.println(Avengers.universe); // by class name
     //   System.out.println(avenger.universe); // by object

        System.out.println(avenger.power);

        avenger.power = "Climbing";

    }
}
