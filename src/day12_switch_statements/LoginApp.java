package day12_switch_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1552
            ssn: 1234

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn
 */
public class LoginApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int actualPin = 4444;
        int actualSSN = 2314;

        System.out.println("Please enter your pincode:");
        int userInputPin = input.nextInt();
        System.out.println("Please, enter the last 4 digits of your SSN:");
        int userInputSSN = input.nextInt();

        if(userInputPin == actualPin && userInputSSN == actualSSN) {
            System.out.println("Authentication is Successful!");
        } else {
            System.out.println("Authentication Failed!");

            if (actualPin != userInputPin) { // Incorrect pin - correct SSN
                System.out.println("Incorrect pincode");
            }
            if (actualSSN != userInputSSN) {
                System.out.println("Incorrect SSN");
            }
        }

    }
}
