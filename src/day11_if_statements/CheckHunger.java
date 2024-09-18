package day11_if_statements;

import java.util.Scanner;

/*
    boolean variable isHungry

        if the person is hungry,print: You are hungry, so I will get some food for you.

        if the person is not hungry, print: Great, then practice java

 */
public class CheckHunger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you hungry [true/false]:");
        boolean isHungry = sc.nextBoolean();

        // Approach #1 - SINGLE IF statement
        if(isHungry) {
            System.out.println(" You are hungry, so I will get some food for you.");

        }
        if(!isHungry) {
            System.out.println("Great, then practice java");
        }

        //Approach #2 IF-ELSE statement
        if(isHungry) {
            System.out.println(" You are hungry, so I will get some food for you.");
        } else {
            System.out.println("Great, then practice java");
        }
        //Approach #3 IF-ELSE statement - same as above - just to syntax with NO BRACKETS
        if(isHungry)
            System.out.println(" You are hungry, so I will get some food for you.");
            else
            System.out.println("Great, then practice java");

    }
}
