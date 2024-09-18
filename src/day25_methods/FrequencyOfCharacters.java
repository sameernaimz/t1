package day25_methods;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "apple";
        char letter = 'p';


        int num = frequencyOfCharacters(word, letter);
        System.out.println(num);

        System.out.println(frequencyOfCharacters("lOOpcamp", 'O'));


    }

    public static int frequencyOfCharacters(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                count++;
            }

        }
        return count;
    }
}


