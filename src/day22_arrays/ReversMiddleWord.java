package day22_arrays;

/*
    Have a sentence with 3 words
    reverse the middle word

    ex:
        java always fun

        output:
            java syawla fun
 */
public class ReversMiddleWord {
    public static void main(String[] args) {

        String str = "java always fun";

        String [] words = str.split(" "); // ["java" , "always", "fun"]

        char [] letters = words[1].toCharArray(); // ['a', 'l' , 'w' 'a' 'y' 's']
        String reversed = "";

        for (int i = 0; i < words.length-1; i++) {

            reversed += letters[i];

        }
        System.out.println(reversed);

        System.out.println(words[0] + " " + words[1] + " " + words[2] + " " + words[3]);

    }
}
