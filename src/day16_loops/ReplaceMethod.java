package day16_loops;

import java.sql.SQLOutput;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s = "Java is a language";
      s =  s.replace('a','e');
        System.out.println(s);


        String day = "Today is Wednesday. We will do Practice. It is Wednesday";
      day =  day.replace("Wednesday", "Today");
      day = day.replace("Wednesday", "Sunday");

        System.out.println(day);

        int firstDot = day.indexOf(".");
        int lastDot = day.lastIndexOf(".");


        String middle = day.substring(firstDot + 2, lastDot).trim();
        System.out.println(middle);


        String word = "Loop";
        word = word.replaceFirst("o","u");

        System.out.println(word);
    }
}
