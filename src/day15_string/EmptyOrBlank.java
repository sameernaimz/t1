package day15_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "new example";
        System.out.println(str.isEmpty()); // It has characters. So --> false

        str = " ";

        System.out.println(str.isEmpty()); // it still has an empty character. So ---> false

        str = "";

        System.out.println(str.isEmpty()); // IT IS COMPLETELY EMPTY ---> No SINGLE CHARACTER --> SO, --> TRUE

        System.out.println(str.length()); // 0

        if(str.length() == 0) {
            System.out.println("No characters");
        }
        str = "";
        System.out.println("Is empty"+ str.isEmpty());
        System.out.println("Is blank" + str.isBlank()); // check if empty spaces

        str = "Hello World"; //Here we have characters other than empty space
        System.out.println(str.isBlank());

        str = " ";
        System.out.println(str.isBlank());

        str = "       ";
        System.out.println(str.isBlank());



    }
}
