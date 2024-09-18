package day36_tasks;

public class useDevice {
    public static void main(String[] args) {
        TVInstagram ig1 = new TVInstagram("TV", "Samsung A6", 3000, false);
        ig1.useDevice();
        System.out.println(ig1);
        Phone p1 = new Phone("iphone", "13 PRO", 1444, true);
        p1.useDevice();

        System.out.println(p1);

    }
}
