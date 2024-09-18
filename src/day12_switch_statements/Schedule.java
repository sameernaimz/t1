package day12_switch_statements;

import java.util.Scanner;

/*
     Task:

        Ask the user to enter which day it is
        print which class we have on that day, and the time of the class

        topic with instructor at time

        challenge:
            make each day flexible

                monday
                Monday
                mon

             reduce repeating code
 */
public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What day do you want to know about?");
        String day = input.next();
        String information = "";

        switch (day) {
            case "Monday":
            case "Mon":
            case "monday":
                information = "We have mentor sessions.";
                break;
            case "Tuesday": case "Tue": case "Friday":
                information = "We do not have a class.";
                break;
            case "Wednesday":
            case "Thursday":
                information = "We have JAVA classes at 7 pm.";
                break;

            case "Saturday":
                information = "We have JAVA classes Starting at 9:30 AM.";
                break;
            case "Sunday":
                information = "We have SOFT SKILLS class.";
                break;
            default:
                information = "Something went wrong!";


        }
        System.out.println(information);


    }
}
