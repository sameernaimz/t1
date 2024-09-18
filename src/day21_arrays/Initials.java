package day21_arrays;
/*
Initials
        • Given an array of classmate’s names, first name and last separated by a space, print the initials of everyone
            Ex:
            Input:
                [ "James Bond", "Eve Rell", "Anna Johnson" ]
            Output:
                JB ER AJ
 */
public class Initials {
    public static void main(String[] args) {

        String [] names = { "James Bond", "Eve Rell", "Anna Johnson" };

        //This is same but used foreach loop
        for (String each : names) {
            String eachFullName = each.trim();
            String eachLastName = eachFullName.substring(eachFullName.lastIndexOf(" ") + 1); // _Bond - _Rell

            System.out.println(eachFullName);
            System.out.println(eachLastName);


          String initial =  (eachFullName.charAt(0)+"").toUpperCase() + (eachLastName.charAt(0) + "").toUpperCase();
          System.out.println(initial);


        }
    }
}
