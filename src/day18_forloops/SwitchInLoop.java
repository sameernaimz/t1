package day18_forloops;

public class SwitchInLoop {
    public static void main(String[] args) {

        //Switch: String, char, byte, short, int
        // a, e, i, o, u,

        for (int i = 0; i <= 5 ; i++) {

            // If number is 0 print zero, and so on.
            // this is with else-if ladder
            if(i == 0) {
                System.out.println("zero");
            } else if(i == 1) {
                System.out.println("one");
            } else if(i == 2) {
                System.out.println("two");
            }

            System.out.println("------");
            // switch

            switch (i) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;

            }
        }
    }
}
