package diana_tasks;

import java.util.Scanner;

public class BiggestWordReplit {
  /*
  Given a String [] words, find and print the longest word in the array. You can assume the elements will have different lengths.
Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.
Main topics: arrays, primitive datatypes, concatenation, index, operators. loops, if statement, String

Example:

Input:
  [aaa, bbbbb, whasstupppp, longg, jaaaaavvaaaaaaaaaa]
Output:
  jaaaaavvaaaaaaaaaa
   */

      public static void main(String[] args) {
          //DO NOT TOUCH BELOW
          Scanner input = new Scanner(System.in);
          String[] words = new String[5]; // Insert 5 String elements (Array size is fixed at 5 elements only)
          for(int i = 0; i < 5;  i++) { // For Loop i to 0 i less than 5 then increment i 1 every iteration
              words[i] = input.nextLine(); //Access element at index i of words array checks through all String elements
          }
          //WRITE YOUR CODE BELOW

          String longestWord = ""; // Stored to find the longest word
          for(String word: words) { //FOR EVERY WORD IN WORDS ARRAY
              if(word.length() > longestWord.length()) { // if word is more than longest word
                  longestWord = word; // Then update word to Longest Word
              }
          }
          System.out.println(longestWord);
      }
  }