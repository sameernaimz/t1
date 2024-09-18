package day15_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter 3 words");
        String word1 = key.nextLine();
        String word2 = key.nextLine();
        String word3 = key.nextLine();


        int word1L = word1.length();
        int word2L = word2.length();
        int word3L = word3.length();

        if (word1L > word2L && word1L > word3L && word1.contains("a")) {
            System.out.println(word1 + "is biggest");
        } else if (word2L > word3L && word2L > word1L && word2.contains("a")) {
            System.out.println(word2 + "is biggest");
        } else if (word3L > word1L && word3L > word2L && word3.contains("a")) {
            System.out.println(word3 + "is biggest");
        } else {
            System.out.println("No word has longest with A");
        }

    }
}
