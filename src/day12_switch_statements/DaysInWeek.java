package day12_switch_statements;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the day of the week: 1-7 ");
        int num = key.nextInt();
 String message;
        switch (num) {
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
               message = "Friday";
                break;
            case 6:
                message = "Saturday";
                break;
            case 7:
                message = "Sunday";
                break;
            default:
              message = "Invalid day entered needs to be 1-7";
        }
        System.out.println(message);
    }
}
