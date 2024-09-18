package day13_String;

import java.util.Scanner;

public class StringMemory {
    public static void main(String[] args) {
        // Stack STR1    Heap value
        String str1 = "java"; // Option 1 - by STRING LITERALS



        String str2 = new String("java"); // Option 2 - by 'new" KEYWORD

        String str3 = "java";

        String str4 = "javac";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("--------");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);


    }
}
