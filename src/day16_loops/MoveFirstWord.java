package day16_loops;

import java.util.Scanner;
/*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint: Use indexOf and substring
 */
public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine().trim();

            //Take the part from sentence -. substring (0, indexOfFirstSpace)
            //      How so i get indexOfFirstSpace -> .indexOf(""):

        //int indexOfFirstSpace = sentence.indexOf(" ");
        //String firstWord = sentence.substring(0,  indexOfFirstSpace);


        String firstWord = sentence.substring(0, sentence.indexOf(" ")); // Java

      // String restOfSentence =  sentence.substring(sentence.indexOf(" ")).trim(); // is a Fun Language
        String restOfSentence = sentence.substring(sentence.indexOf(" ") + 1); // Is a Fun Language


        System.out.println(restOfSentence + " " + firstWord); // Is a fun Language Java


    }
}
