package day24_methods;


import java.util.Arrays;

public class LastCharacters2D {
    public static void main(String[] args) {

            String [][] words = {
                    {"James", "is","back"},
                    {"he", "was", "never", "gone"},
                    {"methods", "tommorow"}

            };
         System.out.println(Arrays.deepToString(words));

        System.out.println("-----------");
                //This is with foreach loop
            for (String [] eachArr: words) {
             //   eachArr -- > this is single array on each cycle
              //  System.out.println(eachArr); -->  not valid Array printing
             for (String eachElem : eachArr) {
                 //Another way to Convert each String into char Array and then get the last element
               //  System.out.print(eachElem.toCharArray()[eachElem.length() - 1]);
                 System.out.print(eachElem.charAt(eachElem.length() - 1));
             }

            }
        System.out.println("----------");
            // This is with fori loop
        for (int i = 0; i < words.length; i++) {
          //  words[i] -- SINGLE ARRAY EACH CYCLE
           // System.out.println(words[i]);

        for (int j = 0; j < words[i].length; j++) {

            // words[i][j] ---> String eachElem
               System.out.println(words[i][j].length()-1);

               //Another way to Convert each String into char Array and then get the last element
         //   System.out.println(words[i][j].toCharArray()[words[i][j].toCharArray().length-1]);

        }
            System.out.println();
        }
    }
}
