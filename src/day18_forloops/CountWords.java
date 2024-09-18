package day18_forloops;

import java.util.Scanner;
/*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
        Input:
            This has multiple words
        Output:
            4
 */

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a sentence: ");
        String sentence = input.nextLine().trim();
            int countSpace = 0;
            char spaceChar = ' ';

        //Java is a cool language
        //Solution: count the number of space
        //      +1 --> total words

        //How can I count how many spaces i have?
        //Go through each character and check if it is equal to space - if it is increase count

        for (int i = 0; i < sentence.length(); i++) {
            char singleChar = sentence.charAt(i);
            if(singleChar == spaceChar) {
                countSpace++;
            }
           // System.out.println(sentence.charAt(i));
        }
        //Hi People - 1 space is 2 words
        //Hi nice people - 2 space is 3 words and so on
        System.out.println("There are total " +(countSpace+1) + " words");
    }
}
