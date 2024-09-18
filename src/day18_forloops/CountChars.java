package day18_forloops;
/*
    Count upper, lower, and numbers
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4

        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
 */
public class CountChars {
    public static void main(String[] args) {
        String str = " 2juMp41EEkd4s4";
        int upperCount = 0;
        int lowerCount = 0;
        int numCount = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);


            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upperCount++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lowerCount++;
            } else if (eachLetter >= '0' && eachLetter <= '9') { // 0 is different than '0'
                numCount++;

            } else {

            }

        }
        System.out.println("(upperCount) = " + (upperCount));
        System.out.println("(lowerCount) = " + (lowerCount));
        System.out.println("(numCount) = " + (numCount));
        System.out.println("others = " + others);
    }
}
