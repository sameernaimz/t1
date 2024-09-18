package day37_tasks;

import java.sql.SQLOutput;

/*

    E) Create a concrete class called Amazon in your Practice_Programming project and inside the da37_tasks package
Note:  - Make the class final


        Task:
- Inherit OnlineShopping and implement all abstract methods

 */
public final class Amazon extends OnlineShopping {
    @Override
    public void viewCart() {
        System.out.println("you are viewing your Amazon shopping cart");
    }

    @Override
    public void payForShipping(boolean isPayed) {
        if (isPayed) {
            System.out.println("FREE SHIPPING!");
        }  else {
            System.out.println("HAVE TO PAY FOR SHIPPING !");
        }
    }

    @Override
    public void buyItem() {
        System.out.println("You are buying your item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("You are returning your item from Amazon");
    }


}
