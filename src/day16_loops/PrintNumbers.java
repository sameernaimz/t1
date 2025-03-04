package day16_loops;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {

        int num  = 2;
        // can you print all the even numbers up until 100;


        while (num <= 100) {
            System.out.println(num);
            num += 2;

        }
        System.out.println("--------------");

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;

        }
    }

    /*
            write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
            1
            Ask a user:
            Tell if it is biggest or smallest.


            2
            Ask a user:
            Tell if it is biggest or smallest.

            3
            Ask a user:
            Tell if it is biggest or smallest.
         */
    public static class MaxAndMin {
        public static void main(String[] args) {

     Scanner key = new Scanner(System.in);

            System.out.println("How many numbers do you want to compare :");
            int numOfCycle = key.nextInt();

     int n = 1;
    int userNum;
    String allNums = "";
    //-2,147,483,647 to 2,147,483,647
    int max = -2_147_483_647;
    int min = 2_147_483_647;

     while (n <= numOfCycle) {
         System.out.println("Please, enter a number:");
       userNum = key.nextInt(); // 78 | 100 | 45 |  -34 | 21
         allNums += " " + userNum;


       if(userNum > max) {
           max = userNum; // max = 78; 100

       }
         if(userNum < min) {
             min = userNum; // max = 78;  45;, -34

         }


         n++;

         }
            System.out.println(min); //-34
            System.out.println(max); //100
            System.out.println("All the numbers from User" + allNums);
     }
    }
}
