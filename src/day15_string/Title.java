package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your name with titles: ");
        String name = key.nextLine().toLowerCase();

        //Mr. Tom Jerry
        //Mister. Tom Jerry

        //Ms. Tom Jerry
        // Miss. Tom Jerry

        // DR. Tom Jerry

        // Tom Jerry Sr.
        // Tom Jerry Jr.

        if (name.startsWith("mr.") || name.startsWith("mister")) {
            System.out.println("Hello Sir.");
        } else if (name.startsWith("ms.") || name.startsWith("miss.") || name.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr.")) {
            System.out.println("Hello Doctor.");
        }

     if (name.endsWith("sr.")) {
            System.out.println("Hello Senior.");
        } else if (name.endsWith("jr.")) {
            System.out.println("Hello Junior.");
        }


    }
}
