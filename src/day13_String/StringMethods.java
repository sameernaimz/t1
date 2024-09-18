package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Micky";
        String name2 = "Micky";
        String name3 = new String("Micky");

        // == --> THIS operator compares the memory location.
        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name2 == name3);

        System.out.println("--------");
        //How about if i want to compare the values of STRINGS.
        // 1. .equals("");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name2.equals(name3));

        System.out.println(name.equals("Micky"));
        System.out.println(name.equals( new String("Micky")));
        System.out.println("Micky".equals(name2));
        System.out.println("Micky".equals(name3));
        System.out.println(new String("Micky").equals(name3));
        System.out.println(new String("Micky").equals(name3));

        String str1 = new String("Micky");
        String str2 = new String("Micky");
        System.out.println(str1.equals(str2));

        System.out.println(new String ("Micky MOUSE").equals(new String ("Micky MOUSE")));

        System.out.println("today".equals("TODAY"));

        boolean compareNames = name.equals(name2);
        System.out.println("compareNames: " + compareNames);
        System.out.println("-----");
        //2- .length();
        String last = "Loopcamp";
        int countLetters = last.length();
        System.out.println(last.length());
        System.out.println("countLetters = " + countLetters);

        //2-
        String word1 = "Monday";
        String word2 = "MONDAY";
        String word3 = " MONDAY"; // FALSE BECAUSE OF SPACE ( MONDAY)

        System.out.println("Ignore Case and Compare:"+ word1.equalsIgnoreCase(word2));
        System.out.println(word1.equalsIgnoreCase(word3));
        System.out.println("-------");
    }
}
