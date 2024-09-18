package day14_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a website: ");
        String url = input.next().toLowerCase();

        boolean isValidStart = url.startsWith("www.");

        boolean isValidEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net") || url.endsWith(".io");

        if (isValidStart && isValidEnd) {
            System.out.println("Your website is valid");
        } else {
            System.out.println("It is invalid website.");

            if (!isValidStart) {
                System.out.println("it was invalid start");
            }
            if(!isValidEnd) {
                System.out.println("it is invalid end");
            }
        }
    }
}
