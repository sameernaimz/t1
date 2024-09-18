package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

    Ex:
        {45, 123, 62}
        adding 100
        {45, 123, 62, 100}
 */
public class AddElement {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("How many elements in you first array you want to have: ");
        //int firstArraySize = key.nextInt();
        int [] firstArr = new int[key.nextInt()]; // 3

        for (int i = 0; i < firstArr.length; i++) {

            System.out.println("Enter your data/value: ");
            firstArr[i] = key.nextInt();

        }

        //Please, enter your number of element one by one pressing enter

        System.out.println("First Array" + Arrays.toString(firstArr));

        System.out.print("How many elements do you want to add to the First Array ");
        //  int numsToAdd = key.nextInt();
        int [] SecondArr = Arrays.copyOf(firstArr, firstArr.length + key.nextInt() );

        for (int i = firstArr.length; i < SecondArr.length; i++) { // [23 , 66 ,77]
            SecondArr[i] = key.nextInt();


        }
        System.out.println("Second Array" + Arrays.toString(SecondArr));

    }
}
