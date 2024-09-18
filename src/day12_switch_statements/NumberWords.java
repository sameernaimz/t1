package day12_switch_statements;
/*
Take a number and print the number as the word version
 */
public class NumberWords {
    public static void main(String[] args) {

       int num = 3;
//            //Approach -1 IF Statements
//        if (num == 1) {
//            System.out.println("One");
//        } else if (num == 2) {
//            System.out.println("Two");
//        } else if (num == 3) {
//            System.out.println("Three");
//        } else if (num == 4) {
//            System.out.println("Four");
//        } else if (num == 5) {
//            System.out.println("Five");
//        } else {
//            System.out.println("Number has to be between 1 and 5");
//        }

        // Approach - 1
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Number is not Between 1 and 5");

        }
    }
}
