package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList <>(); // Memory allocates 10 capacity
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("energy drinks");
        drinks.add("soda");
        System.out.println(drinks);

        ArrayList<String> drinks2 = new ArrayList <>(drinks); //WE create a NEW array list by copying another array list
        System.out.println(drinks2);


        String [] allDrinks = {"coffee","tea","energy drinks","soda"};
        //ArrayList <String> drinks3 = new ArrayList<>(allDrinks); // NOT VALID - it has to be Collection Type
        ArrayList <String> drinks3 = new ArrayList <>(Arrays.asList(allDrinks));
        System.out.println(drinks3);


        ArrayList<String> drinks4 = new ArrayList <>(Arrays.asList("coffee","tea","energy drinks","soda"));
        System.out.println(drinks4);

        System.out.println("BULK OPERATIONS");
        ArrayList <String> drinks5 = new ArrayList <>();

        drinks5.addAll(Arrays.asList(allDrinks));
        System.out.println(drinks5);

        ArrayList <String> drinks6 = new ArrayList <>();
        drinks6.addAll(Arrays.asList("coffee","tea","energy drinks","soda"));
        System.out.println(drinks6);
        drinks6.add("test1");
        System.out.println(drinks6);
        drinks6.addAll(Arrays.asList("test2","test3"));


        drinks6.addAll(0, Arrays.asList("check1","check2"));
        System.out.println(drinks6);
    }


}
