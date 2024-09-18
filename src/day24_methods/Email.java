package day24_methods;

public class Email {
    public static void main(String[] args) {

        buildEmail("Micky", "gmail");
        buildEmail("TOM JERRY", "yahoo.com");
    }

    // Create a method that is called buildEmail that accepts two String parameters
    // Take the full and then take FIRST character of first name and full last name conconcanate with domain
    public static void buildEmail (String fulName, String domain) { // Non- parameterized Method.


            String email = fulName.toLowerCase().charAt(0)
                   + fulName.toLowerCase().substring(fulName.indexOf(" ") + 1) // m + mouse
                + "@"
                        + domain.toLowerCase(); // gmail


        System.out.println(email);
    }
}
