package day16_tasks;

import java.util.Scanner;

/*
Task #2 - MinMax

    Create a class called MinMax in your Practice_Programming project and inside the day16_tasks package

        Task:
                    //write a program that asks user to enter 5 numbers and returns the maximum number
                    //write a program that asks user to enter 5 numbers and returns the minimum number
                    //write a program that asks user to enter 5 numbers and returns the minimum and maximum numbers

 */
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int i = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (i < 5) {
            int number = sc.nextInt();
            if (number < min) {
                min = number;

            }
            i++;
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        // Resetting the scanner and index for the next task
        Scanner sd = new Scanner(System.in);
        i = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        // Using while loop to find both minimum and maximum numbers
        while (i < 5) {
            int num = sd.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            i++;
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }

}
