package day12_switch_statements;


import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO ATM\n\tPlease, enter your card. \nThen and type your pincode: ");
        int userInputPin = input.nextInt();

        int expectedPin = 6789;
        double balance = 1_000_000.00;
        if (userInputPin == expectedPin) {

            System.out.println("You are logged in.");
            System.out.println("Select a number for your need:");
            System.out.println("\t1 - Check Balance");
            System.out.println("\t2 - Withdraw");
            System.out.println("\t3 - Deposit");
            System.out.println("\tYour Choice: ");

            int option = input.nextInt();
            if (option == 1) {
                System.out.println("Your balance is $" + balance);
            } else if (option == 2) {
                System.out.println("How much do you want to withdraw? $");
                double withdrawAmount = input.nextDouble();
                System.out.println("Stand by... Withdrawing $" + withdrawAmount);
                balance -= withdrawAmount;
                System.out.println("Your balance is AFTER withdraw $" + balance);
            } else if (option == 3) {
                System.out.println("Please, insert the money: $");
                double deposit = input.nextDouble();
                balance += deposit;
                System.out.println("Your balance is AFTER deposit $" + balance);
            } else {
                System.out.println("Invalid option, Existing the account");
            }

        } else {
            System.out.println("invalid pin come back tommorow");
        }


    }
}
