package day10_if_statements;

public class IfWithoutBrackets {
    public static void main(String[] args) {
        if ( 4 > 2) {
            System.out.println("Hello");
            System.out.println("Bye");
        }

        if(1 >2) System.out.println("hello2"); // YOU CAN DO THIS ONLY IF YOU HAVE 1 STATEMENT


        System.out.println("Bye2");

        if(10 % 5 == 0) {
            System.out.println("divisible");
            System.out.println("Google");
            int num = 2;
        } else {
            System.out.println("not divisible");
        }

        if(10 % 5 == 0) {
            System.out.println("divisible");
            System.out.println("Google");
        } else {
            System.out.println("not divisible");
            System.out.println("Testing"); //This does not have anything to do with if else above
     // We can CANNOT have just SINGLE ELSE
 //       } else {
 //           System.out.println("Bye3");
  //      }
        /*
            if(5 > 2)
            System.out.println("Loopcamp");
            else {
                System.out.println("Loopcamp2");
                System.out.println("Loopcamp3");
            }

         */

            /*
            if(5 > 2)
            System.out.println("Loopcamp");
              System.out.println("Loopcamp4");
            else { //This line will give an error because we CANNOT have single else
                System.out.println("Loopcamp2");

            }
             */

            /*
            if(5 > 2) {
            System.out.println("Loopcamp");
              System.out.println("Loopcamp4");
          }  else
                System.out.println("Loopcamp2");


             */
    }
}
}