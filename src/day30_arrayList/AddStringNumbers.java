package day30_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
String numbers to sum

 */
public class AddStringNumbers {

    public static ArrayList<Integer> addStringNumbers(ArrayList<String> numsToSum) {

    ArrayList<Integer> sums = new ArrayList<>();

    for (String each : numsToSum ) {

        int sumOfEach = 0;

    for (String eachLetter : each.split("")) { //["1',"2",'3"]

        sumOfEach += Integer.parseInt(eachLetter);
    }
    sums.add(sumOfEach);
    }

    return sums;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        ArrayList <Integer> summedVersion = addStringNumbers(list);
        System.out.println(summedVersion);
        System.out.println(addStringNumbers(list));
    }
}
