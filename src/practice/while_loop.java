package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        do {
            System.out.println("Enter your name");
            name= scan.nextLine();

        }
        while(name.isBlank());
        System.out.println("Hello" + name);
    }
}
