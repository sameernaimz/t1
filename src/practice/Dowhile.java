package practice;

import java.util.Scanner;

/*
Two players;
One players comes up with a number from 1 to 100
Second One has to guess the nu,ber
give the plAYERS HINT
if number is lower then number is too low, try again
if nu,ber is higher then number is too high, try again
if number is matched then print congratulations, you made it
 */
public class Dowhile {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int secretNum = 5;
            int guessNum;

            do {
                System.out.println("Enter the number: ");
                guessNum = input.nextInt();

                if (guessNum < secretNum) {
                    System.out.println("It is too low, try again.");
                } else if (guessNum > secretNum) {
                    System.out.println("It is too high, try again.");
                } else {
                    System.out.println("Congratulations, you win!");
                }
            } while (guessNum != secretNum);
    }
}
