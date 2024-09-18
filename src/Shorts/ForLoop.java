package Shorts;

public class ForLoop {
    public static void main(String[] args) {

        String word = "Hello World";

        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);

        System.out.println("--------------------");

        for (int i = 0; i <= 5; i++) {
            System.out.println("word = " + word);
            System.out.println("number of runs: " + i);
        }
    }
}
