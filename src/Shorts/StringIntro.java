package Shorts;

public class StringIntro {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2);

        System.out.println("========================");

        String str3 = new String("Hello");

        String str4 = new String("Hello");

        System.out.println(str3 == str4);
        System.out.println("================");
        String name = "Loop Academy";
        System.out.println(name.toUpperCase());
        System.out.println(name);

    }
}
