package day17_loops;

public class DoWhileExample {
    public static void main(String[] args) {

    int a = 0;

    do {
        System.out.println("Hello");
    } while (false);

//    while (false) {
//        System.out.println("Hello");
//    }
        System.out.println("--------");
        do {
            System.out.println(a); // 0 1 2 3 4 5
            a++; // 1 2 3 4 5 6
        } while (a <= 5);

        System.out.println("-------");

        int a2 = 0;
        do {
            System.out.println(a2); // 0 5 10 15
            a2 += 5; // 5 10 15
        } while (a2 <= 15);


        System.out.println("-----");

        int a3 = 0;
        do {
            System.out.println(a3);
        } while (a3 == 10);


        // this is a while loop: which checks condition FIRST and based on the result, it executes code block.
        while (a3 == 10) {
            System.out.println(a3);
        }
    }
}
