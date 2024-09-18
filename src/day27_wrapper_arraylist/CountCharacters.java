package day27_wrapper_arraylist;

import java.util.ArrayList;

/*
 given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

aP3d572&*jd@jdJU
 */
public class CountCharacters {
    public static void main(String[] args) {

        String str = "aP3d572&*jd@jdJU";

        int upper = 0;
        int lower = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (Character.isUpperCase(each)) {
                upper++;
            } else if (Character.isLowerCase(each)) {
                lower++;
            } else if (Character.isDigit(each)) {
                digits++;

            } else {
                others++;
            }
        }
        System.out.println("Uppercase letters count: " + upper);
        System.out.println("Lowercase letters count: " + lower);
        System.out.println("Digit letters count: " + digits);
        System.out.println("Others letters count: " + others);

        System.out.println(Integer.MAX_VALUE); //These are not method. These are CONSTANTS which we will learn later
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }

    public static class RemoveExample {
        public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<>();
            System.out.println(list.size());

            //Let's add some data in it
            list.add("water");
           // list.add(3); //INVALID, because the datatype of my ArrayList is String.
            list.add("bread");
            list.add("juice");
            list.add("fruit");

            list.add(1, "rice");
            System.out.println(list); // [water, rice, bread, juice, fruit]

            list.remove(0);
            System.out.println(list); //[rice, bread, juice, fruit]

            System.out.println(list.remove(0));
            System.out.println(list); //[bread, juice, fruit]

            // remove the last one.
            list.remove(list.size()-1);
            System.out.println(list); // [bread, juice]

           // list.remove(12); //IndexOutOfBoundsException

            // remove by element
            list.remove("juice");
            System.out.println(list); // [bread]

            System.out.println(list.remove("water")); // SINCE THERE WAS NOT A MATCH IT RETURNED FALSE

            list.add("banana");
            list.add("banana");
            System.out.println(list);

            list.remove("banana"); //It will remove the first matched one
            System.out.println(list);
        }
    }
}
