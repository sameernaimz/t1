package day37_tasks;

public class UseAll {

    public static void main(String[] args) {
        Tester test = new Tester("Bob", 24, "SDET", 123000);
        test.hobby();
        test.work();
        System.out.println(test);

        System.out.println("-------------");
        Chef chef = new Chef("Ryan", 34, "Chef", 70000);
        chef.hobby();
        chef.work();
        System.out.println(chef);

    }
}
