package day30_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 12, 9, 143, 4, 7 ,8 ,2));
        System.out.println(list);

        ArrayList <Integer> nums = new ArrayList<>(list);

//        for (Integer each : nums) {
//            if (each % 2 == 0) {
//                nums.remove(each);
//
//            }
//
//        }

        nums.removeIf(num -> num % 2 == 0);

        System.out.println(nums);


        ArrayList <Integer> nums2 = new ArrayList<>(list);
        nums2.removeIf(n -> n > 10);
        System.out.println(nums2);

        ArrayList <Integer> nums3 = new ArrayList<>(list);
        nums3.replaceAll(e -> e * 2);
    }
}
