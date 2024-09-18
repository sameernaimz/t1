package day18_forloops;

import java.util.Scanner;

/*

    Task:
        declare and assign a number

        print all the multiplication results for 1 through 10

        Ex:
            4

            4 x 1 = 4
            4 x 2 = 8
            ..
            4 x 10 = 40



 */
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("What number you want to multiply by");
        int num = key.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i +  " = " + num * i);
        }

    }
}
