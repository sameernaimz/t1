package day21_arrays;

import java.util.Arrays;

/*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
        Input: [4,1,3,12,5]
        Output:
            Even: 2
            Even Numbers: 4 14 20
            Odd: 3
            Odd Numbers: 1 3 5 13
 */
public class ReverseArray {
    public static void main(String[] args) {

        int [] arr  = {1,2,3,4,5};
       int [] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            reversed[arr.length-1 - i] = arr[i];

        }

        for (int i = arr.length-1; i >= 0; i++) {


          //  arr[i] = arr[arr.length-1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reversed));
    }
}
