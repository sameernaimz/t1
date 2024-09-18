package day10_if_statements;

public class IfElseExample {
    public static void main(String[] args) {
/*
        int score = 60;
        if(score >= 75) {
            System.out.println("Passing the exam");
        }
        if(score == 75) {
            System.out.println("Passing the exam!");
        }

        if(score < 75) {
            System.out.println("failing the exam");
        }
*/

        int score = 70;
        if (score >= 75) {
            System.out.println("Passing the exam!");
        } else {
            System.out.println("Failing the exam!");
        }

        //If Score is > 90 --> print excellent else print keep working
        //What happens if score is == 90
       //  What happens if score is < 90


        if (score >= 90) { // 70
            System.out.println("excellent");
        } else {
            System.out.println("Keep Working");
        }
        int year = 2029; //made it false so prints else statement
        boolean isLockdown = year == 2020 || year == 2021;

        if(isLockdown) { // true printed out
            System.out.println("Stay at home.");
            System.out.println("Practice CODING");
        } else {
            System.out.println("Go outside");
            System.out.println("meet with friends");

        }
    }
}
