package day18_forloops;

public class Backwards {
    public static void main(String[] args) {


        // can you print the numbers STARTING from 20 and print it until 0 [INCLUDE 0 TOO}
        for (int i = 20; i >= 0 ; i--) {
            System.out.println(i);
        }

        System.out.println("----");
        String str = "loop";
     //   System.out.println(str.charAt(str.length()-1));


        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
        // iteration part is not updated minusing 2 on each cycle
        for (int i = str.length() - 1; i >= 0; i-=2) {
            System.out.println(str.charAt(i));
        }
    }
}
