package day30_arrayList;

import day29_arrayList.ArrayListWithMethods;
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a method ArrayList of Strings and reverse each element
 */
public class ReverseAll {

    public static ArrayList<String> reverseAll(ArrayList<String> listToReverse) {
        ArrayList <String> reversed = new ArrayList <>();

       for (String each : listToReverse) {
//            String str = "";
//
//
//            for (int i = 0; i < each.length(); i++) {
//
//                str += each.charAt(i);
//            }
//            reversed.add(str);
        reversed.add(StringUtil.reverse(each));
        }

        return reversed;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ted","Talk", "learn"));

        System.out.println(list);

        System.out.println(reverseAll(list));

        //EXTRA REVERSE
        System.out.println(ArrayListWithMethods.getDaysOfWeek());
        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));



    }
}
