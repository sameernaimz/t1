package day38_tasks;
/*
E) 	Create a class called Library in your Practice_Programming project and inside the da38_tasks package



Task:
        - Create objects of the JavaTextbook with all possible references and try to access all the variables and methods with each reference
        */

import javax.swing.*;

public class Library {
    public static void main(String[] args) {
        JavaTextbook j1 = new JavaTextbook();
        j1.name = "Ultimate Java Programming Textbook";
        System.out.println(j1.name);
        System.out.println("--------------");
        j1.read();
        j1.download();
        j1.size = 3;
        System.out.println(j1.size + "Meters");
        System.out.println();
        j1.open();
        j1.hello = "JAVA is fun";
        System.out.println(j1.hello);

        System.out.println("-------------");

        Ebook e1 = new JavaTextbook();
        e1.name = "Ultimate Java Programming Ebook";
        System.out.println(e1.name);
        e1.read();
        e1.size = 7.6;
        System.out.println(e1.size + "MB");
        System.out.println();
        e1.open();
        e1.download();
        System.out.println("--------------");

        Book b1 = new JavaTextbook();
        b1.name = " Red Book";
        System.out.println(b1.name);
        b1.read();
        System.out.println("---------------");

        Downloadable d1 = new JavaTextbook();
        d1.download();
        System.out.println("----------------");

    }

}
