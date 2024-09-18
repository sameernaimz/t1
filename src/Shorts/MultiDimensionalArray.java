package Shorts;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int [] arr1 = {10,20,30};
        int [] arr2 = {40, 50};
        int [] arr3 = {60, 70, 80, 90};

        /*
        int [] [] array2D = new int [3][];

        array2D[0] = arr1;
        array2D[1] = arr2;
        array2D[2] = arr3;

        System.out.println(Arrays.deepToString(array2D));

         */
        //         indexes of arrays             0           1       2
        int [] [] arrays2D1 = {{10,20,30},{40,50}, {60,70,80,90}};
        //indexes of elements   0  1  2     0  1     0 1  2   3

        // {40, 50}
        System.out.println(Arrays.toString(arrays2D1[1]));
        System.out.println(Arrays.toString(arrays2D1[0]));

        //80
        System.out.println(arrays2D1[2][2]);



        String [][] teams = {{"Natalia", "Ilgar" , "Nurida"}, {"Vafas" , "Parvana"} , {"Yuliia", "Mike", "Anastasiia", "Nigara"}};
        System.out.println(Arrays.deepToString(teams));

        System.out.println(Arrays.toString(teams[1]));

        System.out.println(teams[2][0]);



    }
}
