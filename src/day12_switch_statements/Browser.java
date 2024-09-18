package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your browser");
       String browserType =  input.next();

       switch (browserType) {

           case"Chrome":
               System.out.println("Opening Google in browser");
               break;
               case "Firefox":
                   System.out.println("Opening Firefox in browser");
                   break;
           case "Safari":
           case "safari":
           case "SAFARI":
               System.out.println("Opening Safari in browser");
               break;
           default:
               System.out.println("We do not have browser type is invalid or not available");
       }

    }
}
