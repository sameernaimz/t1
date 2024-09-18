package day26_methods;

import java.util.Arrays;

public class AddElemInArr {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};

        // int [] b = null; // "'

        addElemInArr(a, 5);

        int[] b = addElemInArr(a, 5);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.toString(addElemInArr(b, 943)));
    }


    // create a method that accepts int [] and a number and returns an int [] and a number and returns an int [] with added element in it,

    public static int[] addElemInArr(int[] origArr, int elemToAdd) {

        int[] newArr = Arrays.copyOf(origArr, origArr.length + 1);
        // {1,2,3, _}
        newArr[newArr.length - 1] = elemToAdd;

        return newArr;
    }

    public static int[] addElemInArr2(int[] origArr, int elemToAdd) {

        int[] newArr = new int[origArr.length + 1];
        // {1,2,3, _}
        for (int i = 0; i < origArr.length; i++) {
            newArr[i] = origArr[i];
        }
        //{1,2,3_}
        newArr[newArr.length - 1] = elemToAdd;

        return newArr;
    }
}