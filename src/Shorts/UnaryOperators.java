package Shorts;

public class UnaryOperators {
    public static void main(String[] args) {

        //positive negative
        int a  = -10;
        int b = +10;

        boolean isPositve = b > 0;

        boolean isNegative = a < 0;

      //  System.out.println(isNegative);

        // increment decrement

        int c = 10;
//        System.out.println(c);
//        c = ++c;
//       System.out.println(c);
//
//        System.out.println(++c);

        int d = 100;
        int e = d--;
//        System.out.println(e);
//        System.out.println(d);

        int m = 100;
        int n = m--;
        System.out.println(m);
        System.out.println(n);
    }
}
