package day17_loops;

import java.util.Scanner;
/*
repeated actions
-ask the user to enter the item
-add item to the shopping list
-ask user if they want to add more items
 */
public class ShoppingList {
    public static void main(String[] args) {

        Scanner key =  new Scanner(System.in);
        String list = "Shopping List:";
        String userAnswer = "";


        do {
            System.out.println("Please, enter the name of the item");
            String userItem = key.nextLine();
            list = list + "\n\t" + userItem;

            System.out.println("Do you want to add more item? ");
             userAnswer = key.nextLine(); //YES , yes , Y, y


        } while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"));

        System.out.println(list);
    }
}
