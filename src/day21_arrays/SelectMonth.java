package day21_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number so, i can return you the Month name related to that number.");


        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; //12
        //                     0       1     2      3       4      5    6       7       8     9     10      11
        // System.out.println(months.length);

        //   System.out.println(months[0]);
//        System.out.println(months[0]);
//        System.out.println(months[months.length-1]);
        int num;
        do {


            System.out.println("Enter :");
             num = sc.nextInt();

            if (num >= 1 && num <= 12) {
                System.out.println("The number you entered is " + months[num - 1]);
            } else {
                System.out.println("Wrong input. There is no month for that number :" + num + "Try Again!");
            }
        } while (num < 1 || num > 12);

        //Positive test: Making sure I am getting expected result for the VALID INPUTS
        //Negative test: Making sure i am getting expected "Error" or whatever is my expected for INVALID INPUT
    }
}
