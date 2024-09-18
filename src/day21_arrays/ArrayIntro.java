package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        String str = "Chicago NewYork Houston Denver Pittsburgh";
        System.out.println();

        String city = "Chicago";
        System.out.println(city.charAt(0));
        System.out.println(city.charAt(1));
        System.out.println(city.charAt(2));
        System.out.println(city.charAt(3));
        System.out.println(city.charAt(4));
        System.out.println(city.charAt(5));
        System.out.println(city.charAt(6));

        String city2 = "New York";
        String city3 = "Houston";
        String city4 = "Denver";
        String city5 = "Pittsburgh";
        // I DECLARED A STRING ARRAY that holds 5 STRING VARS

        // String cities []; -- This is another way to declare Array
        String [] cities = {"Chicago", "New York", "Houston", "Denver", "Pittsburgh" };

        // How to access each element in the array
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        //How to print all Cities USING INDEXES
        System.out.println("All Cities: "+cities[0] + ", " + cities[1] + ", " + cities[2] + ", " + cities[3] + ", " + cities[4]);

        System.out.println("All Cities REVERSED: "+cities[4] + ", " + cities[3] + ", " + cities[2] + ", " + cities[1] + ", " + cities[0]);


        //How can i print all ARRAY
        System.out.println(cities); // -- THIS PRINT HASH CODE LIKE MEMORY LOCATION {WRONG}

        System.out.println(Arrays.toString(cities)); // We use Arrays CLASS FROM java.util package that has a method .toString(array); which helps to print array

                //H0W can i get rid of the square brackets [] in out put - you can assign to String or you xan do it in print statement directly
            String ConvertArr = Arrays.toString(cities).replaceAll("," , "");
        System.out.println(ConvertArr.substring(1, ConvertArr.length()-1));
        System.out.println(ConvertArr);


        //How do I know, how many element we have in array
        System.out.println(cities.length);
    }
}
