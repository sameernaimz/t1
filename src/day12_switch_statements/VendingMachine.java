package day12_switch_statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to the vending machine.");
        System.out.println("Please, select one of the following: \n\tDrinks\n\tSnacks\n\tGums");
        System.out.print("\n\tSELECT:");
        String selectedItem = key.next();
        String item = "";
        switch (selectedItem) {
            case "Drinks":
                System.out.println("\nYou selected Drinks! \n Choose Drink of choice by pressing number: \n\t1-Water\n\t2- Soda\n\t3-Juice ");
                System.out.print("\n\tEnter: ");
             int drinkOptionNum =  key.nextInt();

            if (drinkOptionNum == 1) {
                item = "Water";
            } else if (drinkOptionNum == 2) {
                item = "Soda";
            } else if (drinkOptionNum == 3) {
                item = "Juice";
            } else {
                System.out.println("Invalid option selected");

             }
            break;
            case "Snacks":
                System.out.println("\nYou selected Snacks! \n Choose Drink of choice by pressing number: \n\t1-Candy\n\t2-Chips\n\t3-Cookies ");
                System.out.print("\n\tEnter: ");
                int snackOptionNum =  key.nextInt();
                if (snackOptionNum == 1) {
                        item = "Candies";
                    } else if (snackOptionNum == 2) {
                        item = "Chips";
                    } else if (snackOptionNum == 3) {
                        item = "Cookies";
                    } else {
                        System.out.println("Invalid option selected");
                }
                break;
                case "Gums":
                    System.out.println("\nYou selected Gums! \n Choose Drink of choice by pressing number: \n\t1-Mentos\n\t2- Love\n\t3-Turbo ");
                    System.out.print("\n\tEnter: ");
                    int gumOptionNum =  key.nextInt();
                    if (gumOptionNum == 1) {
                        item = "Mentos";
                    } else if (gumOptionNum == 2) {
                        item = "Love";
                    } else if (gumOptionNum == 3) {
                        item = "Turbo";
                    } else {
                        System.out.println("Invalid option selected");
                    }
                    break;
            default:
                System.out.println("not valid option ");
        }
        System.out.println("Vending...."
        + item);
    }
}
