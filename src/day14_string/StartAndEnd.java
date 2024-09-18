package day14_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Loopcamp";

        System.out.println(str.startsWith("Loop"));
        System.out.println(str.startsWith("loop"));

        System.out.println(str.startsWith("Loopcamp"));
        System.out.println(str.startsWith("Loopcamp!"));

        String str2 = "Loop";
        System.out.println(str.startsWith(str2)); // does the str starts with str2 which is Loop
        System.out.println(str.startsWith(" Loop"));
        System.out.println( "Loop");
        System.out.println(str.startsWith(   "Loop"));

        String sentence = "Today it was a Java day";
        System.out.println(sentence.startsWith("Today it was"));
        System.out.println(sentence.startsWith("Today it was aJava day"));
        System.out.println(sentence.startsWith("Today "));
        System.out.println(sentence.startsWith("Today"));


        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day"));
        System.out.println(sentence.endsWith("  day"));
        System.out.println(sentence.endsWith(" Java "));

        System.out.println(sentence.startsWith("Today it was a Java day"));
        System.out.println(sentence.endsWith("Today it was a Java day"));

        boolean result1 = str.startsWith("Loop");
        boolean result2 = str.endsWith("camp");
    }
}
