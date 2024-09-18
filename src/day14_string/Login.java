package day14_string;

import java.sql.SQLOutput;
import java.util.Scanner;

/*

    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password


 */
public class Login {
    public static void main(String[] args) {

        String expectedPassword = "loopcamp";
        String expectedUsername = "java";

        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your username: ");
      String usernameFromUser = key.next();

      usernameFromUser = usernameFromUser.toLowerCase();

        System.out.println("Please, enter your password: ");
        String passwordFromUser = key.next();

        if(passwordFromUser.length() >= 8
                && expectedPassword.equals(passwordFromUser)
        && expectedUsername.equals(usernameFromUser)) { // java vs JAVA both work for username
            System.out.println("logged in");
        } else {
            System.out.println("invalid password");
        }


    }
}
