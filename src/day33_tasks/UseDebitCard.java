package day33_tasks;

import java.sql.SQLOutput;

public class UseDebitCard {
    public static void main(String[] args) {
        DebitCard debit1 = new DebitCard(1543323420093322L,"Johnny Bo", 20_000);


        System.out.println(debit1);


        System.out.println("=======================================");


        DebitCard debit2 = new DebitCard(8884233540070075L, "HGH Enterprises", "Apple Card", 4374, 98000);


        System.out.println(debit2);
    }
}
