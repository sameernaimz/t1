package day29_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> shoppingList = new ArrayList<>();

        // Can you make this a reusable method
       // System.out.println(shoppingList.isEmpty() ? "Shopping List is empty!" : "You have some items");

        System.out.println(statusOfShoppingList(shoppingList));
        String userAnswer = "";
        do {

            System.out.print("Enter the item: ");
            shoppingList.add(input.nextLine());

            System.out.print("Do you want to continue? (Y/N): ");
             userAnswer = input.nextLine();

            shoppingList.add(input.nextLine());
        } while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")); // ask as long as user say YES. Yes, yes, y , Y
        // loop through list
        System.out.println("Shopping List: " + shoppingList.size() + "item :");
        for (String item : shoppingList) {
            System.out.println("\t" + item);
        }


        System.out.println(statusOfShoppingList(shoppingList));

        //Check if shopping list has an item: $item is on list / $item is not on list
        System.out.println("---------------------");
        System.out.print("What item so you want to check if it is in the list?");
        input.nextLine(); // hat

        itemAvaliability(shoppingList, input.nextLine());

        System.out.println("------------------");

        System.out.println("Do you want to remove any item?");
        if (input.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("What item do you want to remove: ");
         String itemRemove = input.nextLine(); //USER ENTERS ITEM TO REMOVE ---> "Bread" - "1"

            // "1" -- "Bread"
            if (Character.isDigit(itemRemove.charAt(0))) {

                int num = Integer.parseInt(itemRemove); // 1"/"10" --> 1,10

                shoppingList.remove(num - 1);

            } else {
                shoppingList.remove(itemRemove);
            }
        }
    }


        public static String statusOfShoppingList(ArrayList <String> sl) {
            return sl.isEmpty() ? "Shopping List is empty!" : "You have some items";
        }
        public static void itemAvaliability (ArrayList <String> sl, String itemToCheck) {
            System.out.println(sl.contains(itemToCheck) ? itemToCheck + "is on list" : itemToCheck + " is not on list");
        }
    }

