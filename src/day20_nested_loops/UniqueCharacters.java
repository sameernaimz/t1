package day20_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "ABCDDFGWOF&#)$";

        // Find the only the unique characters

        for (int i = 0; i < str.length(); i++) {

            char eachLetter1 = str.charAt(i); // O2 : String eachLetter1 = str.substring(i, i+1);
            int count = 0;


            for (int j = 0; j < str.length(); j++) {

                char eachLetter2 = str.charAt(j); //O2:  String eachLetter2 = str.substring(j, j+1);

                if (eachLetter1 == eachLetter2) { //O2:  eachLetter1.equals(eachLetter2) {
                    count++;
                }

            }
            if(count == 1) {
                System.out.print(eachLetter1);
            }
        }
    }
}
