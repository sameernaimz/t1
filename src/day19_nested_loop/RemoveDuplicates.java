package day19_nested_loop;
/*
    Remove Duplicates
        Write a program that can remove duplicates from a String
         Ex:
                Input: abcabbcd
                Output: abcd
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        String original = "abcabbcd"; // String literals
        String unique = "";

        //loop through and get each character
        // add this character into another container

        for (int i = 0; i < original.length(); i++) { //abcabbcd - > 1 - a | 2 - b | 3 - c | 4 - a | 5 - b

            char eachLetter = original.charAt(i);   // a| b | c | a | b

            if(!unique.contains(eachLetter + "")) { // contains(""); // unique = unique(a) + "b" --> unique = "ab" | unique ="abcd"
                unique += eachLetter;

            }

        }

        System.out.println("Original\t\t : " + original);
        System.out.println("Unique\t\t :" + unique);


        //2ND OPTION SAME BUT WITH CONTINUE

        /*
        for (int i = 0; i < original.length(); i++) { //abcabbcd - > 1 - a | 2 - b | 3 - c | 4 - a | 5 - b

            char eachLetter = original.charAt(i);   // a| b | c | a | b

            if(unique.contains(eachLetter + "")) { // contains(""); // unique = unique(a) + "b" --> unique = "ab" | unique ="abcd"
            continue;
            }
            unique += eachLetter;
        }

         */
    }
}
