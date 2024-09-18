package day10_if_statements;

public class SingleIfStatement {
    public static void main(String[] args) {
        if(false) {
            System.out.println("Hello World"); // Since if condition is FALSE, the code block that belongs to if statement will NOT be EXECUTED

        }
        System.out.println("Second Print Statement"); // printed

        if(true) {
            System.out.println("Today is Wednesday!"); // printed
        }

        int score = 60;
        if(score >= 75) {
            System.out.println("Passing the exam!"); // FALSE
        }
        if(score < 75) {
            System.out.println("Failing the exam!");
        }

        int year = 2021;
        boolean isLockdown = year == 2020 || year == 2021; // true

        if(isLockdown) { // true printed out
            System.out.println("Stay at home.");
            System.out.println("Practice CODING");
        }

        if(!isLockdown) { // false ! not going to print out
            System.out.println("Stay at home.");
            System.out.println("Practice CODING");
        }
    }
}
