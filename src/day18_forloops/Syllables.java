package day18_forloops;

/*
Syllables
    Given a String separated by dashes calculate how many syllables the words are
    Ex:
        Input:
            ja-va
        Output:
            2
 */

public class Syllables {
    public static void main(String[] args) {

        String str = "ja-va";
        int countDash = 0;

        for (int index = 0; index < str.length(); index++) {

            if(str.charAt(index) == '-') {
                countDash++;
            }
        }
        System.out.println("Number of syllables: " + (countDash+1));

    }
}
