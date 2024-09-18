package Shorts;

import java.util.function.BiPredicate;

public class BipPredicatePractice {
    public static void main(String[] args) {


        //An Array
        // an int
        // will return if that array contains the int

        BiPredicate<int[], Integer> contains = (arr, number) -> {
            boolean result = false;
            for (int each : arr) {
                if (each == number) {
                    result = true;
                    break;

                }
            }
            return result;

        };
        int[] arr  = {1, 3, 5, 6, 7, 10};
        int number = 100;
        boolean r = contains.test(arr, number);
        System.out.println("r" + r);

    }
}
