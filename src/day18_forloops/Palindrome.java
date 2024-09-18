package day18_forloops;

import java.util.Scanner;

/*
      Palindrome: its the same reading from the beginning and end

      Ex:
          mom
          racecar
          anna
          madam

      Task: Check if a word is palindrome

      Flow:
          declare some initial String
          how to reverse a String
          check if the reverse version is the same as the original
   */
public class Palindrome {
    public static void main(String[] args) {

        Scanner key  = new Scanner(System.in);

        String str = key.next();
        String reversed = "";

        //First i need to reverse that word.
        // second I need to Compare if they are equal
        //  If EQUAL - PRINT it is Palindrome
        //      else ---- PRINT it is not Palindrome

        //How can I reverse
        // start taking the characters from end
        // and add it into the new container one by one.

       // str.charAt(str.length()-1);

       // reversed += "" + str.charAt(str.length()-1);

        for (int i = str.length() - 1; i >= 0 ; i--) {// abcd -- > 3            | 2                      | 1                      | 0                       | -1
            reversed += str.charAt(i);         // reversed = "" + d;     | reversed = "d" + "c";  | reversed = "dc" + "b"; | reversed = "dcb" + "a";
        }
        //reversed = 'dcba';

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }

        //HOW TO DO WITH TERNARY
        System.out.println(str.equalsIgnoreCase(reversed) ? "PALINDROME" : "NOT PALINDROME");
    }
}
