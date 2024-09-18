package day22_arrays;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};

        int[] c = a;

        System.out.println(a == b); //DO NOT USE == to compare arrays
        //COMPARES 2 DIFFERENT ARRAY OBJECT

        System.out.println(Arrays.equals(a, b));

        System.out.println(a == c);    // DO NOT USE == to compare arrays
        //IN this case, it will be true because a and c point to same array object

        boolean result = Arrays.equals(b, c);
        System.out.println(result);

        int[] d = {4, 3, 2, 1};
        System.out.println(Arrays.equals(a, d)); //
        Arrays.sort(d);
        System.out.println(Arrays.equals(a, d)); //
    }
}
