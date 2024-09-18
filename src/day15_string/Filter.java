package day15_string;

import day14_string.Website;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter a message: ");
      String msg =  input.nextLine(); // input.nextLine().trim(); ---- > It is a good day today. Java is bad. --- java is bad
         msg = msg.trim();
         String originalMsg = msg;
         msg = msg.toLowerCase();

        System.out.println("You entered: " + msg);

        boolean hasBadWords = msg.contains("java is bad") || msg.contains("quite") || msg.contains("have fun") || msg.contains("crying");

        if (hasBadWords) {
            System.out.println("Message failed to sent");
        } else {
            System.out.println("\"" + originalMsg + "\" was sent");
        }

    }
}
