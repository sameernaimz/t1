package Shorts;

public class Ternary {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int max;

        if (x > y) {
            max = x;
        } else {
            max = y;
        }

        System.out.println(max + " => I am from if Statement");
        System.out.println("====================");
        max = (x>y) ? x : y;
        System.out.println(max + " => I am from ternary");

        int age = 25;
        String message;

        message = (age < 18)? "You are a minor" : (age > 65)? "You are a senior" : "You are an adult";
        System.out.println(message);
    }
}
