package day21_arrays;
/*
    all String types
    0 -> id
    1 -> first name
    2 -> last name
    3 -> batch number

 */

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        System.out.println("--------------------");
        String [] student1 = {"AB001", "Tom", "Jerry", "B#03"};
        System.out.println(Arrays.toString(student1));

        System.out.println("--------------------");
        String [] student2 = new String[4];
        student2[1] = "Winnie";
        student2[3] = "B#03";
        student2[0] = "AB002";
        System.out.println(Arrays.toString(student2)); // The default value for String is null
        student2[2] = "Pooh";
        System.out.println(Arrays.toString(student2));

        System.out.println("--------------------");
        String [] student3 = new String[4];
        Scanner key = new Scanner(System.in);

        System.out.print("Enter your ID:");
        student3[0] = key.nextLine();

        System.out.print("Enter your Name:");
        student3[1] = key.nextLine();

        System.out.print("Enter your last Name:");
        student3[2] = key.nextLine();

        System.out.print("Enter your Batch number: ");
        student3[3] = key.nextLine();

        System.out.println(Arrays.toString(student3));

        System.out.println("---------------");

        String [] questions = {"Enter your ID", "Enter your first Name", "Enter your last Name", "Enter your batch number"};
        String [] student4 = new String[4];

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            student4[i] = key.nextLine();
        }
        System.out.println(Arrays.toString(student4));

    }
}
