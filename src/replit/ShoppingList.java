package replit;

import java.util.Scanner;

/*
You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Example:

Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3
Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
 */
public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//-Declare 4 String variables item1, item2, item3, report.
        String item1;
        String item2;
        String item3;
        String report;


        double price1;
        double price2;
        double price3;
        double TotalPrice;
        System.out.println("Enter Item1 and its price:");

        item1 = scan.nextLine();
        price1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.nextLine();
        price2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter Item3 and its price:");
        item3 = scan.nextLine();
        price3 = scan.nextDouble();
        scan.nextLine();

        double totalPrice = price1 + price2 + price3;

         report = "Item1:" + item1 + "Price:" + price1 + "," + "Item2:" + item2 + "price: " + price2 + "," + "Item3:" + item3 + "Price:" + price3;
        System.out.println(report);
        System.out.println("Total Price:" + totalPrice);
    }
}



