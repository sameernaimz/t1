package day18_forloops;

import java.util.Scanner;

/*

    Given a String we want to count how many 'a' characters we have

    Challenge: adjust so that we can check for not only 'a' but any character

    Ex: aabbcaa

        4

 */
public class CountLetter {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Please, enter the sentence/word to check number of the existence of certain character:");
        String word = key.nextLine(); //"aabbcaa";

        System.out.println("Please, enter the character [SINGLE CHARACTER]: ");
        String character = key.nextLine();  // "K"

        while (character.length() != 1) {
            System.out.println("not single character please try again");
            character = key.next(); // "D"
        }
        char letter = 'a';
        int count = 0;



     /*
            I will get each character at a time  --- >  word.charAt(index);
            and compare if it matches            --- >  word.charAt(index) == letter; --- > count = 1
         */

        for (int i = 0; i < word.length(); i++) { //aabbcaa | 2
            char eachCharOnEachCycle = word.charAt(i); //a | a
            if(eachCharOnEachCycle == letter) {
                count++;
            }
        }
        System.out.println(letter + ": " + count);



    }
}
