package Shorts;

public class StringMethods {
    public static void main(String[] args) {

        String str1 = "Loop Academy";
        //            0123
        System.out.println("str1.charAt(0) = " + str1.charAt(0));
        System.out.println("str1.charAt() = " + str1.charAt(5));


        System.out.println("=================");
        //toLowerCase() => returns String to lowercase => string
        String str3 = "LOOP";
        System.out.println("str3 = " + str3.toLowerCase());


        //toUpperCase() = > returns String to uppercase => string
        String str4 = "loop";
        System.out.println("str4 = " + str4.toUpperCase());

        System.out.println("=================");

        String str5 = "    Loop Academy   ";
        System.out.println("str5 = " + str5);
        System.out.println("str5 =" + str5.trim());

        System.out.println("=================");

        //indexOf() -> accepts char returns index of that char => int
        String str6 = "    loop academy ";
        System.out.println("str6.indexOf('l') = " + str6.indexOf('l'));
        System.out.println("str6.lastIndexOf('l') = " + str6.indexOf('o'));
        System.out.println(str6.indexOf("op"));


        System.out.println("================");
    }
}
