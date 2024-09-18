package practice;
/*Task #1

Create a method that solves the following task. And call it in the main method:

An array is given:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
it is necessary to output all odd numbers from the arra

 */
public class task1 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
   useArray(array);

    }

    public static void useArray (int [] arrays )  {
        for (int each : arrays) {
            if (each % 2 != 0) {
                System.out.println(each);
            }
        }
    }
}
