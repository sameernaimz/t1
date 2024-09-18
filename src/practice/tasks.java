package practice;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {
        // create a tool that asks the person to put his name. If the string is Empty, it will keep asking
        //create a Scanner


        Scanner input = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Please provide your name:");
            name = input.nextLine();
        }
        System.out.println("Hello," + name);
    }
}
