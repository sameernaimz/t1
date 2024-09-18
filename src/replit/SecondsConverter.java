package replit;
//Seconds Converter
import java.util.*;
/*
Write a program that will take a number of seconds and converts it to a number of hours, minutes and seconds
Create a Scanner object

Declare four int variables: inputSeconds, hours, minutes, seconds

Ask the user to enter the total number of seconds:

Enter seconds:

Taking the given number of total seconds calculate how many hours come from that many seconds, then how many left over minutes can come from those seconds and finally how many leftover seconds there is.
Hint: Use % (remainder) and / operators to calculate the hours, minutes, and seconds
 */
public class SecondsConverter {
        public static void main(String[] args) {
            //YOUR CODE HERE:
            Scanner scan = new Scanner(System.in);

            // ask user to enter seconds using scanner
            System.out.println("Enter seconds:");
            int inputSeconds;
            inputSeconds = scan.nextInt();

            int hours;
            int minutes;
            int seconds;

            // divide by 3600 (number of seconds in an hour)
            hours =  inputSeconds / 3600;
            // divide by converting number of seconds into minutes
            minutes = inputSeconds % 3600 / 60;
            // divide by converting the remaining seconds into seconds
            seconds = inputSeconds % 60;

            System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");



        }
    }


