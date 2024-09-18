package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {

        String year = "2024";
            //String year
        //normal Concatenation

        System.out.println("Current year: " + year);
        System.out.println("Next year will be:" + (year + 1));

       int yearInNum = Integer.parseInt(year); // int yearInNum = 2024
        System.out.println("Current year: " + yearInNum);
        System.out.println("Next year will be" +(yearInNum + 1));


        System.out.println("---------------");
        Scanner key = new Scanner(System.in);
        System.out.println("Enter you message in this format: I am $x years old");
        String str = key.nextLine(); // I am 30 years old

        //In 5 years, I will be ## + 5  years old
       String age = str.split(" ")[2]; // "30" ---- > // I am 30 years old -- > ["I", "am", "30", "years", "old"] [2]
        System.out.println("In 5 years, I will be" + age + 5 + " years old");


    }
}
