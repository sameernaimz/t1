package day16_tasks;

import java.util.Scanner;
/*
Task #3 - PrintLettersCombination

    Create a class called PrintLettersCombination in your Practice_Programming project and inside the day16_tasks package

        Task:
                    Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
                    The combinations should be displayed in descending alphabetical order:

                    zz

                    zy

                    zx

                    zw

                    zv

                    yz

                    ....

                    vv
 */
public class PrintLettersCombination {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letters : ");

        int i = 0;

        String letters = sc.nextLine().replace(" ", "").toLowerCase();


        while (i < letters.length()) {
            int j = 0; // I Initialize the index for the inner loop

            // Inner loop with while
            while (j < letters.length()) {
                // Print each combination
                System.out.println(letters.charAt(i) + "" + letters.charAt(j));
                j++; // Increment inner loop counter
            }

            i++;

        }
    }
}
