package day33_tasks;

public class useComputer {
    public static void main(String[] args) {

        Computer compUse1 = new Computer (2600, "Apple");
        System.out.println(compUse1);

        System.out.println(Computer.hasBattery);

        Computer compUse2 = new Computer(2000, "Lenovo", "Gold");
        System.out.println(compUse2);
        System.out.println(Computer.hasScreen);
        System.out.println(Computer.hasMemory);
    }
}
