package day18_forloops;

public class CountHi {
    public static void main(String[] args) {

        String str = "aaahiahhhibbbccsss"; // hi
        //``          0123456789
        int count = 0;
// Loop through the string, but stop at length - 1 to avoid IndexOutOfBoundsException
        for (int index = 0; index < str.length()-1; index++) {

            if (str.charAt(index) == 'h' && str.charAt(index + 1) == 'i') {
                count++;

            }
        }
        System.out.println(count);
    }
}
