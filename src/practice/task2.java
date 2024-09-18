package practice;
/* Task #4

Create a method that solves the following task. And call it in the main method

An array is given:
int[] array = {9, 2, 6, 4, 5, 12, 7, 7, 8, 6};
it is necessary to output the sum of all values of the array. */
public class task2 {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 7, 8, 6};
        int sum = task2(array);
        System.out.println(sum);

    }
        public static int task2(int [] array) {

        int sum = 0;
        for (int number : array)
        sum += number;
        return sum;

                }

            }
