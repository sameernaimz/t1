package day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {

        // ArrayList <int> numbers = new ArrayList<>(); //ArrayList DOES NOT accept PRIMITIVE datatypes

        ArrayList <Integer> numbers = new ArrayList<>(); //At this line, in my ArrayList there is NO element.
                                                        //IT IS PRESERVED LOCATION FOR 10
        System.out.println(numbers);
        System.out.println(numbers.size()); // THE DEFAULT CAPICITY IS 10, BUT SIZE STILL 0 HERE
/*
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums)); // 1,2,3,4
        // add/assign to Array ---> num[2] = 45;
        nums[2] = 45;
        System.out.println(Arrays.toString(nums)); // 1,2,45,4
*/

        // add/assign to arrayList
        numbers.add(40); //added 40 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(-40); //added -40 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);

        //In array how do we access each element: nums[index];

       // numbers[1];
        System.out.println(numbers.get(0) );
        System.out.println(numbers.get(1) );
        System.out.println(numbers.get(2) );
        System.out.println(numbers.get(3) );
      //  System.out.println(numbers.get(4) ); // IndexOutOfBounds Exception

        //How do we know the number of total elements in ArrayList
        //Array ---> nums.length

        System.out.println(numbers.size());


        // Reviewing the CONVERSION
        Integer a = numbers.get(0) ; // Integer
        int b =  numbers.get(0) ;  // Integer -- > int  --- > UNBOXING


        int c = numbers.size(); // int = int
        Integer d =  numbers.get(0) ; // int --- >  Integer ---- > AUTOBOXING

    }
}
