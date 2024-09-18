package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Hello");
        listOne.add("Bye");

        ArrayList<String> listTwo = new ArrayList<>(listOne); //We added elements from listOne into ListTwo
        System.out.println(listTwo);
        listTwo.add("Hola");

        System.out.println();
        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println(listThree);

       // ArrayList<String> listFour = new ArrayList<>("One", "Two", "Three")); INVALID WAY TO DECLARE

    }
}
