package practice;

import java.util.Arrays;

/*
Task #5

Create a method that solves the following task. And call it in the main method

An array is given:
int[] array = {9, 2, 6, 4, 5, 12, 7, 7, 8, 6};
it is necessary to output the maximum and  minimum value of the array.
 */
public class task5Igor {
public static int[] findMinMax (int[] arr) {
   int min = arr[0];
   int max = arr[0];
    for (int num : arr) {
        if (num < min) min = num;
        if (num > max) max = num;

    }
        return new int[] {min, max};

    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 4, 5, 12, 7, 7, 8, 6};
        int[] minMax = findMinMax(arr);
        System.out.println(findMinMax(arr));
        System.out.println("Minimum value: " + minMax[0]);
        System.out.println("Maximum value: " + minMax[1]);

        }

    }


