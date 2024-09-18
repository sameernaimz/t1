package diana_tasks;

import java.util.Scanner;

public class Has55Replit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        System.out.println(MaxOfArrayListString1(nums));
    }

    public static boolean MaxOfArrayListString1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {  // Iterate until the second-to-last element
            if (nums[i] == 5 && nums[i + 1] == 5) {  // Check current and next element
                return true;
            }
        }
        return false;
    }
}
