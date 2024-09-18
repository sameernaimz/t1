package day24_methods;
/*
    make a method that calculates the prints the age
    takes the birth year as an input
 */

import java.util.Scanner;

public class Age {
    public static void getAge(int birthYear) { // METHOD ACCEPTING just int as parameter
        System.out.println("Age: " + (2024 - birthYear));
    }
    public static void main(String[] args) {
        getAge(2000); // HERE WE JUST PASSING VALUE DIRECTLY


        int year = 1990;
        getAge(year); // I PASSED THE VALUE FROM VARAIBLES

        //getAge(); // this will give an error because we do NOT have a method getAge() which does not have anything in parenthesis

        Scanner key = new Scanner(System.in);
        System.out.println("WHAT WERE YOU BORN?");
        //int year2 = key.nextInt();
        getAge(key.nextInt());
    }
}
