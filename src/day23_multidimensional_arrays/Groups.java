package day23_multidimensional_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][]  groups2 = new String[4][3]; // 2D array will hold total 4 SINGLE dimensional array which will have 3 elements on each

        System.out.println();
        String [][] groups = new String[4][]; // 2D array will hold total 4 SINGLE dimensional array
        System.out.println(Arrays.deepToString(groups));


        String [] groupTwo = {"Dilara" , "Laura" , "Alex"};
        groups[0] = groupTwo;
        System.out.println(Arrays.deepToString(groups));

        String [] groupThree = {"Alona" , "Roma" , "Kanan"};
        groups[2] = groupThree;
        System.out.println(Arrays.deepToString(groups));

        groups[3] = groupThree;
        System.out.println(Arrays.deepToString(groups));

        groups[1] = groups[0];
        System.out.println(Arrays.deepToString(groups));

        groups[3] = new String [] {"John", "Micky"};
        System.out.println(Arrays.deepToString(groups));

        System.out.println();

        for ( String [] each : groups) { // This will loop through 2D array and get SINGLE arrays
            System.out.println(Arrays.toString(each));

            for (String eachName : each) {

                System.out.println(eachName);
            }
        }
    }
}
