package day12_switch_statements;
    /*
    create a class Diver

    You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

        Above 90 - Your tank is full
        Above 80 - Still okay
        Above 70 - Don't go too far
        Above 60 - Start to head back
        Above 50 - Be careful now you are at 50%
    */
public class Diver {
    public static void main(String[] args) {

        int OxygenLevel = 80;
// YOU NEED TO BE CAREFUL WITH ORDER OF YOUR ELSE IF sequence
//        if(OxygenLevel > 50) {
//            System.out.println("Be careful");
//        } else if (OxygenLevel > 60 && OxygenLevel <= 80) {
//            System.out.println("Start to head back");
//        }

        if(OxygenLevel > 90) {
            System.out.println("Your tank is full");
        } else if (OxygenLevel > 80) {
            System.out.println("Still okay");
        } else if (OxygenLevel > 70) {
            System.out.println("Dont go too far");
        } else if (OxygenLevel > 60) {
            System.out.println("Start to head back");
        } else if (OxygenLevel > 50) {
            System.out.println("Be careful now your at 50%");
        } else {
            System.out.println("See you in heaven");
        }
    }
}
