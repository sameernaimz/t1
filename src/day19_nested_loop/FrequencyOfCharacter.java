package day19_nested_loop;

public class FrequencyOfCharacter {
    public static void main(String[] args) {


        String str = "apple";
        String checked = "";

        //OUTER LOOP
        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            int count = 0;
        if (checked.contains(letter + "")) {
            continue;
        }

            //INNER LOOP
            for (int j = 0; j < str.length(); j++) {

                char letter2 = str.charAt(j);

                if (letter == letter2) {
                    count++;
                }

            }

            System.out.println(letter + " - " + count);
            checked += letter;
        }
    }
}
