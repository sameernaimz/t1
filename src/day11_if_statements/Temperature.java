package day11_if_statements;

import java.util.Scanner;

/*

    Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
 */
public class Temperature {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, Enter the temperature: ");
      int temp =  key.nextInt();
            if(temp> 70 || temp == 70) {
                System.out.println("Its a nice day Go outside, but with your laptop to code java");
            }
            if (temp >= 70) {
                System.out.println("Its a nice day Go outside, but with your laptop to code java");

            } else {
                System.out.println("It is too cold");
                System.out.println("code more java");
            }

    }

}
